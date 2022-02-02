
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;

public class CreateMetal {
    static LinkedList<Metal> cm2 = new LinkedList<>();
    Metal temp;
    CreateMetal(){
        addMetal(new Metal(1160,460));
        addMetal(new Metal(1060,460));
        addMetal(new Metal(960,460));
        addMetal(new Metal(560,660));
        addMetal(new Metal(560,560));
        addMetal(new Metal(260,560));
        addMetal(new Metal(400,0));
        addMetal(new Metal(600,300));
        addMetal(new Metal(200,300));
        addMetal(new Metal(800,0));
        addMetal(new Metal(800,100));
    }
    public void drawm22(Graphics g){
        for(int i =0;i<cm2.size();i++){
            temp =cm2.get(i);
            temp.drawm2(g);
        }
    }
    public void addMetal(Metal metal){
        cm2.add(metal);
    }
    public void removeRock(Metal metal){
        cm2.remove(metal);
    
    }
    public static LinkedList<Metal> getMetalBounds(){
        return cm2;
    }
}
