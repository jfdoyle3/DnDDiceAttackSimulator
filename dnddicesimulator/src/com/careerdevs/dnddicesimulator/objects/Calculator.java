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

    public static void Damage(String dice) {
            String[] diceArray=dice.split( "d");
            for(int idx=0; idx< diceArray.length; idx++)
                System.out.printf("\nidx: %d | Die: %s",idx,diceArray[idx]);
    }
}
