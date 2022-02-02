
package projectgame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;


public class Bullet2 {
    Player2 player2;
    CreateWood wood;
    static LinkedList<Wood> w2 = CreateWood.getWoodBounds();
    static LinkedList<Metal> m2 = CreateMetal.getMetalBounds();
    static LinkedList<Enemy2> e2 = CreateEnemy2.getEnemyBounds2();
    static LinkedList<Bullet2> b2 = CreateBullet2.getBulletBounds2();
    private int x,y;
    ImageIcon bullet2 =new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\bullet.png");
    Image bulletimage = bullet2.getImage();
    Bullet2(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void drawb2 (Graphics g){
        g.drawImage(bulletimage,x+60,y+40,15,15,null);
    }
    public Rectangle getBounds(){
        return new Rectangle(x+60,y+40,15,15);
    }
    public void collision(){
        for(int i = 0 ; i<w2.size();i++){
            if(getBounds().intersects(w2.get(i).getBounds())){
                w2.remove(i);
                b2.remove(this);
            }
        }
        for(int i = 0 ; i<m2.size();i++){
            if(getBounds().intersects(m2.get(i).getBounds())){
                b2.remove(this);
                player2.hp--;
            }
        }
        for(int i = 0 ; i<e2.size();i++){
            if(getBounds().intersects(e2.get(i).getBounds())){
                e2.remove(i);
                b2.remove(this);
                player2.score=player2.score+100;
            }
        }        
    }
    void bulletrun2(){        
        x += 10;       
        collision();
    } 			
}
