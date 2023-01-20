/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ChimboKevin_PC15.controller;

import com.ista.ChimboKevin_PC15.model.Asignatura;
import com.ista.ChimboKevin_PC15.service.AsignaturaService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/asignatura")
/**
 *
 * @author matei
 */
public class AsignaturaController {

    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping("/listar")
    public ResponseEntity< List<Asignatura>> obtenerLista() {
        return new ResponseEntity<>(asignaturaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crear(@Valid @RequestBody Asignatura c) {
        Asignatura asig = asignaturaService.save(c);
        return new ResponseEntity<>(asig, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminar(@PathVariable Integer id) {
        asignaturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> actualizarUsuario(@PathVariable Integer id, @RequestBody Asignatura c) {
        Asignatura asignatura = asignaturaService.findById(id);
        if (asignatura == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                asignatura.setNombre_asignatura(c.getNombre_asignatura());
                asignatura.setCarrera(c.getCarrera());
                asignatura.setHora_inicio(c.getHora_inicio());
                asignatura.setHora_fin(c.getHora_fin());
                
                return new ResponseEntity<>(asignaturaService.save(asignatura), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }
}
