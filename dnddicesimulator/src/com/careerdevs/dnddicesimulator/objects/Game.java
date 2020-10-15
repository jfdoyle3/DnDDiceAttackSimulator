package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

import java.util.List;

public class Game {

    public static void Play(){
      out.print("Play Game\n---------\n");
      
      List<Byte> inputStats=Input.InputStats();
      
      Die dieTwenty=new Die(20);
   //   byte defense=AttackCalculator.defense(inputStats.get(0), inputStats.get(2));
      
      int roll=DungeonDice.RollDie(dieTwenty);
      
      //Console.DisplayDie(dieTwenty);
      
    //  out.printf("\n def: %d\n",defense);
      
      out.printf("Rolled: %d",roll);
    //  int damage=AttackCalculator.Attack(inputStats.get(0),)
      
      
    
    //  AttackCalculator.Attack(5,2,3,DungeonDice.RollDie(dieTwenty),"2d10");
       
}


}
