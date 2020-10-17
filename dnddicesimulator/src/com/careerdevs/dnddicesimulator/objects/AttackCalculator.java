package com.careerdevs.dnddicesimulator.objects;

public class AttackCalculator {

	private static int totalDamage;
	private static boolean special;

	public static int Attack(Object ac, Object attackModifier, Object defenseModifier, int rolledNumber, Object damageDice) {

		int toHit = ToHit(rolledNumber, (int) attackModifier);
		int totalDefense = Defense((int)ac, (int)defenseModifier);

		if (rolledNumber == 1) {
			special = true;
			Console.DisplayCritMiss();
			totalDamage = 0;
		}
		if (rolledNumber == 20) {
			special = true;
			Console.DisplayCritHit();
			totalDamage = (int) (DungeonDice.Damage((String)damageDice) + DungeonDice.Damage((String)damageDice));
		}
		if (toHit >= totalDefense && !special) {
			Console.DisplayHit();
			totalDamage = DungeonDice.Damage((String) damageDice);
		}
		if (toHit < totalDefense && !special) {
			Console.DisplayMiss();
			totalDamage = 0;
		}
		return totalDamage;
	}

	public static int Defense(int ac, int defenseModifier) {
		
		int defense = ac + defenseModifier;
		return defense;
	}

	public static int ToHit(int dieRoll, int attackModifier) {
		int attack = dieRoll + attackModifier;
		return attack;
	}
}
