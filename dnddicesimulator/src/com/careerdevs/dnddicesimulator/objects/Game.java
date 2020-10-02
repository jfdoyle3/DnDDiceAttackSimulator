package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class Game {

    public static void Play(){
      System.out.print("Play Game\n---------\n");
      out.print("Default: Die value : ");

      Die dieTwenty=new Die(20);
      Console.DisplayDie(dieTwenty);

      AttackCalculator.Attack(RollDie(dieTwenty),"2d10");
       
}

    public static int RollDie(Die die) {
        die.Roll();
        return die.getFaceUp();
    }

}
