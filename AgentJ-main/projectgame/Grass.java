
package projectgame;

import java.awt.*;
import javax.swing.ImageIcon;

public class Grass { 
    private int x,y;
    ImageIcon grass1 = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\GAME2D\\src\\image\\grass.png");
    Image grassimage = grass1.getImage();
    Grass(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void drawg1(Graphics g){
        g.drawImage(grassimage, x, y, 100, 100, null);
    } 
    public Rectangle getBounds(){
        return (new Rectangle(x,y,100,100));
    }
}
