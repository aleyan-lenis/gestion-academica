package com.ug.sistema_academico.controlador;


import org.springframework.web.bind.annotation.*;

import com.ug.sistema_academico.entidades.Asistencia;
import com.ug.sistema_academico.servicios.AsistenciaService;

import java.util.List;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {

    private final AsistenciaService asistenciaService;

    public AsistenciaController(AsistenciaService asistenciaService) {
        this.asistenciaService = asistenciaService;
    }

    @GetMapping
    public List<Asistencia> getAll() {
        return asistenciaService.findAll();
    }

    @PostMapping
    public Asistencia create(@RequestBody Asistencia asistencia) {
        return asistenciaService.save(asistencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        asistenciaService.deleteById(id);
    }
}
