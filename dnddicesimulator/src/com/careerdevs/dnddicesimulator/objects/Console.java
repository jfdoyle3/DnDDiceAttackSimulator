package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class Console {

	public static void WelcomeMessage() {
		out.print("D&D Dice Attack Simulator");
	}

	public static void DrawLine() {
		out.print("\n---------------------------\n");
	}

	public static void DisplayDie(int die) {
		out.printf("\nRolled: %d", die);
	}

	public static void DamageOutput(int damage) {
		out.println("total Damage: " + damage);
	}

	public static void DisplayCritHit() {
		out.println(" - Critical Hit!!\n");
	}

	public static void DisplayCritMiss() {
		out.println(" - Critical Miss\n");
	}

	public static void DisplayHit() {
		out.println(" - Hit");
	}

	public static void DisplayMiss() {
		out.println(" - Miss");
	}

	public static void DisplayToHit(int defense) {
		out.printf("Need to roll a %d or better to hit", defense);
	}

	public static void DisplayAttack(int attack) {
		out.printf("Your roll plus Attack Modifer is %d", attack);
	}

	public static void DisplayAC() {
		out.print("Armor Class: ");
	}

	public static void DisplayAttackModifier() {
		out.print("Attack Modifier: ");
	}

	public static void DisplayDefenseModifier() {
		out.print("Defense Modifier: ");
	}

	public static void DisplayWeaponDamage() {
		out.print("Weapon Damage: ");
	}

}
