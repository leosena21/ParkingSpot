package com.api.parkingcontrol.dtos.input;

import com.api.parkingcontrol.services.validations.annotations.ParkingSpotInsert;
import com.api.parkingcontrol.services.validations.annotations.UserInsert;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@UserInsert
public class UserInsertDto {

    @NotBlank(message = "Nome não pode ser nullo")
    private String name;

    @Column(nullable = false, unique = true)
    @Email(message = "Não corresponde a um email")
    private String email;

    @NotBlank(message = "Senha não pode ser nullo")
    @Size(min = 4, message = "Minimo de 4 caracteres")
    private String password;
}
