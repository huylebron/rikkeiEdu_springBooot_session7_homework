package com.example.recruitpro.service;

import com.example.recruitpro.dto.CandidateCreateDTO;
import com.example.recruitpro.entity.Candidate;
import com.example.recruitpro.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;
    /**
     * @param candidateCreateDTO
     * @return
     */
    @Override
    public Candidate create(CandidateCreateDTO candidateCreateDTO) {

        Candidate candidate = Candidate.builder()
                .fullName(candidateCreateDTO.getFullName().trim())
                .email(candidateCreateDTO.getEmail().trim())
                .age(candidateCreateDTO.getAge())
                .yearsOfExperience(candidateCreateDTO.getYearsOfExperience())
                .build();

        return candidateRepository.save(candidate) ;



    }
}
