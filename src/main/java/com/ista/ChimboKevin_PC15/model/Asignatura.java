/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ChimboKevin_PC15.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author matei
 */
@Entity
@Getter
@Setter
@Table(name = "asignatura")

public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Integer id_asignatura;

    @Column(name = "nombre_asignatura")
    private String nombre_asignatura;

    @Column(name = "carrera")
    private String carrera;

    @Column(name = "hora_inicio")
    private String hora_inicio;
    
    @Column(name = "hora_fin")
    private String hora_fin;
    
    @JsonIgnore
        @OneToMany(mappedBy = "asignatura")
        private List<Docente> docentes;
}
