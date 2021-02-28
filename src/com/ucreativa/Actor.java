/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public interface Actor {
	
	final String nombreArtistico = "Rebeca";
	public int anniosExperiencia = 6;
	public String tipo = "Principal";	
	
	abstract void actuar();
	
	abstract void divertir();
	
	abstract void desaparecer();
	
	static String identificador() {
		return "Yo soy un Actor";
	}	
}
