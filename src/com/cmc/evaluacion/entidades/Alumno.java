package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Alumno {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Materia> materias= new ArrayList<>();
	private ArrayList<Nota> notas = new ArrayList<>();
	
	public Alumno(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public ArrayList<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
	
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void agregarMateria(Materia materia) {

		if (materia != null) {
				if (!materias.contains(materia)) {
					materias.add(materia);
				}
		}		
	}
	
	
	public void calificar(String codigo, double calificacion) {
		for (Materia materia : materias) {
			if (codigo != null && !codigo.equals("")) {
				if (materia.getCodigo().equals(codigo)) {
					Nota nota = new Nota(materia, calificacion);
					notas.add(nota);
				}
			}
		}
	}
	
}
