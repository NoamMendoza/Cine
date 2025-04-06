package com.estrenos.estrenos.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.estrenos.estrenos.models.Estreno;
import com.estrenos.estrenos.repositories.EstrenoRepository;

@Service
public class EstrenoService {
    private final EstrenoRepository estrenoRepository;

    public EstrenoService(EstrenoRepository estrenoRepository) {
        this.estrenoRepository = estrenoRepository;
    }
    public List<Estreno> getAllEstrenos() {
        return estrenoRepository.findAll();
    }
}
