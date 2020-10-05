package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Console {



    public static void DisplayDie(Die die){
        out.println(die.getFaceUp());
    }
    
    public static void DamageOutput(int damage){
        out.println("total Damage: "+damage);
    }
    

    
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
    
//    public static byte[] DamageDiceInput(){
//    	Scanner input=new Scanner(System.in);
//        String dice=input.nextLine();
//        String[] diceArray=dice.split( "d");
//        byte[] intArray=new byte[diceArray.length];
//        for(int idx=0; idx<dice.length(); idx++){
//            byte intNumber = Byte.parseByte(diceArray[idx]);
//            intArray[idx]=intNumber;
//        }

 //       return intArray;

    }



