package com.practice.springboot_restful_webservices.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @NotEmpty(message="User First name should not be null or empty")
    private String firstName;
    @NotEmpty
    private String lastName;
   // @Column(nullable = false, unique = true)
    @Email
    @NotEmpty
    private String email;
}
