package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Alumno;
import com.cmc.evaluacion.entidades.Materia;
import com.cmc.evaluacion.entidades.Nota;

public class CentroEducativo {
	private ArrayList<Alumno> alumnos = new ArrayList<>();
	private ArrayList<Materia> materias = new ArrayList<>();
	
	public boolean matricular(Alumno alumno) {
		boolean seMatriculo = false;	
		Alumno alumnoEncontrado = buscar(alumno.getCedula());
		
		if ( alumnoEncontrado != null) {
			System.out.println("No se puede matricular un alumno con la misma cédula");
			seMatriculo = false;	
		} else {
			alumnos.add(alumno);
			seMatriculo = true;
		}
		
		return seMatriculo;
	}
	
	public Alumno buscar(String cedula) {
		for(Alumno alumno : alumnos) {
			if (alumno != null) {
				if (alumno.getCedula().equals(cedula)) {
					return alumno;
				}
			}
		}
		return null;
	}
	
	public int obtenerCantidadAlumnos(){
		return alumnos.size();
	}
	
	public void imprimirMatriculados() {
		for (Alumno alumno : alumnos) {
			System.out.println(
						alumno.getCedula() +
						" " + alumno.getNombre() + 
						" " + alumno.getApellido()
					);	
		}
	}
	
	public void actualizarInformacion(Alumno alumno) {
		Alumno alumnoEncontrado = buscar(alumno.getCedula());
		if (alumnoEncontrado!=null) {
			alumnoEncontrado.setNombre(alumno.getNombre());
			alumnoEncontrado.setApellido(alumno.getApellido());
		}
	}
	
	public String generarCodigo(String codigo){
		if (codigo.length() >= 5) {
			codigo = codigo.substring(0, 1) + codigo.substring(2, 3) +
				     codigo.substring(4,  5);
		} else if (codigo.length() < 5 && codigo.length() >= 3) {
			codigo = codigo.substring(0, 3);
		} else {
			return null;
		}
		return codigo;
	}
	
	
	public void agregarMateria(String nombre, int min) {
		String codigo = generarCodigo(nombre);
		int maxAlumnos = min * 3;
		Materia materia = new Materia(nombre, codigo, maxAlumnos);
		materia.setMinimoAlumnos(min);
		materias.add(materia);
	}
	
	public void asignarMateria(String codigo, String cedula) {
		Materia materiaEncontrada = null;
		for (Materia materia : materias) {
			if (materia.getCodigo().equals(codigo)) {
				materiaEncontrada = materia;
			}
		}
		if (materiaEncontrada != null) {
			materiaEncontrada.setNumAlumnos(materiaEncontrada.getNumAlumnos() + 1);
			if (materiaEncontrada.getNumAlumnos() <= materiaEncontrada.getMaximoAlumnos()) {
				Alumno alumno = buscar(cedula);
				if (alumno != null) {
					alumno.agregarMateria(materiaEncontrada);
				}
			}		
		}

	}
	
	public ArrayList<Nota> obtenerNotasMateria(String cedula, String codigo) {
		Alumno alumno = buscar(cedula);
		ArrayList<Nota> notasM;
		notasM = new ArrayList<Nota>();
		for (Nota nota : alumno.getNotas()) {
			if (codigo!=null && !codigo.equals("")) {
				if (nota.getMateria().getCodigo().equals(codigo)) {
					notasM.add(nota);

				}
			}
		}
		return notasM;
	}
	
	public void calificar (String codigo, String cedula, double calificacion) {
		Alumno alumnoEncontrado = buscar(cedula);
		if (calificacion >= 0 && calificacion <= 10) {
			alumnoEncontrado.calificar(codigo, calificacion);
		} else {
			System.out.println("Nota fuera de rango");
		}
	}
	
	public double obtenerPromedio(String cedula, String codigo) {
		Alumno alumno = buscar(cedula);
		double promedio = 0.0;
		double numNotas = 0.0;
		for (Nota nota : alumno.getNotas()) {
			if (codigo!=null && !codigo.equals("")) {
				if (nota.getMateria().getCodigo().equals(codigo)) {
					numNotas++;
					promedio += nota.getValor();		
				}
			}
		}
		promedio /= numNotas;
		return promedio;
	}
	
	public ArrayList<Materia> reporteIncompletos() {
		ArrayList<Materia> noAgregadas;
	    noAgregadas = new ArrayList<>();
		for (Materia materia : materias) {
			if (materia.getNumAlumnos() < materia.getMinimoAlumnos()) {
				noAgregadas.add(materia);
			}
		}
		return noAgregadas;
	}
	
	public void listarMaterias(){
		for (Materia materia : materias) {
			materia.imprimir();
		}
	}
	
	
}
