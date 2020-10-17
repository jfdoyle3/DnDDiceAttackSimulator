package com.careerdevs.dnddicesimulator.objects;

import java.util.Random;

public class Die {

    private int faces;
    private int faceUp;
    private static Random rand;

    public Die(){
        faceUp = 1;
    }

    public Die(int faces){
        this.faces=faces;
        this.faceUp=1;
    }

    public void Roll(){
        rand=new Random();
        faceUp=(int) (rand.nextInt(faces)+1);
    }

    public int getFaceUp(){
        return faceUp;
    }
}
