package com.careerdevs.dnddicesimulator.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	public static List<Object> InputStats() {
		List<Object> stats = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {

			Console.DisplayAC();
			stats.add(input.nextInt());
			Console.DisplayAttackModifier();
			stats.add(input.nextInt());
			Console.DisplayDefenseModifier();
			stats.add(input.nextInt());
			Console.DisplayWeaponDamage();
			stats.add(input.next());
		}
		return stats;
	}
	
}
