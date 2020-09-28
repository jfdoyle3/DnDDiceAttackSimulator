package com.careerdevs.dnddicesimulator.objects;

public class Die {

    private int faces;
    private int faceUp;

    public Die(){
        faceUp = 1;
    }

    public Die(int faces){
        this.faces=faces;
        this.faceUp=1;
    }


    public int getFaceUp(){
        return faceUp;
    }
}
