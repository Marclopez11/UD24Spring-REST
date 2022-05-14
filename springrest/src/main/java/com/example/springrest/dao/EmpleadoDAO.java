package com.example.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrest.dto.Empleado;

public interface EmpleadoDAO  extends JpaRepository<Empleado, Long>{
	
	//Listar empleado por campo nombre

	public List<Empleado> findByNombre(String nombre);


}
