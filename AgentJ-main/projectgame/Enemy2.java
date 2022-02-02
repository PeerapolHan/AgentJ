/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Enemy2{
    private int x,y;
    ImageIcon enemy2 = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\enemy.png");
    Image enemyimage = enemy2.getImage();
    Enemy2(int x,int y){
        this.x =x;
        this.y=y;
    }
    public void drawe2(Graphics g){
        g.drawImage(enemyimage, x, y, null);
    }
    public Rectangle getBounds(){
        return (new Rectangle(x,y,100,100));
    }
}
