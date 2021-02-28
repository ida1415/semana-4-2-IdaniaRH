/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Profesor extends Persona {
	
	private String correo;
	private int experiencia;
	private double salario;

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the experiencia
	 */
	public int getExperiencia() {
		return experiencia;
	}

	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * @param correo
	 * @param experiencia
	 * @param salario
	 */
	public Profesor(String nombre, int edad, String identificacion,String correo, int experiencia, double salario) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.correo = correo;
		this.experiencia = experiencia;
		this.salario = salario;
	}
	
	public void planear() {
		System.out.println("Estoy planeando");
	}
	
	public void darClase() {
		System.out.println("Dando Clase");
	}
	
	public void revisarTareaDos() {
		System.out.println("Recuerden que hay que entregarlo completo");
	}

	@Override
	public String toString() {
		return "Profesor [correo=" + correo + ", experiencia=" + experiencia + ", salario=" + salario + ", nombre="
				+ nombre + ", identificacion=" + identificacion + ", edad=" + edad + "]";
	}
}
