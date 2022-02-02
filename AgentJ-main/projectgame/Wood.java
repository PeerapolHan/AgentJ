
package projectgame;

import java.awt.*;
import javax.swing.ImageIcon;

public class Wood { 
    private int x,y;
    ImageIcon wood2 = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\wood.png");
    Image woodimage = wood2.getImage();
    Wood(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void draww2(Graphics g){
        g.drawImage(woodimage, x, y, 100, 100, null);
    } 
    public Rectangle getBounds(){
        return (new Rectangle(x,y,100,100));
    }
}
