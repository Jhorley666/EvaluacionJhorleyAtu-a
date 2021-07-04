package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Alumno;
import com.cmc.evaluacion.servicios.CentroEducativo;

public class TestActualizarInformacion {
	public static void main(String[] args) {
		CentroEducativo centroEducativo=new CentroEducativo();

		centroEducativo.matricular(new Alumno("1714616123", "Roberto", "Gomez"));
		centroEducativo.matricular(new Alumno("1714616109", "Teresa", "Ronquillo"));
		centroEducativo.matricular(new Alumno("1714616155", "Melinda", "Florez"));
		
		System.out.println("----Estado inicial");
		centroEducativo.imprimirMatriculados();
		centroEducativo.actualizarInformacion(new Alumno("123123","Jose","Valencia"));
		System.out.println("------Luego de modificar primera vez");
		centroEducativo.imprimirMatriculados();
		System.out.println("------Luego de modificar segunda vez");
		centroEducativo.actualizarInformacion(new Alumno("1714616109","Teresita","Roncon"));
		centroEducativo.imprimirMatriculados();
		
	}
}
