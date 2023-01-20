/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ista.ChimboKevin_PC15.repository;

import com.ista.ChimboKevin_PC15.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author matei
 */
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer>{
	
	@Query(value = "Select * from asignatura c where c.id_asignatura= :id_asignatura", nativeQuery = true)
	public Asignatura buscarAsignatura(String id_asignatura);
}
