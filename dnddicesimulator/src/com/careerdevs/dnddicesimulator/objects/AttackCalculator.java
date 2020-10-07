package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class AttackCalculator {

    private static byte totalDamage;
    private byte toHitRoll;
    private byte ac;
    private byte defenseMod;
    private byte attackModifier;

 

    public AttackCalculator( byte toHitRoll, byte ac, byte defenseMod, byte attackModifier) {
		this.toHitRoll = toHitRoll;
		this.ac = ac;
		this.defenseMod = defenseMod;
		this.attackModifier = attackModifier;
	}
    
	public static byte Attack(byte ac, byte attackModifier, byte defenseModifier, byte rolledNumber, String damageDice) {

        switch (rolledNumber) {
          
         // out.println("normal: you may or may not landed a hit");
        }
        if (rolledNumber==1){
        	out.println("Crit miss");
            totalDamage=0;
        }
        if (rolledNumber==20){
        	out.println("Crit hit");
            totalDamage=(byte) (Damage(damageDice)+Damage(damageDice));
        }
//        if (toHitRoll==rolledNumber) {
//            totalDamage=Damage(damageDice);
//        }

        return totalDamage;
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
    
    public static byte defense(byte ac, byte defenseModifier) {
    	byte defense=(byte) (ac+defenseModifier);
    	return defense;
    }

    public static int toHit(int dieRoll, byte attackModifier) {
    		int attack=dieRoll+attackModifier;
    	return attack;
    }



}

//    create a Calculator class that has the attack method: it should accept the following:
//        (byte ac, byte defenseMod, byte attackModifier, string damageDice)
//byte ac, byte defenseMod, byte attackModifier,