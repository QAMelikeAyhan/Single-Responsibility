package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Car Volkswagen = new Car("white","Polo", 2000);
		Driver Melike = new Driver();
		Mechanic Tom = new Mechanic();
		
		Melike.setMilesDriven(700);
		Melike.drive(Volkswagen);
		System.out.println(Volkswagen.getMileage());
		System.out.println(Volkswagen.getMechanic());
			
		}
	}


