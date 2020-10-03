package com.careerdevs.dnddicesimulator.objects;

public class Player {

    private int armorClass;
    private int hitPoints;
    private int attackModifier;
    private int defenseModifier;

    public Player(int armorClass, int hitPoints){
        this.armorClass=armorClass;
        this.hitPoints=hitPoints;

    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
