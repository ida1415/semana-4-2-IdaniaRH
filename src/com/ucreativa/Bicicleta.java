/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Bicicleta extends Vehiculo {
 
	private String pedales;
	private String trasmision;
	private int cantidadCambios;
	/**
	 * @return the marca
	 */
	public String getPedales() {
		return pedales;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setPedales(String pedales) {
		this.pedales = pedales;
	}
	/**
	 * @return the trasmision
	 */
	public String getTrasmision() {
		return trasmision;
	}
	/**
	 * @param trasmision the trasmision to set
	 */
	public void setTrasmision(String trasmision) {
		this.trasmision = trasmision;
	}
	/**
	 * @return the cantidadCambios
	 */
	public int getCantidadCambios() {
		return cantidadCambios;
	}
	/**
	 * @param cantidadCambios the cantidadCambios to set
	 */
	public void setCantidadCambios(int cantidadCambios) {
		this.cantidadCambios = cantidadCambios;
	}
	
	//Methods
	public void cambiarPlato() {
		System.out.println("Cambiar al segundo plato");
	}
	
	public void frenar() {
		System.out.println("Frenar la bicicleta");
	}
	public void subirAsiento() {
		System.out.println("Subir el asiento de la bicileta");
	}
	/**
	 * @param color
	 * @param marca
	 * @param tipoCombustible
	 * @param marca2
	 * @param trasmision
	 * @param cantidadCambios
	 */
	public Bicicleta(String color, String marca, String tipoCombustible, String pedales, String trasmision,
			int cantidadCambios) {
		super(color, marca, tipoCombustible);
		this.pedales = pedales;
		this.trasmision = trasmision;
		this.cantidadCambios = cantidadCambios;
	}
	
	@Override
	public String toString() {
		return "Bicicleta [Pedales =" + pedales + ", trasmision=" + trasmision + ", cantidadCambios=" + cantidadCambios
				+ ", marca= " + marca +"]";
	}
}
