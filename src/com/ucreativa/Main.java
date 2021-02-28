package com.ucreativa;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String [] args) throws InterruptedException{
		
		Arbol arb1 = new Arbol ("Culantro","tipo1","Verde","Epa","Ciencia",3.3);
		arb1.florear();
		arb1.setNombre("Manzano");
		System.out.println(arb1.toString());
		System.out.println();
		
		Arbusto arbus1 =  new Arbusto ("Lavanda", "Hierba", "Morado", "Lavanda con Vainilla", "Muy fuerte", 1);
		arbus1.mostrarse();
		arbus1.setNombre("Ahora soy canela");
		System.out.println(arbus1.toString());
		System.out.println();
		
		Vegetal veg1 =  new Vegetal ("Chayote", "Verdura","Verde");
		veg1.florear();
		veg1.setColor("Blanco");
		System.out.println(veg1.toString());
		System.out.println();
		
		Vehiculo vehi1 =  new Vehiculo ("Gris", "Toyota", "Gasolina");
		vehi1.arrancar();
		vehi1.setMarca("BMW");
		System.out.println(vehi1.toString());
		System.out.println();
		
		Coche coche1 =  new Coche ("Verde", "Patitos", "No ocupa", "Anno 2020", "Plastico", 3);
		coche1.desaparecer();
		coche1.setColor("Rojo");
		System.out.println(coche1.toString());
		System.out.println();
		
		Bicicleta bici1 =  new Bicicleta ("Azul", "Trek", "No ocupa", "Clip", "2x12",20);
		bici1.cambiarPlato();
		bici1.setMarca("Scott");
		System.out.println(bici1.toString());
		System.out.println();
		
		Estudiante est1 =  new Estudiante ("Luke", 1, "123455","Materno", "Estimulacion temprana", 0);
		est1.comer();
		est1.setMateria("Colorear");
		System.out.println(est1.toString());
		System.out.println();
		
		Profesor profe1 =  new Profesor ("Esteban", 29, "1234566","tarea@gmail.com",3, 1000.9);
		profe1.darClase();
		profe1.setExperiencia(6);
		System.out.println(profe1.toString());
		System.out.println();
		
		Persona profe = new Profesor ("Idania",29,"1236547899", "idania.ramirez.hernandez@ucreativa.com",6, 9999.1);
		profe.divertir();
		System.out.println();
		
		Persona estu = new Estudiante ("Alfredo", 13, "123456789","Sexto", "Ciencias", 2);
		estu.actuar();
		
		
		
	}

}
