package com.api.parkingcontrol.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.api.parkingcontrol.dtos.input.ParkingSpotUpdateDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.exceptions.ObjectNotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ParkingSpotService.class})
@ExtendWith(SpringExtension.class)
class ParkingSpotServiceTest {

    @MockBean
    private ParkingSpotRepository parkingSpotRepository;

    @Autowired
    private ParkingSpotService parkingSpotService;

    @Test
    void testSave() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        when(this.parkingSpotRepository.save(any())).thenReturn(parkingSpotModel);

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(UUID.randomUUID());
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertSame(parkingSpotModel, this.parkingSpotService.save(parkingSpotModel1));
        verify(this.parkingSpotRepository).save(any());
    }

    @Test
    void testSave2() {
        when(this.parkingSpotRepository.save(any())).thenThrow(new ObjectNotFoundException("Msg"));

        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        assertThrows(ObjectNotFoundException.class, () -> this.parkingSpotService.save(parkingSpotModel));
        verify(this.parkingSpotRepository).save(any());
    }

    @Test
    void testFindAll() {
        PageImpl<ParkingSpotModel> pageImpl = new PageImpl<>(new ArrayList<>());
        when(this.parkingSpotRepository.findAll((org.springframework.data.domain.Pageable) any())).thenReturn(pageImpl);
        Page<ParkingSpotModel> actualFindAllResult = this.parkingSpotService.findAll(null);
        assertSame(pageImpl, actualFindAllResult);
        assertTrue(actualFindAllResult.toList().isEmpty());
        verify(this.parkingSpotRepository).findAll((org.springframework.data.domain.Pageable) any());
    }

    @Test
    void testFindAll2() {
        when(this.parkingSpotRepository.findAll((org.springframework.data.domain.Pageable) any()))
                .thenThrow(new ObjectNotFoundException("Msg"));
        assertThrows(ObjectNotFoundException.class, () -> this.parkingSpotService.findAll(null));
        verify(this.parkingSpotRepository).findAll((org.springframework.data.domain.Pageable) any());
    }

    @Test
    void testExistByLicensePlateCar() {
        when(this.parkingSpotRepository.existsByLicensePlateCar(any())).thenReturn(true);
        assertTrue(this.parkingSpotService.existByLicensePlateCar("License Plate Car"));
        verify(this.parkingSpotRepository).existsByLicensePlateCar(any());
    }

    @Test
    void testExistByLicensePlateCar2() {
        when(this.parkingSpotRepository.existsByLicensePlateCar(any())).thenReturn(false);
        assertFalse(this.parkingSpotService.existByLicensePlateCar("License Plate Car"));
        verify(this.parkingSpotRepository).existsByLicensePlateCar(any());
    }

    @Test
    void testExistByLicensePlateCar3() {
        when(this.parkingSpotRepository.existsByLicensePlateCar(any()))
                .thenThrow(new ObjectNotFoundException("Msg"));
        assertThrows(ObjectNotFoundException.class,
                () -> this.parkingSpotService.existByLicensePlateCar("License Plate Car"));
        verify(this.parkingSpotRepository).existsByLicensePlateCar(any());
    }

    @Test
    void testFindByLicensePlateCar() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        Optional<ParkingSpotModel> ofResult = Optional.of(parkingSpotModel);
        when(this.parkingSpotRepository.findByLicensePlateCar(any())).thenReturn(ofResult);
        Optional<ParkingSpotModel> actualFindByLicensePlateCarResult = this.parkingSpotService
                .findByLicensePlateCar("License Plate Car");
        assertSame(ofResult, actualFindByLicensePlateCarResult);
        assertTrue(actualFindByLicensePlateCarResult.isPresent());
        verify(this.parkingSpotRepository).findByLicensePlateCar(any());
    }

    @Test
    void testFindByLicensePlateCar2() {
        when(this.parkingSpotRepository.findByLicensePlateCar(any()))
                .thenThrow(new ObjectNotFoundException("Msg"));
        assertThrows(ObjectNotFoundException.class,
                () -> this.parkingSpotService.findByLicensePlateCar("License Plate Car"));
        verify(this.parkingSpotRepository).findByLicensePlateCar(any());
    }

    @Test
    void testExistByParkingSpotNumber() {
        when(this.parkingSpotRepository.existsByParkingSpotNumber(any())).thenReturn(true);
        assertTrue(this.parkingSpotService.existByParkingSpotNumber("42"));
        verify(this.parkingSpotRepository).existsByParkingSpotNumber(any());
    }

    @Test
    void testExistByParkingSpotNumber2() {
        when(this.parkingSpotRepository.existsByParkingSpotNumber(any())).thenReturn(false);
        assertFalse(this.parkingSpotService.existByParkingSpotNumber("42"));
        verify(this.parkingSpotRepository).existsByParkingSpotNumber(any());
    }

    @Test
    void testExistByParkingSpotNumber3() {
        when(this.parkingSpotRepository.existsByParkingSpotNumber(any()))
                .thenThrow(new ObjectNotFoundException("Msg"));
        assertThrows(ObjectNotFoundException.class, () -> this.parkingSpotService.existByParkingSpotNumber("42"));
        verify(this.parkingSpotRepository).existsByParkingSpotNumber(any());
    }

    @Test
    void testExistsByApartmentAndBlock() {
        when(this.parkingSpotRepository.existsByApartmentAndBlock(any(), any())).thenReturn(true);
        assertTrue(this.parkingSpotService.existsByApartmentAndBlock("Apartment", "Block"));
        verify(this.parkingSpotRepository).existsByApartmentAndBlock(any(), any());
    }

    @Test
    void testExistsByApartmentAndBlock2() {
        when(this.parkingSpotRepository.existsByApartmentAndBlock(any(), any())).thenReturn(false);
        assertFalse(this.parkingSpotService.existsByApartmentAndBlock("Apartment", "Block"));
        verify(this.parkingSpotRepository).existsByApartmentAndBlock(any(), any());
    }

    @Test
    void testExistsByApartmentAndBlock3() {
        when(this.parkingSpotRepository.existsByApartmentAndBlock(any(), any()))
                .thenThrow(new ObjectNotFoundException("Msg"));
        assertThrows(ObjectNotFoundException.class,
                () -> this.parkingSpotService.existsByApartmentAndBlock("Apartment", "Block"));
        verify(this.parkingSpotRepository).existsByApartmentAndBlock(any(), any());
    }

    @Test
    void testFindById() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        Optional<ParkingSpotModel> ofResult = Optional.of(parkingSpotModel);
        when(this.parkingSpotRepository.findById(any())).thenReturn(ofResult);
        assertSame(parkingSpotModel, this.parkingSpotService.findById(UUID.randomUUID()));
        verify(this.parkingSpotRepository).findById(any());
    }

    @Test
    void testFindById2() {
        when(this.parkingSpotRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(ObjectNotFoundException.class, () -> this.parkingSpotService.findById(UUID.randomUUID()));
        verify(this.parkingSpotRepository).findById(any());
    }

    @Test
    void testFindById3() {
        when(this.parkingSpotRepository.findById(any()))
                .thenThrow(new ObjectNotFoundException("ParkingSpotModel id: "));
        assertThrows(ObjectNotFoundException.class, () -> this.parkingSpotService.findById(UUID.randomUUID()));
        verify(this.parkingSpotRepository).findById(any());
    }

    @Test
    void testDelete() {
        doNothing().when(this.parkingSpotRepository).delete(any());

        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        this.parkingSpotService.delete(parkingSpotModel);
        verify(this.parkingSpotRepository).delete(any());
    }

    @Test
    void testDelete2() {
        doThrow(new ObjectNotFoundException("Msg")).when(this.parkingSpotRepository).delete(any());

        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        assertThrows(ObjectNotFoundException.class, () -> this.parkingSpotService.delete(parkingSpotModel));
        verify(this.parkingSpotRepository).delete(any());
    }

    @Test
    void testUpdate() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Yellow");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        when(this.parkingSpotRepository.save(any())).thenReturn(parkingSpotModel);

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("BLACK");
        parkingSpotModel1.setId(UUID.randomUUID());
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");

        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Yellow");
        parkingSpotUpdateDto.setId(UUID.randomUUID());
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        assertSame(parkingSpotModel, this.parkingSpotService.update(parkingSpotModel1, parkingSpotUpdateDto));
        verify(this.parkingSpotRepository).save(any());
        assertEquals("Model Car", parkingSpotModel1.getModelCar());
        assertEquals("License Plate Car", parkingSpotModel1.getLicensePlateCar());
        assertEquals("Yellow", parkingSpotModel1.getColorCar());
        assertEquals("Brand Car", parkingSpotModel1.getBrandCar());
    }
}
