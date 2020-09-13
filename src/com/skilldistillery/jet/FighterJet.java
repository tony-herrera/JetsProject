package com.skilldistillery.jet;

public class FighterJet extends Jet implements UNSCInfinity {

	public FighterJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void bringMasterChief() {
		System.out.println(getModel() + "\n Locked and Loaded!!");
	}

	@Override
	public String toString() {
		return "FighterJet [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice();
	}
}
