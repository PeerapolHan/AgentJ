
package projectgame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;


public class Bullet {
    Player player;
    CreateGrass grass;
    private LinkedList<Grass> g1 = CreateGrass.getGrassBounds();
    private LinkedList<Rock>  r1 = CreateRock.getRockBounds();
    private LinkedList<Enemy>  e1 = CreateEnemy.getEnemyBounds();
    private LinkedList<Bullet>  b1 = CreateBullet.getBulletBounds();
    private int x,y;
    ImageIcon bullet1 =new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\bullet.png");
    Image bulletimage = bullet1.getImage();
    Bullet(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void drawb1 (Graphics g){
        g.drawImage(bulletimage,x+40,y,15,15,null);
    }
    public Rectangle getBounds(){
        return new Rectangle(x+40,y,15,15);
    }
    public void collision(){
        for(int i = 0 ; i<g1.size();i++){
            if(getBounds().intersects(g1.get(i).getBounds())){
                g1.remove(i);
                b1.remove(this);
            }
        }
        for(int i = 0 ; i<r1.size();i++){
            if(getBounds().intersects(r1.get(i).getBounds())){
                b1.remove(this);
                player.hp--;
            }
        }
        for(int i = 0 ; i<e1.size();i++){
            if(getBounds().intersects(e1.get(i).getBounds())){
                e1.remove(i);
                b1.remove(this);
                player.score=player.score+100;
            }
        }        
    }
    void bulletrun(){        
        y -= 10;       
        collision();
    } 			
}
