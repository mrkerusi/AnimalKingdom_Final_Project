package com.company.mc210413533.object.Animal;
import com.company.mc210413533.object.Critter;
import com.company.mc210413533.object.CritterInfo;

import java.awt.*;
import java.util.Random;

import static com.company.mc210413533.object.Constant.ConstantString.*;

public class NinjaCat extends Critter {
    private Color newColor;
    private int moveCounter;
    private int moves;

    public NinjaCat(){
        moves+=moveCounter;
    }

    public Action getMove(CritterInfo info) {
        moveCounter++;

        return circleAround();
    }

    public Color getColor() {
        return getRandomColor();
    }

    public String toString() {
        return ninjaCat;
    }

    public Color getRandomColor(){
        Random newRandom = new Random();

        int RandomNumber = newRandom.nextInt(7);
        switch(RandomNumber){
            case 0:
                newColor = Color.RED;
                break;
            case 1:
                newColor = Color.orange;
                break;
            case 2:
                newColor = Color.yellow;
                break;
            case 3:
                newColor = Color.green;
                break;
            case 4:
                newColor = Color.blue;
                break;
            case 5:
                newColor = Color.pink;
                break;
            case 6:
                newColor = Color.MAGENTA;
                break;
        }
        return newColor;
    }
    public Action circleAround()
    {
        return Action.RIGHT;
    }
}
