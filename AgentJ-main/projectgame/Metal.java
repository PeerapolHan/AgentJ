
package projectgame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Metal {
    private int x,y;
    ImageIcon metal2 = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\metal.png");
    Image metalimage = metal2.getImage();
    Metal(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void drawm2(Graphics g){
        g.drawImage(metalimage, x, y, 100, 100, null);
    } 
    public Rectangle getBounds(){
        return (new Rectangle(x,y,100,100));
    }
}
