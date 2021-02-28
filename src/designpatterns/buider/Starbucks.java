package designpatterns.buider;

public class Starbucks {
	
	public String size;
	public String drink;

	public Starbucks() {
		size = "Mediano";
		drink = "Chocolate";
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @param drink the drink to set
	 */
	public void setDrink(String drink) {
		this.drink = drink;
	}

}
