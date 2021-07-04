package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Alumno;
import com.cmc.evaluacion.servicios.CentroEducativo;

public class TestPromedio {

	public static void main(String[] args) {
		CentroEducativo centroEducativo=new CentroEducativo();
		centroEducativo.agregarMateria("MATE", 6);
		centroEducativo.agregarMateria("CIENCIAS", 4);
		centroEducativo.agregarMateria("HISTORIA", 5);

		centroEducativo.matricular(new Alumno("1714616123", "Roberto", "Gomez"));
		centroEducativo.matricular(new Alumno("1714616108", "Martina", "Rosales"));
		centroEducativo.matricular(new Alumno("1714616147", "Bertha", "Cabral"));
		

		centroEducativo.asignarMateria("CEC", "1714616147");
		centroEducativo.asignarMateria("CEC", "1714616123");
		centroEducativo.asignarMateria("CEC", "1714616333");
		
		centroEducativo.asignarMateria("HSO", "1714616147");
		
		centroEducativo.asignarMateria("MTE", "1714616147");
		
		centroEducativo.calificar("CEC", "1714616147", 8);
		centroEducativo.calificar("CEC", "1714616147", 12);
		centroEducativo.calificar("CEC", "1714616147", 10);
		centroEducativo.calificar("CEC", "1714616147", 0);
		centroEducativo.calificar("HSO", "1714616147", 8);
		centroEducativo.calificar("MAT", "1714616147", 6);
		
		double promedio=centroEducativo.obtenerPromedio("1714616147", "CEC");
		System.out.println("Promedio CEC:"+promedio);
		 promedio=centroEducativo.obtenerPromedio("1714616147", "HSO");
		System.out.println("Promedio HSO:"+promedio);
	}

}
