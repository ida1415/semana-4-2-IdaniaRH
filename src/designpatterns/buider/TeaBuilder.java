package designpatterns.buider;

public class TeaBuilder extends StarbucksBuilder{

	public TeaBuilder() {
		super();
		this.createStarbucks();
	}

	@Override
	public void buildSize() {
		this.starbucks.setSize("Pequenno");
		
	}

	@Override
	public void buildDrink() {
		this.starbucks.setDrink("Té chai");
		
	}

	@Override
	public String toString() {
		return "TeaBuilder [Drink= " + this.starbucks.drink +  "  Size= " + this.starbucks.size + "]";
	}
	
	

}
