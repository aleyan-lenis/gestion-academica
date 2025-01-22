package com.ug.sistema_academico.servicios;


import org.springframework.stereotype.Service;

import com.ug.sistema_academico.entidades.Asistencia;
import com.ug.sistema_academico.repositorio.AsistenciaRepository;

import java.util.List;

@Service
public class AsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

    public AsistenciaService(AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    public List<Asistencia> findAll() {
        return asistenciaRepository.findAll();
    }

    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }
}
