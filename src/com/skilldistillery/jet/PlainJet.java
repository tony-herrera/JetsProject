package com.skilldistillery.jet;

public class PlainJet extends Jet {

	public PlainJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "PlainJet [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice();
	}

}
