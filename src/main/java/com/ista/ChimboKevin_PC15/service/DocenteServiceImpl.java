/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ChimboKevin_PC15.service;

import com.ista.ChimboKevin_PC15.model.Docente;
import com.ista.ChimboKevin_PC15.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
/**
 *
 * @author matei
 */

@Service
public class DocenteServiceImpl extends GenericServiceImpl<Docente, Integer> implements DocenteService{
	
	@Autowired
	DocenteRepository docenteRepository;
	
	@Override
	public CrudRepository<Docente, Integer> getDao() {
		// TODO Auto-generated method stub
		return docenteRepository;
	}
	
	public Docente buscarDocente(String id_docente) {
		return docenteRepository.buscarDocente(id_docente);
	}
}
