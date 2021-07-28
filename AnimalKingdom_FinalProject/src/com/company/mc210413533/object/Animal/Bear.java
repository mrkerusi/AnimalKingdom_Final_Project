package com.company.mc210413533.object.Animal;
import com.company.mc210413533.object.Critter;
import com.company.mc210413533.object.CritterInfo;
import com.company.mc210413533.object.Critter.*;

import java.awt.*;

import static com.company.mc210413533.object.Constant.ConstantString.*;

public class Bear extends Critter {
    private int moveCounter;
    private int moves;
    private boolean polar;

    public Bear()
    {
        moves+=moveCounter;
        polar=false;
    }


    public Color getColor() {
        if(polar){
            return Color.WHITE;
        }
        return Color.BLACK;
    }

    public String toString() {
        if(alternatingMove())
        {
            return bearSlash;
        }
        return bearBackSlash;

    }

    public Action getMove(CritterInfo info) {
        moveCounter++;

        polar = GetPolar(info);

        if (info.frontThreat()) {
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }

    }

    public Boolean alternatingMove(){
        if(moveCounter%2 == 0)
        {
            return true;
        }
        return false;
    }

    public boolean GetPolar(CritterInfo info){
        if(info.getDirection()==Direction.NORTH || info.getDirection()==Direction.SOUTH)
        {
            return true;
        }
        return false;
    }


}
