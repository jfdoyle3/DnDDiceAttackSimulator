package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class Calculator {

    public static void Attack(int rolledNumber) {
        if (rolledNumber == 20) {
            out.println("Critical Hit");
            
        }
        if (rolledNumber == 1) {
            out.println("Critical Miss");
        }
    }

    public static int Damage(String dice) {
            int totalDamage=0;
            String[] diceArray=dice.split( "d");
            int roll=Integer.parseInt(diceArray[0]);
            Die die=new Die(Integer.parseInt((diceArray[1])));
       do{
            die.Roll();
            totalDamage+=die.getFaceUp();
            roll--;
       }while(roll>0);

        return totalDamage;
    }
}
