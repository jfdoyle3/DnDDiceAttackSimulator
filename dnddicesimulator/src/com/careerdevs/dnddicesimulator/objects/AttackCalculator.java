package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class AttackCalculator {

    private static int totalDamage;
    private int toHitRoll;
    private int ac;
    private int defenseMod;
    private int attackModifier;

 

    public AttackCalculator( int toHitRoll, int ac, int defenseMod, int attackModifier) {
		this.toHitRoll = toHitRoll;
		this.ac = ac;
		this.defenseMod = defenseMod;
		this.attackModifier = attackModifier;
	}
    
	public static int Attack(int ac, int attackModifier, int defenseModifier, int rolledNumber, String damageDice) {

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
//        if (toHitRoll==rolledNumber) {
//            totalDamage=Damage(damageDice);
//        }

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


	public static int getTotalDamage() {
		return totalDamage;
	}

	public static void setTotalDamage(int totalDamage) {
		AttackCalculator.totalDamage = totalDamage;
	}

	public int getToHitRoll() {
		return toHitRoll;
	}

	public void setToHitRoll(int toHitRoll) {
		this.toHitRoll = toHitRoll;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getDefenseMod() {
		return defenseMod;
	}

	public void setDefenseMod(int defenseMod) {
		this.defenseMod = defenseMod;
	}

	public int getAttackModifier() {
		return attackModifier;
	}

	public void setAttackModifier(int attackModifier) {
		this.attackModifier = attackModifier;
	}


}

//    create a Calculator class that has the attack method: it should accept the following:
//        (int ac, int defenseMod, int attackModifier, string damageDice)
//int ac, int defenseMod, int attackModifier,