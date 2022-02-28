package com.api.parkingcontrol.services.validations;

import com.api.parkingcontrol.controllers.exceptions.FieldMessage;
import com.api.parkingcontrol.dtos.input.ParkingSpotInsertDto;
import com.api.parkingcontrol.dtos.input.UserInsertDto;
import com.api.parkingcontrol.services.ParkingSpotService;
import com.api.parkingcontrol.services.UserService;
import com.api.parkingcontrol.services.validations.annotations.ParkingSpotInsert;
import com.api.parkingcontrol.services.validations.annotations.UserInsert;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class UserInsertValidator implements ConstraintValidator<UserInsert, UserInsertDto> {

    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(UserInsertDto objDto, ConstraintValidatorContext context) {

        List<FieldMessage> list = new ArrayList<>();

        userService.findByEmail(objDto.getEmail()).ifPresent(userModel -> {
            list.add(new FieldMessage("email", "email já existente"));
        });

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
