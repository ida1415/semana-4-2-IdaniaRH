/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Vegetal {
	
	protected String nombre;
	protected String tipo;
	protected String color;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 */
	public Vegetal(String nombre, String tipo, String color) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
	}
	
	public void mostrarse() {
		//Me mostre
		System.out.println("HOLA!");
	}
	
	public void desaparecer() {
		System.out.println("Chao!");
	}
	
	public void florear() {
		System.out.println("Pum, flores!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hola mis propiedades son" + 
				" Nombre: " + this.nombre + 
				" Tipo: " + this.tipo + 
				" Color: " + this.color; 
	}
}
