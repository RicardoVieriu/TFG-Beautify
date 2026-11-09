package com.beautify.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beautify.backend.model.Negocio;

@Repository
public interface NegocioRepository extends JpaRepository<Negocio, Long> {
}