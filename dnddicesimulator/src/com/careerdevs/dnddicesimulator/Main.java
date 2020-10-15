package com.careerdevs.dnddicesimulator;

import static java.lang.System.out;

import com.careerdevs.dnddicesimulator.objects.AttackCalculator;
import com.careerdevs.dnddicesimulator.objects.DungeonDice;
import com.careerdevs.dnddicesimulator.objects.Game;

public class Main {

	public static void main(String[] args) {

		// Game.Play();

		boolean special = false;
		int toHit = 8;
		int rolledNumber = 8;
		String damageDice = "d4";
		
		ToHit(rolledNumber,damageDice);

	}

		static void ToHit(int rolledNumber, String damageDice) {
		int totalDamage = 0;
		switch (rolledNumber)
		{
			case 1:
				out.println("Crit miss");
				totalDamage = 0;
				break;
			case 20: 
				out.println("Crit hit");
				totalDamage = (byte) (DungeonDice.Damage(damageDice) + DungeonDice.Damage(damageDice));
				break;
			case 3:
				out.println("Hit");
				totalDamage = DungeonDice.Damage(damageDice);
				break;
			default:
				out.println("Miss");
				totalDamage = 0;
			
		}
		out.print(totalDamage);
	}


}