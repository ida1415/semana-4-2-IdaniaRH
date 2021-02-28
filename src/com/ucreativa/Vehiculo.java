/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Vehiculo implements Actor, ObjetoInerte {

	protected String color;
	protected String marca;
	private String tipoCombustible;
	
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
	 * @return the tipoCombustible
	 */
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	/**
	 * @param tipoCombustible the tipoCombustible to set
	 */
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public void arrancar() {
		System.out.println("Estoy arrancando un carro hibrido");
	}
	
	public void cambiarMarcha() {
		System.out.println("Pasando marchas y compresionando");
	}
	
	public void subirventanas() {
		System.out.println("Puedo subir las ventanas desde el cierre central");
	}
	
	/**
	 * @param color
	 * @param marca
	 * @param tipoCombustible
	 */
	public Vehiculo(String color, String marca, String tipoCombustible) {
		this.color = color;
		this.marca = marca;
		this.tipoCombustible = tipoCombustible;
	}
	
	@Override
	public void crear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destruir() {
		// TODO Auto-generated method stub
		System.out.println("Exploto BUM!");
		
	}
	@Override
	public void reciclar() {
		// TODO Auto-generated method stub
		
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
	public void desaparecer() {
		// TODO Auto-generated method stub
		System.out.println("Chao Vehiculo!");
		
	}
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", marca=" + marca + ", tipoCombustible=" + tipoCombustible
				+ "]";
	}
	
}
