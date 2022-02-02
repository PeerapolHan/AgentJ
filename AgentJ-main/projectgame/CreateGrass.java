
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;

public class CreateGrass {
    static LinkedList<Grass> cg1 = new LinkedList<>();
    Grass temp;
    CreateGrass(){
        addGrass(new Grass(100,0));
        addGrass(new Grass(200,100));
        addGrass(new Grass(300,200));
        addGrass(new Grass(100,660));
        addGrass(new Grass(960,460));
        //addGrass(new Grass(960,360));
        //addGrass(new Grass(960,260));
        addGrass(new Grass(960,160));
        addGrass(new Grass(500,200));
        addGrass(new Grass(600,200));
        addGrass(new Grass(600,660));
        addGrass(new Grass(600,560));
        addGrass(new Grass(200,460));
        addGrass(new Grass(200,560));
    }
    public void drawg11(Graphics g){
        for(int i=0;i<cg1.size();i++){
            temp = cg1.get(i);
            temp.drawg1(g);
        }
    }
    public void addGrass(Grass grass){
        cg1.add(grass);
    }
    public void removeGrass(Grass grass){
        cg1.remove(grass);
    }  
    public static LinkedList<Grass> getGrassBounds(){
        return cg1;
    }

}
