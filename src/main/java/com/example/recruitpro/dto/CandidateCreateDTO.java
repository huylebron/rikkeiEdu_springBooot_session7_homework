package com.example.recruitpro.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateCreateDTO {
    @NotBlank ( message = "fullname không để trống")
    @Size(min = 5 , max = 50, message = "fullName có 5 - 5- lí tự ")
    private  String fullName ;

    @NotBlank( message = "email không được đẻ trống ")
    @Email(message = "emall đúng định dạg")
    private String email ;

    @NotNull(message = "age không được để trống")
    @Min(value = 18, message = "age phải >= 18")
    private Integer age;

    @NotNull(message = "yearsOfExperience không được để trống")
    @Min(value = 0, message = "yearsOfExperience phải >= 0")
    private Integer yearsOfExperience;
}

