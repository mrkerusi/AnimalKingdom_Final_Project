package com.company.mc210413533.object.Animal;
import com.company.mc210413533.object.Critter;
import com.company.mc210413533.object.CritterInfo;

import java.awt.*;

import static com.company.mc210413533.object.Constant.ConstantString.*;

public class WhiteTiger extends Critter {
    boolean infect;
    public WhiteTiger(){
        infect = false;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        if(infect)
        {
            return tigerTGR;
        }
        return whiteTigergr;
    }

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            infect = true;
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

}
