package com.example.recruitpro.service;

import com.example.recruitpro.dto.CandidateCreateDTO;
import com.example.recruitpro.dto.CandidateResponseDTO;
import com.example.recruitpro.dto.CandidateUpdateDTO;
import com.example.recruitpro.entity.Candidate;
import com.example.recruitpro.mapper.CandidateMapper;
import com.example.recruitpro.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;
    /**
     * @param candidateCreateDTO
     * @return
     */
    @Override
    public CandidateResponseDTO create(CandidateCreateDTO candidateCreateDTO) {

       Candidate candidate  = CandidateMapper.toEntity(candidateCreateDTO);
       Candidate saved = candidateRepository.save(candidate);
       return CandidateMapper.toResponse(saved) ;


    }

    /**
     * @param id
     * @param dto
     * @return
     */
    @Override
    @Transactional
    public CandidateResponseDTO updateProfile(Long id, CandidateUpdateDTO dto) {

        Candidate candidate = null;
        try {
            candidate = candidateRepository.findById(id)
                    .orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }
        candidate.setAddress(dto.getAddress().trim());
        candidate.setBio(dto.getBio() == null ? null : dto.getBio().trim());
        Candidate saved = candidateRepository.save(candidate);

        return CandidateMapper.toResponse(saved);

    }
}
