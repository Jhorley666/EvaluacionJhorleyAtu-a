package com.cmc.evaluacion.test;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Alumno;
import com.cmc.evaluacion.entidades.Materia;
import com.cmc.evaluacion.servicios.CentroEducativo;

public class TestIncompletos {

	public static void main(String[] args) {
		CentroEducativo centroEducativo=new CentroEducativo();
		centroEducativo.agregarMateria("MATE", 2);
		centroEducativo.agregarMateria("CIENCIAS", 2);
		centroEducativo.agregarMateria("HISTORIA", 3);

		centroEducativo.matricular(new Alumno("1714616123", "Roberto", "Gomez"));
		centroEducativo.matricular(new Alumno("1714616108", "Martina", "Rosales"));
		centroEducativo.matricular(new Alumno("1714616147", "Bertha", "Cabral"));
		

		centroEducativo.asignarMateria("CEC", "1714616147");
		centroEducativo.asignarMateria("CEC", "1714616123");
		centroEducativo.asignarMateria("CEC", "1714616108");
		
		centroEducativo.asignarMateria("HSO", "1714616147");
		
		centroEducativo.asignarMateria("MAT", "1714616147");
		
		centroEducativo.listarMaterias();
		
		ArrayList<Materia> incompletos=centroEducativo.reporteIncompletos();
		Materia mat=null;
		System.out.println("--------------INCOMPLETOS------------");
		for(int i=0;i<incompletos.size();i++){
			mat=incompletos.get(i);
			mat.imprimir();
		}
	}

}
