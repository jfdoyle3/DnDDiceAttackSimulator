package com.careerdevs.dnddicesimulator.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	 public static List<Byte> InputStats() {
	    	List<Byte> stats=new ArrayList<Byte>();
	    	
	    	try (Scanner input = new Scanner(System.in)) {
				System.out.print("Armor Class: ");
				stats.add(input.nextByte());
				System.out.print("Attack Modifier: ");
				//byte attackModifier=input.nextByte();
				stats.add(input.nextByte());
				System.out.print("Defense Modifier: ");
				//byte defenseModifier=input.nextByte();
				stats.add(input.nextByte());
			}
	    	return stats;
	 }
}
