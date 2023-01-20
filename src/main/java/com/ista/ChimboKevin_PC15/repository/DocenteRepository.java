/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ista.ChimboKevin_PC15.repository;

import com.ista.ChimboKevin_PC15.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author matei
 */
public interface DocenteRepository extends JpaRepository<Docente, Integer>{
	
	@Query(value = "Select * from docente c where c.id_docente= :id_docente", nativeQuery = true)
	public Docente buscarDocente(String id_docente);
}
