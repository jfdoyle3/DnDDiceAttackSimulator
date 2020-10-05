package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

import java.util.List;

public class Game {

    public static void Play(){
      System.out.print("Play Game\n---------\n");
      out.print("Default: Die value : ");
      List<Byte> inputStats=Console.InputStats();
      Die dieTwenty=new Die(20);
      RollDie(dieTwenty);
      Console.DisplayDie(dieTwenty);
      byte defense=AttackCalculator.defense(inputStats.get(0), inputStats.get(2));
      System.out.println(defense);
      


    //  AttackCalculator.Attack(5,2,3,RollDie(dieTwenty),"2d10");
       
}

    public static int RollDie(Die die) {
        die.Roll();
        return die.getFaceUp();
    }

}
