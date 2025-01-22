package com.ug.sistema_academico.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreEstudiante;

    @ManyToOne
    @JoinColumn(name = "curso_id")  // Esto vincula el Estudiante a un Curso específico
    private Curso curso;
}
