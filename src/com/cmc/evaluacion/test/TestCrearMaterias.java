package com.cmc.evaluacion.test;

import com.cmc.evaluacion.servicios.CentroEducativo;

public class TestCrearMaterias {

	public static void main(String[] args) {
		CentroEducativo centroEducativo=new CentroEducativo();
		centroEducativo.listarMaterias();
		
		centroEducativo.agregarMateria("MATE", 6);
		centroEducativo.agregarMateria("CIENCIAS", 4);
		centroEducativo.agregarMateria("HISTORIA", 5);
		
		centroEducativo.listarMaterias();
	}

}
