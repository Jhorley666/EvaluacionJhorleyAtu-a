package com.cmc.evaluacion.entidades;

public class Nota {
	private Materia materia;
	private double valor;
	public Nota(Materia materia, double valor) {
		this.materia = materia;
		this.valor = valor;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
