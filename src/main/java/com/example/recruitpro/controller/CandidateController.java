package com.example.recruitpro.controller;

import com.example.recruitpro.dto.CandidateCreateDTO;
import com.example.recruitpro.dto.CandidateResponseDTO;
import com.example.recruitpro.dto.CandidateUpdateDTO;
import com.example.recruitpro.entity.Candidate;
import com.example.recruitpro.service.CandidateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
@RequiredArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CandidateResponseDTO create(@Valid @RequestBody CandidateCreateDTO dto) {
        return candidateService.create(dto);
    }

@PutMapping(value = "/update/{id}" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public CandidateResponseDTO update (

            @PathVariable Long id ,
            @Valid @ModelAttribute CandidateUpdateDTO dto


            ) {
        return candidateService.updateProfile(id, dto) ;
    }

}
