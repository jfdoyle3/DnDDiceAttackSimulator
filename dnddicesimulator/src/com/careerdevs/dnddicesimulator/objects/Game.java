package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

import java.util.List;

public class Game {

    public static void Play(){
      out.print("Play Game\n---------\n");
      List<Byte> inputStats=Console.InputStats();
      Die dieTwenty=new Die(20);
      int roll=RollDie(dieTwenty);
      Console.DisplayDie(dieTwenty);
      byte defense=AttackCalculator.defense(inputStats.get(0), inputStats.get(2));
      out.println(defense);
      out.println("Rolled: "+roll);
      
      
    
    //  AttackCalculator.Attack(5,2,3,RollDie(dieTwenty),"2d10");
       
}

    public static int RollDie(Die die) {
        die.Roll();
        return die.getFaceUp();
    }

}
