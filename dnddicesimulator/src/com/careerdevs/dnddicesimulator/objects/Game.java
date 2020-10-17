package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

import java.util.List;

public class Game {

	public static void Play() {
		Console.WelcomeMessage();
		Console.DrawLine();
		List<Integer> inputStats = Input.InputStats();
		int defense = AttackCalculator.Defense(inputStats.get(0), inputStats.get(2));
		Console.DisplayToHit(defense);
		Die dieTwenty = new Die(20);
		//int roll = DungeonDice.RollDie(dieTwenty);
		int roll=18;
		int damage=10000;
		Console.DisplayDie(roll);
		AttackCalculator.Attack(inputStats.get(0), inputStats.get(1), inputStats.get(2), roll, "2d10");
		Console.DamageOutput(damage);
		// Console.DisplayDie(dieTwenty);

		// out.printf("\n def: %d\n",defense);

		// int damage=AttackCalculator.Attack(inputStats.get(0),)

	}

}
