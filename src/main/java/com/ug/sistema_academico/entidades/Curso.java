package com.ug.sistema_academico.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCurso;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;
}