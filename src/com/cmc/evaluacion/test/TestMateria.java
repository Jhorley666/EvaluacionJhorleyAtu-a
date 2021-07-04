package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Materia;

public class TestMateria {
	public static void main(String[] args) {
		Materia materiaMate=new Materia("Mate","M01",20);
		materiaMate.imprimir();
		
		Materia materiaHistoria=new Materia("Historia","H02",25,8);
		materiaHistoria.imprimir();
		
		
		
		
	}
}
