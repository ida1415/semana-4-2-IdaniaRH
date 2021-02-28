/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Arbusto extends Vegetal implements Actor {

	private String olor;
	private String sabor;
	private int altura;
	/**
	 * @return the olor
	 */
	public String getOlor() {
		return olor;
	}
	/**
	 * @param olor the olor to set
	 */
	public void setOlor(String olor) {
		this.olor = olor;
	}
	/**
	 * @return the sabor
	 */
	public String getSabor() {
		return sabor;
	}
	/**
	 * @param sabor the sabor to set
	 */
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	//Methods
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
	 * @param olor
	 * @param sabor
	 * @param altura
	 */
	public Arbusto(String nombre, String tipo, String color, String olor, String sabor, int altura) {
		super(nombre, tipo, color);
		this.olor = olor;
		this.sabor = sabor;
		this.altura = altura;
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
	public void mostrarse() {
		// TODO Auto-generated method stub
		System.out.println("Aparecio el arbusto de lavanda");
	}
	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}
	@Override
	public void florear() {
		// TODO Auto-generated method stub
		System.out.println("Es lavanda");
	}
	
	@Override
	public String toString() {
		return "Arbusto [Olor:" + olor + " , Sabor=" + sabor + ", Altura:" + altura + " , Nombre: "+ nombre +"]";
	}
	
}
