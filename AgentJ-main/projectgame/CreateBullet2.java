
package projectgame;

import java.awt.Graphics;
import java.util.LinkedList;


public class CreateBullet2 {
    static LinkedList<Bullet2> cb2 = new LinkedList<>();
    Bullet2 temp;
    private int x,y;
    CreateBullet2(){
        
    }
    public  static void makeBullet(int x,int y){
        addBullet2(new Bullet2(x,y));
    }
    public void drawb22(Graphics g){
        for(int i=0;i<cb2.size();i++){
            temp = cb2.get(i);
            temp.drawb2(g);
        }
    }
    public static void addBullet2(Bullet2 bullet){
        cb2.add(bullet);
    }
    public static void removeBullet2(Bullet2 bullet){
        cb2.remove(bullet);
    }  
    public static LinkedList<Bullet2> getBulletBounds2(){
        return cb2;
    }
    public void run(){
        for(int i = 0; i< cb2.size();i++){
            temp=cb2.get(i);
            temp.bulletrun2();
        }
    }
}
