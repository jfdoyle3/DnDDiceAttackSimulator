package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class AttackCalculator {

	private static int totalDamage;
//	private int toHitRoll;
//	private int ac;
//	private int defenseMod;
//	private int attackModifier;
	private static boolean special;

	public static int Attack(int ac, int attackModifier, int defenseModifier, int rolledNumber, String damageDice) {

		int toHit = ToHit(rolledNumber, attackModifier);
		int totalDefense = Defense(ac, defenseModifier);

		if (rolledNumber == 1) {
			Console.DisplayCritMiss();
			totalDamage = 0;
			special = true;
		}
		if (rolledNumber == 20) {
			special = true;
			Console.DisplayCritHit();
			totalDamage = (int) (DungeonDice.Damage(damageDice) + DungeonDice.Damage(damageDice));
		}
		if (toHit>=totalDefense   && !special) {
			Console.DisplayHit();
			totalDamage = DungeonDice.Damage(damageDice);
		}
		if (toHit <totalDefense  && !special) {
			Console.DisplayMiss();
			totalDamage = 0;
		}
		return totalDamage;
	}

	public static int Defense(int ac, int defenseModifier) {
		int defense = (int) (ac + defenseModifier);
		return defense;
	}

	public static int ToHit(int dieRoll, int attackModifier) {
		int attack = dieRoll + attackModifier;
		return attack;
	}
}

//    create a Calculator class that has the attack method: it should accept the following:
//        (int ac, int defenseMod, int attackModifier, string damageDice)
//int ac, int defenseMod, int attackModifier,