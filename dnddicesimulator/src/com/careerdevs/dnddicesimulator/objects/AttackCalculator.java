package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class AttackCalculator {

    private static int totalDamage,toHitRoll;



    public static int Attack(int ac, int attackModifier, int defenseModifier, int rolledNumber, String damageDice) {
         totalDamage = 0;
         toHitRoll=0;
        switch (rolledNumber) {
            case 20-> out.println("Crit hit");
            case 1 -> out.println("Crit miss");
            default -> out.println("normal: you may or may not landed a hit");
        }
        if (rolledNumber==1){
            totalDamage=0;
        }
        if (rolledNumber==20){
            totalDamage=Damage(damageDice)+Damage(damageDice);
        }
        if (toHitRoll==rolledNumber) {
            totalDamage=Damage(damageDice);
        }


        return totalDamage;
    }

    public static int Damage(String dice) {
      int diceDamage=0;
      int roll=0;
      String[] diceArray=dice.split( "d");
      if(diceArray[0].equals("")) {
           roll=1;
        } else {
           roll = Integer.parseInt(diceArray[0]);
        }
        Die die=new Die(Integer.parseInt((diceArray[1])));
       do{
          die.Roll();
          diceDamage+=die.getFaceUp();
          roll--;
       }while(roll>0);

        return diceDamage;
    }
}

//    create a Calculator class that has the attack method: it should accept the following:
//        (int ac, int defenseMod, int attackModifier, string damageDice)
//int ac, int defenseMod, int attackModifier,