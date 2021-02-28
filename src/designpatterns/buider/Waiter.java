package designpatterns.buider;

public class Waiter {
	
	public StarbucksBuilder starbucksBuilder;
	protected int capacidadMaxima = 30;
	protected String horario = "De 8 a 6";
	
	public Waiter() {
		starbucksBuilder = new StarbucksBuilder() {
			
			@Override
			void buildSize() {
				System.out.print("Soy mediano!");
				
			}
			
			@Override
			void buildDrink() {
				System.out.print("Soy café negro!");
			}
			
		};
	}
	
	public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
		this.starbucksBuilder = starbucksBuilder;
	}
	
	public Starbucks getStarbucksDrink() {
		return starbucksBuilder.starbucks;
	}
	
	public void constructStarbucks() {
		starbucksBuilder.createStarbucks();
	}
	
	public void abrirStarbucks () {
		System.out.println("La capacidad máxima es de: " + capacidadMaxima + " y tenemos un horario de: " + horario);
	}
	
	public void limpiarStarbucks() {
		System.out.println("Estoy está muy sucio!");
	}
	
	public void cerrarStarbucks() {
		System.out.println("Estoy cansado.");
	}

	@Override
	public String toString() {
		return "Waiter [capacidadMaxima= " + capacidadMaxima + ", horario= "+ horario + " Drink= " + this.starbucksBuilder.starbucks.drink +
				" Size= " + this.starbucksBuilder.starbucks.size  +"]";
	}

}
