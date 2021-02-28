/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Coche extends Vehiculo{

	private String anno;
	private String materialConstruccion;
	private int cantidadRuedas;
	/**
	 * @return the anno
	 */
	public String getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(String anno) {
		this.anno = anno;
	}
	/**
	 * @return the materialConstruccion
	 */
	public String getMaterialConstruccion() {
		return materialConstruccion;
	}
	/**
	 * @param materialConstruccion the materialConstruccion to set
	 */
	public void setMaterialConstruccion(String materialConstruccion) {
		this.materialConstruccion = materialConstruccion;
	}
	/**
	 * @return the cantidadRuedas
	 */
	public int getCantidadRuedas() {
		return cantidadRuedas;
	}
	/**
	 * @param cantidadRuedas the cantidadRuedas to set
	 */
	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
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
	 * @param color
	 * @param marca
	 * @param tipoCombustible
	 * @param anno
	 * @param materialConstruccion
	 * @param cantidadRuedas
	 */
	public Coche(String color, String marca, String tipoCombustible, String anno, String materialConstruccion,
			int cantidadRuedas) {
		super(color, marca, tipoCombustible);
		this.anno = anno;
		this.materialConstruccion = materialConstruccion;
		this.cantidadRuedas = cantidadRuedas;
	}

	@Override
	public String toString() {
		return "Coche [anno=" + anno + ", materialConstruccion=" + materialConstruccion + ", cantidadRuedas="
				+ cantidadRuedas + ", Color=" + color +"]";
	}

	
	
}
