package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class Calculator {

    public static void Attack(int rolledNumber) {

        switch(rolledNumber) {

            case 20:
                out.println("Crit hit");
                break;
            case  1:
                out.println("Crit miss");
                break;
            default:
                out.println("normal: you may or may not landed a hit");
        }
//        if (rolledNumber == 20) {
//            out.println("Critical Hit");
//
//        }
//        if (rolledNumber == 1) {
//            out.println("Critical Miss");
//        }
    }

    public static int Damage(String dice) {
            int totalDamage=0;
            int roll=0;
            String[] diceArray=dice.split( "d");
            if(diceArray[0].equals("")) {
                roll=1;
            } else {
                roll = Integer.parseInt(diceArray[0]);
            }
            Die die=new Die(Integer.parseInt((diceArray[1])));
       do{
            die.Roll();
            totalDamage+=die.getFaceUp();
            roll--;
       }while(roll>0);

        return totalDamage;
    }
}
