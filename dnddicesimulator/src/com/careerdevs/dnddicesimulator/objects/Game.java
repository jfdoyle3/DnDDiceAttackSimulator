package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class Game {

    public static void Play(){
       System.out.print("Play Game\n---------\n");
       out.println("Default: Die value : ");
       Die dieTwenty=new Die(20);
     // out.print(die.getFaceUp());
        Console.DisplayDie(dieTwenty);
      out.print("\n------------------------\n");
       dieTwenty.Roll();
      Console.DisplayDie(dieTwenty);
      Calculator.Attack(dieTwenty.getFaceUp());











}
}
