package com.skilldistillery.jet;

interface UNSCInfinity {
	public void bringMasterChief ();
	public void donMjolnirArmor ();
	public void equipMA5DIndividualCombatWeaponSystem();
	public void goFight();
		
	
}

public class SpaceCraft extends Jet {

	public SpaceCraft(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

}
