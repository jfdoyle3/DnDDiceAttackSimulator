package com.careerdevs.dnddicesimulator.objects;

public class Game {

    public static void Play(){
       System.out.print("Play Game\n---------\n");

       Die die=new Die(6);
       System.out.print(die.getFaceUp());


    }
}
