package designpatterns.buider;

public abstract class StarbucksBuilder  {
	
	public Starbucks starbucks;
	
	
	public StarbucksBuilder() {
		
	}
	
	public Starbucks getStarbucks() {
		return starbucks;
	};
	
	public void createStarbucks() {
		starbucks = new Starbucks();
	};
	
	abstract void buildSize();
	
	abstract void buildDrink();

	
}
