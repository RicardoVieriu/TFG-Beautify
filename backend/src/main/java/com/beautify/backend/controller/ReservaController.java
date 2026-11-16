package com.beautify.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beautify.backend.model.Reserva;
import com.beautify.backend.repository.ReservaRepository;

@RestController
@RequestMapping("/api/reservas")
@CrossOrigin(origins = "*")
public class ReservaController {

    private final ReservaRepository reservaRepository;

    public ReservaController(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @GetMapping("/negocio/{negocioId}")
    public List<Reserva> obtenerPorNegocio(@PathVariable Long negocioId) {
        return reservaRepository.findByNegocioId(negocioId);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Reserva> obtenerPorCliente(@PathVariable Long clienteId) {
        return reservaRepository.findByClienteId(clienteId);
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        if (reserva.getEstado() == null) {
            reserva.setEstado("CONFIRMADA");
        }
        return reservaRepository.save(reserva);
    }
}