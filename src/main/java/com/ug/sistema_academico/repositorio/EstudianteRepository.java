package com.ug.sistema_academico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ug.sistema_academico.entidades.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
