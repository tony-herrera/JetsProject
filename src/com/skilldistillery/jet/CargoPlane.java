package com.skilldistillery.jet;

public class CargoPlane extends Jet implements XJet {
	
	
	public void CargoPlane() {
		
	}

	public CargoPlane(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println(getModel() + "\n All loaded up!!");
	}

	@Override
	public String toString() {
		return "CargoPlane [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice();
	}


}
