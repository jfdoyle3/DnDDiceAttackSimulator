package com.careerdevs.dnddicesimulator.objects;

import java.util.Scanner;

import static java.lang.System.out;


public class Console {

  //  private static Scanner input=new Scanner((Readable) System.in);

    public static void DisplayDie(Die die){
        out.println(die.getFaceUp());
    }

//    public static int[] DamageDiceInput(){
//        String dice=input.nextLine();
//        String[] diceArray=dice.split( "d");
//        int[] intArray=new int[diceArray.length];
//        for(int idx=0; idx<dice.length(); idx++){
//            int intNumber = Integer.parseInt(diceArray[idx]);
//            intArray[idx]=intNumber;
//        }
//
//        return intArray;
//
//    }

}
