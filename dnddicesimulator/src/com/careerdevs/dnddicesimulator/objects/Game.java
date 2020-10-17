package com.careerdevs.dnddicesimulator.objects;


import java.util.List;

public class Game {

	public static void Play() {
		Console.WelcomeMessage();
		Console.DrawLine();
		List<Object> inputStats = Input.InputStats();
		//String weaponDamage=Input.WeaponDamage();
		int defense = AttackCalculator.Defense((int)inputStats.get(0),(int) inputStats.get(2));
		Console.DisplayToHit(defense);
		Die dieTwenty = new Die(20);
		int roll = DungeonDice.RollDie(dieTwenty);
		Console.DisplayDie(roll);
		int damage=AttackCalculator.Attack(inputStats.get(0), inputStats.get(1), inputStats.get(2), roll, inputStats.get(3));
		Console.DamageOutput(damage);
	}

}
