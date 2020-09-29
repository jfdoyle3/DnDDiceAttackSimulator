package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class Game {

    public static void Play(){
       System.out.print("Play Game\n---------\n");
       out.println("Default: Die value : ");
       Die die=new Die(20);
     // out.print(die.getFaceUp());
        Console.DisplayDie(die);
      out.print("\n------------------------\n");
       die.Roll();
      Console.DisplayDie(die);
      Calculator.Attack(die.getFaceUp());











}
}
