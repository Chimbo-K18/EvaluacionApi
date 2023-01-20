/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ChimboKevin_PC15.service;

import com.ista.ChimboKevin_PC15.model.Asignatura;
import com.ista.ChimboKevin_PC15.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
/**
 *
 * @author matei
 */

@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura, Integer> implements AsignaturaService{
	
	@Autowired
	AsignaturaRepository asignaturaRepository;
        
        
	@Override
	public CrudRepository<Asignatura, Integer> getDao() {
		// TODO Auto-generated method stub
		return asignaturaRepository;
	}
	
}
