package com.example.springrest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empleados")//en caso que la tabala sea diferente
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private double salario;

	enum Trabajo
	{
	    SC, PC;
	}
	
	Trabajo miTrabajo;
	
	public Empleado() {
		super();
		
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	
	
	public Empleado(Long id,String nombre, Trabajo miTrabajo, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.miTrabajo = miTrabajo;
		this.salario = salario;
	}
	
	
	
	//Getters y Setters
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTrabajo() {
		return trabajo;
	}


	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	//Metodo impresion de datos por consola


	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
	
	
	

	
	
	
	
	
	
	

}
