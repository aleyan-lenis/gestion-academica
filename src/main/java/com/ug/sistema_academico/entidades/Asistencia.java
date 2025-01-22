package com.ug.sistema_academico.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    private String asistio; // Puedes cambiarlo a un tipo boolean si representa verdadero/falso
}
