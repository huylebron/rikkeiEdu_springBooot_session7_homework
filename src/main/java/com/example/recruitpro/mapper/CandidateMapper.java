package com.example.recruitpro.mapper;

import com.example.recruitpro.dto.CandidateCreateDTO;
import com.example.recruitpro.dto.CandidateResponseDTO;
import com.example.recruitpro.entity.Candidate;

public final  class CandidateMapper {

    private CandidateMapper() {}

    public static Candidate toEntity(CandidateCreateDTO dto) {
        return Candidate.builder()
                .fullName(dto.getFullName().trim())
                .email(dto.getEmail().trim())
                .age(dto.getAge())
                .yearsOfExperience(dto.getYearsOfExperience())
                .build();
    }

    public static CandidateResponseDTO toResponse(Candidate entity) {

        return CandidateResponseDTO.builder()
                .id(entity.getId())
                .fullName(entity.getFullName())
                .email(entity.getEmail())
                .age(entity.getAge())
                .yearOfExperience(entity.getYearsOfExperience())
                .address(entity.getAddress())
                .bio(entity.getBio())
                .build();

    }


}
