package com.example.springrest.service;

import java.util.List;

import com.example.springrest.dto.Empleado;


public interface EmpleadoService {
	
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un Empleado CREATE
	
	public Empleado empleadoXID(Long id); //Leer datos de un Empleado READ
	
	public List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Empleado por campo nombre
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del Empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el Empleado DELETE


}
