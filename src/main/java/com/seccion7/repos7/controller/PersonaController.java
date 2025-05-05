package com.seccion7.repos7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion7.repos7.model.Persona;
import com.seccion7.repos7.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RequestMapping("/api/personas")
@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String saludar() {
        return "Holi funciona el Servicio";
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaService.guardar(persona);

    }
    
    
}
