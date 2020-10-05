package com.careerdevs.dnddicesimulator.objects;

import java.util.Scanner;

import static java.lang.System.out;


public class Console {



    public static void DisplayDie(Die die){
        out.println(die.getFaceUp());
    }
    
    public static void DamageOutput(int damage){
        out.println("total Damage: "+damage);
    }
    
    public static void InputPlayer(Player player) {
    	Scanner input=new Scanner(System.in);
    	
//    public static int[] DamageDiceInput(){
//    	Scanner input=new Scanner(System.in);
//        String dice=input.nextLine();
//        String[] diceArray=dice.split( "d");
//        int[] intArray=new int[diceArray.length];
//        for(int idx=0; idx<dice.length(); idx++){
//            int intNumber = Integer.parseInt(diceArray[idx]);
//            intArray[idx]=intNumber;
//        }

 //       return intArray;

    }


}
