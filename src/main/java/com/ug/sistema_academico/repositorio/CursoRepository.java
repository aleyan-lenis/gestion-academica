package com.ug.sistema_academico.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ug.sistema_academico.entidades.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
