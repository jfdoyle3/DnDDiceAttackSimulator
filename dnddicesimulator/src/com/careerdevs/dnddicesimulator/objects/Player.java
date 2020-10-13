package com.careerdevs.dnddicesimulator.objects;

public class Player {

    private int armorClass;
    private int hitPoints;
    private int attackModifier;
    private int defenseModifier;
    
	public Player(int armorClass, int hitPoints, int attackModifier, int defenseModifier) {
		super();
		this.armorClass = armorClass;
		this.hitPoints = hitPoints;
		this.attackModifier = attackModifier;
		this.defenseModifier = defenseModifier;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getAttackModifier() {
		return attackModifier;
	}

	public int getDefenseModifier() {
		return defenseModifier;
	}
}
