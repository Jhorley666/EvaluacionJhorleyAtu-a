package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Alumno;
import com.cmc.evaluacion.servicios.CentroEducativo;

public class TestMatricular {
	public static void main(String[] args) {
		CentroEducativo centroEducativo=new CentroEducativo();
		System.out.println("Alumnos:"+centroEducativo.obtenerCantidadAlumnos());
		boolean resultado=centroEducativo.matricular(new Alumno("1714616123", "Roberto", "Gomez"));
		System.out.println(resultado+"--Alumnos:"+centroEducativo.obtenerCantidadAlumnos());
		centroEducativo.matricular(new Alumno("1714616108", "Martina", "Rosales"));
		System.out.println(resultado+"-----Alumnos:"+centroEducativo.obtenerCantidadAlumnos());
		centroEducativo.matricular(new Alumno("1714616123", "Bertha", "Cabral"));
		System.out.println(resultado+"-------Alumnos:"+centroEducativo.obtenerCantidadAlumnos());
		
	}
}
