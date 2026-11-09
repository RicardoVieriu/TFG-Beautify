package com.beautify.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beautify.backend.model.Negocio;
import com.beautify.backend.repository.NegocioRepository;

@RestController
@RequestMapping("/api/negocios")
public class NegocioController {

    private final NegocioRepository negocioRepository;

    public NegocioController(NegocioRepository negocioRepository) {
        this.negocioRepository = negocioRepository;
    }

    // GET: Obtener todos los negocios
    @GetMapping
    public List<Negocio> obtenerTodos() {
        return negocioRepository.findAll();
    }

    // POST: Crear un nuevo negocio
    @PostMapping
    public Negocio crearNegocio(@RequestBody Negocio negocio) {
        return negocioRepository.save(negocio);
    }
}