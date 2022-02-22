package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.ParkingSpotInsertDto;
import com.api.parkingcontrol.dtos.ParkingSpotUpdateDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
@Api(value = "API REST parkingSpot")
public class ParkingSpotControllerImpl {

    private final ParkingSpotService parkingSpotService;

    public ParkingSpotControllerImpl(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping
    @ApiOperation(value = "Realiza o salvamento de um vaga")
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotInsertDto parkingSpotDto){
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }

    @GetMapping
    @ApiOperation(value = "Retorna todas as vagas cadastradas com paginação")
    public ResponseEntity<Page<ParkingSpotModel>> getAllParkingSpots(@PageableDefault(page = 0, size = 10, direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.findAll(pageable));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna a vaga com base no ID")
    public ResponseEntity<Object> getParkingSpotModelById(@PathVariable(value = "id") UUID id){
        ParkingSpotModel parkingSpotModel = parkingSpotService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotModel);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta a vaga com base no ID")
    public ResponseEntity<Object> deleteParkingSpotModelById(@PathVariable(value = "id") UUID id){
        ParkingSpotModel parkingSpotModel = parkingSpotService.findById(id);
        parkingSpotService.delete(parkingSpotModel);
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Atualiza a vaga com base no ID")
    public ResponseEntity<ParkingSpotModel> updateParkingSpotModelById(@PathVariable(value = "id") UUID id,
                                                             @RequestBody @Valid ParkingSpotUpdateDto parkingSpotUpdateDto){
        ParkingSpotModel parkingSpotModel = parkingSpotService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.update(parkingSpotModel, parkingSpotUpdateDto));
    }

}
