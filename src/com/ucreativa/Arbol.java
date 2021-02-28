/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Arbol extends Vegetal implements Actor {

	private String marca;
	private String nombreCientifico;
	private double atributo1;
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the nombreCientifico
	 */
	public String getNombreCientifico() {
		return nombreCientifico;
	}

	/**
	 * @param nombreCientifico the nombreCientifico to set
	 */
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	/**
	 * @return the atributo1
	 */
	public double getAtributo1() {
		return atributo1;
	}

	/**
	 * @param atributo1 the atributo1 to set
	 */
	public void setAtributo1(double atributo1) {
		this.atributo1 = atributo1;
	}

	public void metodo1() {
		System.out.println("Metodo 1");
	}
	
	public void metodo2() {
		System.out.println("Metodo 2");
	}
	public void metodo3() {
		System.out.println("Metodo 3");
	}
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 * @param marca
	 * @param nombreCientifico
	 * @param atributo1
	 */
	public Arbol(String nombre, String tipo, String color, String marca, String nombreCientifico, double atributo1) {
		super(nombre, tipo, color);
		this.marca = marca;
		this.nombreCientifico = nombreCientifico;
		this.atributo1 = atributo1;
	}

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public void mostrarse() {
		System.out.println("Aparecio el Arbol");
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}

	@Override
	public void florear() {
		// TODO Auto-generated method stub
		super.florear();
	}
	
	public void florear(String detalle) {
		System.out.println("Poli poli");
	}

	@Override
	public String toString() {
		return "Arbol [marca=" + marca + ", nombreCientifico=" + nombreCientifico + ", atributo1=" + atributo1 + " nombre =" + nombre +"]";
	}



}
