package com.example.recruitpro.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateResponseDTO {

    private Long id ;
    private String fullName ;
    private String email ;
    private Integer age ;
    private Integer yearOfExperience ;

    private String address;
    private String bio;

}
