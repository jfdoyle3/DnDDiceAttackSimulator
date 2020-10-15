package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;


public class Console {

	public static void DisplayDie(Die die) {
		out.println(die.getFaceUp());
	}

	public static void DamageOutput(int damage) {
		out.println("total Damage: " + damage);
	}

	public static void DisplayCritHit() {
		out.println("Critical Hit");
	}

	public static void DisplayCritMiss() {
		out.println("Critical Miss");
	}

	public static void DisplayHit() {
		out.println("Hit");
	}

	public static void DisplayMiss() {
		out.println("Miss");
	}

}
