package com.company.mc210413533.object.Animal;

import com.company.mc210413533.object.Critter;
import com.company.mc210413533.object.CritterInfo;

import java.awt.*;
import java.util.Random;

import static com.company.mc210413533.object.Constant.ConstantString.*;

public class Tiger extends Critter {

    private int moveCounter;
    private int moves;
    private Color newColor;

    public Tiger() {
        moves+=moveCounter;
    }

    public Color getColor() {

        if(moveCounter == 3){
            newColor = getRandomColor();
            moveCounter = 0;
        }

        return newColor;
    }

    public String toString() {
        return tigerTGR;
    }

    public Action getMove(CritterInfo info) {
        moveCounter++;
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.WALL || info.getRight()==Neighbor.WALL) {
            return Action.LEFT;
        }else if(info.getFront()==Neighbor.SAME)
        {
            return  Action.RIGHT;
        }
        else
        {
            return Action.HOP;
        }
    }



    public Color getRandomColor(){
        Random newRandom = new Random();
        int RandomNumber = newRandom.nextInt(3);
        switch(RandomNumber){
            case 0:
                newColor = Color.RED;
                break;
            case 1:
                newColor = Color.GREEN;
                break;
            case 2:
                newColor = Color.BLUE;
                break;
        }
        return newColor;
    }
}
