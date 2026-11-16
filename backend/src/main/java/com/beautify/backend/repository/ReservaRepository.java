package com.beautify.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beautify.backend.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByNegocioId(Long negocioId);
    List<Reserva> findByClienteId(Long clienteId);
}