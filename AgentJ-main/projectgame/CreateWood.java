
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;

public class CreateWood {
    static LinkedList<Wood> cw2 = new LinkedList<>();
    Wood temp;
    CreateWood(){
        addWood(new Wood(200,0));
        addWood(new Wood(400,100));
        addWood(new Wood(260,660));
        addWood(new Wood(460,560));
        addWood(new Wood(400,300));
        addWood(new Wood(500,300));
        addWood(new Wood(960,360));
        addWood(new Wood(960,260));
        addWood(new Wood(300,300));
      //  addWood(new Wood(600,560));
      //  addWood(new Wood(200,460));
      //  addWood(new Wood(200,560));
    }
    public void draww22(Graphics g){
        for(int i=0;i<cw2.size();i++){
            temp = cw2.get(i);
            temp.draww2(g);
        }
    }
    public void addWood(Wood wood){
        cw2.add(wood);
    }
    public void removeWood(Wood wood){
        cw2.remove(wood);
    }  
    public static LinkedList<Wood> getWoodBounds(){
        return cw2;
    }

}
