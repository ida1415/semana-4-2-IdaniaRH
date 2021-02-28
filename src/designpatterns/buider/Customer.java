package designpatterns.buider;

import com.ucreativa.Persona;
import com.ucreativa.Profesor;

public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args) throws InterruptedException{
		
		Waiter wat1 =  new Waiter();
		wat1.constructStarbucks();
		wat1.abrirStarbucks();
		System.out.println(wat1.toString());
		System.out.println();
		
		CoffeeBuilder coffee =  new CoffeeBuilder();
		coffee.buildDrink();
		coffee.buildSize();
		System.out.println(coffee.toString());
		System.out.println();
		
		TeaBuilder tea =  new TeaBuilder();
		tea.buildSize();
		tea.buildDrink();
		System.out.println(tea.toString());
		System.out.println();
		
		StarbucksBuilder coffee1 = new CoffeeBuilder ();
		coffee1.buildDrink();
		
		StarbucksBuilder tea1 = new TeaBuilder ();
		tea1.buildSize();
	}
}
