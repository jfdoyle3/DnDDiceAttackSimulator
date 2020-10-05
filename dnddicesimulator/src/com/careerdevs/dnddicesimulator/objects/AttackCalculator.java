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
            case 20-> out.println("Crit hit");
            case 1 -> out.println("Crit miss");
            default -> out.println("normal: you may or may not landed a hit");
        }
        if (rolledNumber==1){
            totalDamage=0;
        }
        if (rolledNumber==20){
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



	public static byte getTotalDamage() {
		return totalDamage;
	}

	public static void setTotalDamage(byte totalDamage) {
		AttackCalculator.totalDamage = totalDamage;
	}

	public byte getToHitRoll() {
		return toHitRoll;
	}

	public void setToHitRoll(byte toHitRoll) {
		this.toHitRoll = toHitRoll;
	}

	public byte getAc() {
		return ac;
	}

	public void setAc(byte ac) {
		this.ac = ac;
	}

	public byte getDefenseMod() {
		return defenseMod;
	}

	public void setDefenseMod(byte defenseMod) {
		this.defenseMod = defenseMod;
	}

	public byte getAttackModifier() {
		return attackModifier;
	}

	public void setAttackModifier(byte attackModifier) {
		this.attackModifier = attackModifier;
	}


}

//    create a Calculator class that has the attack method: it should accept the following:
//        (byte ac, byte defenseMod, byte attackModifier, string damageDice)
//byte ac, byte defenseMod, byte attackModifier,