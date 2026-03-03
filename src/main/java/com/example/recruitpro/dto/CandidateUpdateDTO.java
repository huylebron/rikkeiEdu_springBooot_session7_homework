package com.example.recruitpro.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateUpdateDTO {
@NotBlank(message = "address không được để trống ")
    private String address ;
@Size( max = 200 , message = "bio tối đa 200 ký tự ")
    private String bio ;

}
