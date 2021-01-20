package com.qa.main;

public class Driver {
	
	 private int milesDriven;
	 

	    public int getMilesDriven() {
		return milesDriven;
	}

		public void setMilesDriven(int milesDriven) {
			this.milesDriven = milesDriven;
			
		}
		
		public void drive(Car car) {
	        car.setMileage(car.getMileage() + this.getMilesDriven());
	    }
}
