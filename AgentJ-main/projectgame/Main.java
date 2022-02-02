package projectgame;

import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements KeyListener/*,MouseListener*/{
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 800;  
    /*static Gun gun = new Gun();*/
    static State1 s1 ;
    static State2 s2 ;
    ImagePanel image = new ImagePanel();

    Main(){
        add(image);
        addKeyListener(this);
    }
    public static void main(String[] args) {
        JFrame window = new Main();
        window.setTitle("Agent J");
        window.setSize(WIDTH, HEIGHT);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            //System.out.println("LEFT");
            s1 = new State1 ();
            remove(image);
            setSize(Main.WIDTH,Main.HEIGHT);
            add(s1);
            s1.requestFocusInWindow(); 
            setVisible(true);
            
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            //System.out.println("RIGHT");
            s2 = new State2 ();
            remove(image);
            setSize(Main.WIDTH,Main.HEIGHT);
            add(s2);
            s2.requestFocusInWindow(); 
            setVisible(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
    
class ImagePanel extends JPanel{
    ImageIcon agj = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\agj.png");
    ImageIcon bgm  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\bgm.png");
    ImageIcon left  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\left.png");
    ImageIcon right  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\right.png");
    ImageIcon de  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\de1.png");
    ImageIcon usp  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\usp1.png");
    Image DE = de.getImage();
    Image USP = usp.getImage();
    Image LEFT = left.getImage();
    Image RIGHT = right.getImage();
    Image AGJ = agj.getImage();
    Image BGM = bgm.getImage();   
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(BGM, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(AGJ, 480, 0, 300, 200, this);
        g.drawImage(LEFT, 100, 200, 400,150, this);
        g.drawImage(RIGHT, 700, 200, 400,150, this);
        g.drawImage(DE, 100, 450, 400,200, this);
        g.drawImage(USP, 700, 450, 400,200, this);
    }
}
