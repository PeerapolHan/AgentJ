
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;


public class CreateEnemy2 {
    static LinkedList<Enemy2> ce2 = new LinkedList<>();
    Enemy2 temp;
    CreateEnemy2(){
        addEnemy2(new Enemy2(700,0));
        addEnemy2(new Enemy2(1160,360));
        addEnemy2(new Enemy2(460,660));
        addEnemy2(new Enemy2(160,660));
        addEnemy2(new Enemy2(400,200));
        addEnemy2(new Enemy2(300,0));

    }
    public void drawe22(Graphics g){
        for(int i =0;i<ce2.size();i++){
            temp =ce2.get(i);
            temp.drawe2(g);
        }
    }
    public void addEnemy2(Enemy2 enemy){
        ce2.add(enemy);
    }
    public void removeEnemy2(Enemy2 enemy){
        ce2.remove(enemy);
    
    }
    public static LinkedList<Enemy2> getEnemyBounds2(){
        return ce2;
    }
}
