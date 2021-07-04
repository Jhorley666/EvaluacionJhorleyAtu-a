package com.cmc.evaluacion.test;

import com.cmc.evaluacion.servicios.CentroEducativo;

public class TestGenerarCodigo {

	public static void main(String[] args) {
		CentroEducativo centro=new CentroEducativo();
		String codigo=centro.generarCodigo("HISTORIA");
		System.out.println(codigo);
		codigo=centro.generarCodigo("MATE");
		System.out.println(codigo);
		codigo=centro.generarCodigo("CIENCIAS");
		System.out.println(codigo);
		codigo=centro.generarCodigo("RELIG");
		System.out.println(codigo);
		codigo=centro.generarCodigo("AB");
		System.out.println(codigo);
		
	}

}
