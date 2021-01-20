package com.qa.main;

public class Mechanic {

	private String Mechanic;

	public String getMechanic() {
		
		return Mechanic;
	}

	public void setMechanic(String mechanic) {
		Mechanic = mechanic;
	
	}
	
	public void mechanic(Car car) {
		car.setMechanic(car.getMileage() + this.getMechanic());
	}
	
}

