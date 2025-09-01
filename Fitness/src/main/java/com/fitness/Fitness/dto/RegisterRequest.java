package com.fitness.Fitness.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email should not be blank")
    @Email(message = "Email is not of proper format")
    private String email;
    @NotBlank(message = "Password should not be empty")
    @Size(min = 6, message = "Password should be minimum 6 words size")
    private String password;
    private String firstName;
    private String lastName;

}
