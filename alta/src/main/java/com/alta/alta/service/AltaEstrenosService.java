package com.alta.alta.service;

import java.util.List;

import com.alta.alta.models.AltaEstrenos;
import com.alta.alta.repositories.AltaEstrenosRepository;

public class AltaEstrenosService {
    private final AltaEstrenosRepository altaRepository;
    public AltaEstrenosService(AltaEstrenosRepository altaRepository) {
        this.altaRepository = altaRepository;
    }
    public List<AltaEstrenos> getAllEstrenos() {
        return altaRepository.findAll();
    }
}
