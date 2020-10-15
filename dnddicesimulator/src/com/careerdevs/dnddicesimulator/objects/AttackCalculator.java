package com.careerdevs.dnddicesimulator.objects;

import static java.lang.System.out;

public class AttackCalculator {

    private static byte totalDamage;
    private byte toHitRoll;
    private byte ac;
    private byte defenseMod;
    private byte attackModifier;
    private static boolean special;

	public static byte Attack(byte ac, byte attackModifier, byte defenseModifier, byte rolledNumber, String damageDice) {
		
		 int toHit=ToHit(rolledNumber,attackModifier);
		 int totalDefense=Defense(ac,defenseModifier);
		 
		 if (rolledNumber == 1) {
				out.println("Critical miss");
				totalDamage = 0;
				special = true;
			}
			if (rolledNumber == 20) {
				special = true;
				out.println("Critical hit");
				totalDamage = (byte) (DungeonDice.Damage(damageDice) + DungeonDice.Damage(damageDice));
			}
			if (rolledNumber >= toHit && !special) {
				out.println("Hit");
				totalDamage = DungeonDice.Damage(damageDice);
			}
			if (rolledNumber < toHit && !special) {
				out.println("Miss");
				totalDamage = 0;
			}
        return totalDamage;
    }

    public static byte Defense(byte ac, byte defenseModifier) {
    	byte defense=(byte) (ac+defenseModifier);
    	return defense;
    }

    public static int ToHit(int dieRoll, byte attackModifier) {
    		int attack=dieRoll+attackModifier;
    	return attack;
    }
}

//    create a Calculator class that has the attack method: it should accept the following:
//        (byte ac, byte defenseMod, byte attackModifier, string damageDice)
//byte ac, byte defenseMod, byte attackModifier,