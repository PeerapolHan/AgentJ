
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;


public class CreateEnemy {
    static LinkedList<Enemy> ce1 = new LinkedList<>();
    Enemy temp;
    CreateEnemy(){
        addEnemy(new Enemy(700,0));
        addEnemy(new Enemy(200,0));
        addEnemy(new Enemy(100,360));
        //addEnemy(new Enemy(960,560));
        addEnemy(new Enemy(600,460));
        addEnemy(new Enemy(1160,260));
        //addEnemy(new Enemy(1260,160));
        //addEnemy(new Enemy(600,300));
        addEnemy(new Enemy(300,360));
    }
    public void drawe11(Graphics g){
        for(int i =0;i<ce1.size();i++){
            temp =ce1.get(i);
            temp.drawe1(g);
        }
    }
    public void addEnemy(Enemy enemy){
        ce1.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        ce1.remove(enemy);
    
    }
    public static LinkedList<Enemy> getEnemyBounds(){
        return ce1;
    }
}
