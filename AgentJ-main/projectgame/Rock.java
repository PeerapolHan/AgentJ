
package projectgame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Rock {
    private int x,y;
    ImageIcon rock1 = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\GAME2D\\src\\image\\rock.png");
    Image rockimage = rock1.getImage();
    Rock(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void drawr1(Graphics g){
        g.drawImage(rockimage, x, y, 100, 100, null);
    } 
    public Rectangle getBounds(){
        return (new Rectangle(x,y,100,100));
    }
}
