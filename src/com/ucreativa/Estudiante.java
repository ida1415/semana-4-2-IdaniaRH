/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Estudiante extends Persona{

	private String grado;
	private String materia;
	private int cantidadCuadernos;
	/**
	 * @return the grado
	 */
	public String getGrado() {
		return grado;
	}
	/**
	 * @param grado the grado to set
	 */
	public void setGrado(String grado) {
		this.grado = grado;
	}
	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}
	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}
	/**
	 * @return the cantidadCuadernos
	 */
	public int getCantidadCuadernos() {
		return cantidadCuadernos;
	}
	/**
	 * @param cantidadCuadernos the cantidadCuadernos to set
	 */
	public void setCantidadCuadernos(int cantidadCuadernos) {
		this.cantidadCuadernos = cantidadCuadernos;
	}
	
	/**
	 * @param correo
	 * @param experiencia
	 * @param salario
	 */
	public Estudiante(String nombre, int edad, String identificacion,String grado, String materia, int cantidadCuadernos) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.grado = grado;
		this.materia = materia;
		this.cantidadCuadernos = cantidadCuadernos;
	}
	
	public void estudiar() {
		System.out.println("Estoy estudiando");
	}
	
	public void recibirClase() {
		System.out.println("Recibiendo Clase");
	}
	
	public void terminarTareaDos() {
		System.out.println("La tarea está muy larga y dificil");
	}

	@Override
	public String toString() {
		return "Estudiante [grado=" + grado + ", materia=" + materia + ", cantidadCuadernos=" + cantidadCuadernos
				+ "]";
	}
}
