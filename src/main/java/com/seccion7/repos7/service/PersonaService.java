package com.seccion7.repos7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion7.repos7.model.Persona;
import com.seccion7.repos7.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardar(Persona persona){
        return personaRepository.create(persona);
       
    }
}
