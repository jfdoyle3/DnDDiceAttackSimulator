package com.careerdevs.dnddicesimulator.objects;

public class DungeonDice {
	
	
    public static int RollDie(Die die) {
        die.Roll();
        return die.getFaceUp();
    }
    
    public static byte Damage(String dice) {
        byte diceDamage=0;
        byte roll=0;
        String[] diceArray=dice.split( "d");
        if(diceArray[0].equals("")) {
             roll=1;
          } else {
             roll = Byte.parseByte(diceArray[0]);
          }
          Die die=new Die(Byte.parseByte((diceArray[1])));
         do{
            die.Roll();
            diceDamage+=die.getFaceUp();
            roll--;
         }while(roll>0);

          return diceDamage;
      }
    
}
