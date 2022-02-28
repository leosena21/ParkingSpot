package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.input.UserInsertDto;
import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserControllerImp {

    private final UserService userService;


    public UserControllerImp(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Page<UserModel>> findAll(@PageableDefault(page = 0, size = 10, direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findById(@PathVariable("id") UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UserModel> insert(@RequestBody @Valid UserInsertDto userInsertDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.newUser(userInsertDto));
    }
}
