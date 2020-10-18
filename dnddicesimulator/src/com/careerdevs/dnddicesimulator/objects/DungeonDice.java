package com.careerdevs.dnddicesimulator.objects;

public class DungeonDice {

	public static int RollDie(Die die) {
		die.Roll();
		return die.getFaceUp();
	}

	public static int Damage(String dice) {
		int diceDamage = 0;
		int roll = 0;
		String[] diceArray = dice.split("d");
		if (diceArray[0].equals("")) {
			roll = 1;
		} else {
			roll = Integer.parseInt(diceArray[0]);
		}
		Die die = new Die(Integer.parseInt((diceArray[1])));
		do {
			die.Roll();
			diceDamage += die.getFaceUp();
			roll--;
		} while (roll > 0);

		return diceDamage;
	}

}
