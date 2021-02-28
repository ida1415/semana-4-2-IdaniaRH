package designpatterns.buider;

public class CoffeeBuilder extends StarbucksBuilder {

	public CoffeeBuilder() {
		super();
		this.createStarbucks();
	}

	@Override
	public void buildSize() {
		this.starbucks.setSize("Grande");
	}

	@Override
	public void buildDrink() {
		this.starbucks.setDrink("Cafe con leche");
		
	}

	@Override
	public String toString() {
		return "CofferBuilder [Drink= " + this.starbucks.drink +  "  Size= " + this.starbucks.size + "]";
	}
	
}
