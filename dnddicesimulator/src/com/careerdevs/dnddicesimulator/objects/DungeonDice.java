package com.careerdevs.dnddicesimulator.objects;

public class DungeonDice {
	
	
    public static int RollDie(Die die) {
        die.Roll();
        return die.getFaceUp();
    }
}
