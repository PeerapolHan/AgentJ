
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;

public class CreateRock {
    static LinkedList<Rock> cr1 = new LinkedList<>();
    Rock temp;
    CreateRock(){
        addRock(new Rock(300,0));
        addRock(new Rock(200,660));
        addRock(new Rock(960,660));
        addRock(new Rock(960,560));
        addRock(new Rock(1060,160));
        addRock(new Rock(1160,160));
        addRock(new Rock(1260,160));
        addRock(new Rock(600,300));
        addRock(new Rock(700,560));
    }
    public void drawr11(Graphics g){
        for(int i =0;i<cr1.size();i++){
            temp =cr1.get(i);
            temp.drawr1(g);
        }
    }
    public void addRock(Rock rock){
        cr1.add(rock);
    }
    public void removeRock(Rock rock){
        cr1.remove(rock);
    
    }
    public static LinkedList<Rock> getRockBounds(){
        return cr1;
    }
}
