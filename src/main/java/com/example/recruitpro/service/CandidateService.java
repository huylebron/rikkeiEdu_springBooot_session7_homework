package com.example.recruitpro.service;

import com.example.recruitpro.dto.CandidateCreateDTO;
import com.example.recruitpro.dto.CandidateResponseDTO;
import com.example.recruitpro.dto.CandidateUpdateDTO;
import com.example.recruitpro.entity.Candidate;

public interface CandidateService {

    CandidateResponseDTO create (CandidateCreateDTO candidateCreateDTO) ;


    CandidateResponseDTO updateProfile(Long id , CandidateUpdateDTO dto) ;

}
