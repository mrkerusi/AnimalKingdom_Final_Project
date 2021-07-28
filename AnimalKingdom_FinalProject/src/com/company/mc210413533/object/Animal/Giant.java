package com.company.mc210413533.object.Animal;
import com.company.mc210413533.object.Critter;
import com.company.mc210413533.object.CritterInfo;

import java.awt.*;

import static com.company.mc210413533.object.Constant.ConstantString.*;

public class Giant extends Critter {
    private int moveCounter;
    private int moves;
    private String GiantString;

    public Giant(){
        moves += moveCounter;
        GiantString = "";
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {

        if(moveCounter < 6){
            GiantString = giantFee;
        }
        else if (moveCounter >= 6 && moveCounter < 12){
            GiantString = giantFie;
        }
        else if (moveCounter >= 12 && moveCounter < 18)
        {
            GiantString = giantFoe;
        }
        else if(moveCounter >= 18 && moveCounter < 24)
        {
            GiantString = giantFum;
        }
        else
        {
            moveCounter = 0;
        }

        return GiantString;
    }

    public Action getMove(CritterInfo info) {
        moveCounter++;
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        }else
        {
            return Action.RIGHT;
        }
    }

}
