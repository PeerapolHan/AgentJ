
package projectgame;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;
public class Player2 implements KeyListener{
    static LinkedList<Wood> w2 = CreateWood.getWoodBounds();
    static LinkedList<Metal> m2 = CreateMetal.getMetalBounds();
    static LinkedList<Enemy2> e2 = CreateEnemy2.getEnemyBounds2();
    static LinkedList<Bullet2> b2 = CreateBullet2.getBulletBounds2();
    CreateBullet2 bullet2;
    public static int score =0;
    public static int hp=5;
    private int x,y;
    private int speedx=0;
    private int speedy=0;
   // ImageIcon playerleft = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\playerleft.png");
   // Image pleft = playerleft.getImage();
    boolean keyup = true;
    boolean keydown = false;
    boolean keyleft = false;
    boolean keyright = false;
    boolean shoot = false;
    ImageIcon playerup = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\playerup.png");
    Image pup = playerup.getImage();
    ImageIcon playerdown = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\playerdown.png");
    Image pdown = playerdown.getImage();
    ImageIcon playerleft = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\playerleft.png");
    Image pleft = playerleft.getImage();
    ImageIcon playerright = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\playerright.png");
    Image pright = playerright.getImage();
    public Player2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void drawp2(Graphics g) {
        //g.drawImage(pleft, x, y, 100, 100, null);
        if(keyup){               
            g.drawImage(pup, x,y, 100, 100, null);
        }
        else if(keydown){
            g.drawImage(pdown, x, y, 100, 100, null);
        }
        else if(keyleft){
            g.drawImage(pleft, x, y, 100, 100, null);
        }
        else if(keyright){
            g.drawImage(pright, x, y, 100, 100, null);               
        }
    }
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()== KeyEvent.VK_SPACE){
            if(keyright){					
                bullet2.makeBullet(x, y);
            }
        }
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            keyup = true;
            keydown = false;
            keyleft = false;
            keyright = false;
            speedy = -5;
        }
        if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            keyup = false;
            keydown = true;
            keyleft = false;
            keyright = false;            
            speedy = 5;
        }
        if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            keyup = false;
            keydown = false;
            keyleft = true;
            keyright = false;            
            speedx = -5;
        }
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            keyup = false;
            keydown = false;
            keyleft = false;
            keyright = true;            
            speedx = 5;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) { 
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            speedy = 0;
        }
        if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            speedy = 0;
        }
        if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            speedx = 0;
        }
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            speedx = 0;
        }        
    }
    public Rectangle getBounds(){
        return (new Rectangle(x,y,100,100));
    }
    public void collision(){
        for(int i =0;i<w2.size();i++){
            if(getBounds().intersects(w2.get(i).getBounds())){
                w2.remove(i);
                hp--;
            }
        }
        for(int i =0;i<m2.size();i++){
            if(getBounds().intersects(m2.get(i).getBounds())){
                hp=hp-5;
            }
        }
        for(int i =0;i<e2.size();i++){
            if(getBounds().intersects(e2.get(i).getBounds())){
                hp=hp-5;
            }
        }        
     }
    public void run(){
        x+=speedx;
        y+=speedy;
        if(x<0){
            x=0;
        }
        if(x>1160){
            x=1160;
        }
        if(y<0){
            y=0;
        }
        if(y>665){
            y=665;
        }
        collision();
    }
}
