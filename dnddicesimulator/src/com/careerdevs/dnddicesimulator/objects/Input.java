package com.careerdevs.dnddicesimulator.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	 public static List<Integer> InputStats() {
	    	List<Integer> stats=new ArrayList<>();
	    	
	    	try (Scanner input = new Scanner(System.in)) {
				System.out.print("Armor Class: ");
				stats.add(input.nextInt());
				System.out.print("Attack Modifier: ");
				//byte attackModifier=input.nextByte();
				stats.add(input.nextInt());
				System.out.print("Defense Modifier: ");
				//byte defenseModifier=input.nextByte();
				stats.add(input.nextInt());
			}
	    	return stats;
	 }
}
