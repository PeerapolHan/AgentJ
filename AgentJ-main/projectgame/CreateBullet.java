
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;


public class CreateBullet {
    static LinkedList<Bullet> cb1 = new LinkedList<>();
    Bullet temp;
    private int x,y;
    CreateBullet(){
        
    }
    public  static void makeBullet(int x,int y){
        addBullet(new Bullet(x,y));
    }
    public void drawb11(Graphics g){
        for(int i=0;i<cb1.size();i++){
            temp = cb1.get(i);
            temp.drawb1(g);
        }
    }
    public static void addBullet(Bullet bullet){
        cb1.add(bullet);
    }
    public static void removeBullet(Bullet bullet){
        cb1.remove(bullet);
    }  
    public static LinkedList<Bullet> getBulletBounds(){
        return cb1;
    }
    public void run(){
        for(int i = 0; i< cb1.size();i++){
            temp=cb1.get(i);
            temp.bulletrun();
        }
    }
}
