
package projectgame;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
class State2 extends JPanel implements ActionListener  {
    int time = 40;
    Timer loop;
    Player2 player2;
    CreateWood wood;
    CreateMetal metal;
    CreateEnemy2 enemy2;
    CreateBullet2 bullet2;
    ImageIcon bgg  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\bgm.png");
    Image bggg =  bgg.getImage();
    ImageIcon over  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\gameover.png");
    Image gover =  over.getImage(); 
    ImageIcon win  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\gamewin.png");
    Image gwin =  win.getImage();  
    Image gifover;
    Image gifwin;
    State2(){
        player2 = new Player2(1160,660);
        wood = new CreateWood();
        metal = new CreateMetal();
        enemy2 = new CreateEnemy2();
        bullet2 =new CreateBullet2();
        gifover = Toolkit.getDefaultToolkit().createImage("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\irene.gif");
        gifwin = Toolkit.getDefaultToolkit().createImage("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\irerewin.gif");        
        playmusic("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\sound.wav");
        addKeyListener(player2);
        timecount.start();
        loop = new Timer(20,this);
        loop.start();

    }
    public void playmusic(String filepath) {
        InputStream music;
        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
        }catch(Exception e){} 
    }
    Thread timecount = new Thread(new Runnable(){
        @Override
        public void run() {
            while(true){
                time = time-1 ;
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    });
    @Override
    public void paint(Graphics g){
        super.paint(g);
        /*g.setColor(Color.black);
	g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
        g.setColor(Color.white);
        g.setFont(new Font("",Font.BOLD,20));
        g.drawString("Score : "+player.score, 1150, 20);
        g.drawString("HP : " + player.hp, 1170, 50);*/
/*        if(player.hp>=0||time>=0){
            //bg
            g.setColor(Color.red);
            g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
        }
        else{
            //bg
            g.setColor(Color.black);
            g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
        }*/
        //g.drawImage(bgover, 0, 0,Main.WIDTH, Main.HEIGHT,null);
        if(player2.hp<=0||time<=0){
            g.drawImage(bggg, 0, 0,Main.WIDTH, Main.HEIGHT,null);
            g.drawImage(gifover, 470,400, 300,250,this);
            g.drawImage(gover, 200, 70,900, 450,null);
            //g.setColor(Color.yellow);
            //g.setFont(new Font("",Font.BOLD,50));
            //g.drawString("GameOver", 130, 440);
            //bg
            //g.setColor(Color.black);
            //g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);  
            /*g.drawImage(bgover, 0, 0,Main.WIDTH, Main.HEIGHT,null);
            //score and hp
            g.setColor(Color.white);
            g.setFont(new Font("",Font.BOLD,20));
            g.drawString("Score : "+player.score, 1150, 20);
            g.drawString("HP : " + player.hp, 1170, 50);
            player.drawp1(g);
            grass.drawg11(g);
            rock.drawr11(g);
            enemy.drawe11(g);
            bullet.drawb11(g);*/
        }
        else{
            //bg
            g.drawImage(bggg, 0, 0,Main.WIDTH, Main.HEIGHT,null);
            //score and hp time
            g.setColor(Color.white);
            g.setFont(new Font("",Font.BOLD,20));
            g.drawString("Score : "+player2.score, 1150, 20);
            g.drawString("HP : " + player2.hp, 1170, 40);
            g.drawString("Time :"+time, 1150,60);

            player2.drawp2(g);
            wood.draww22(g);
            metal.drawm22(g);
            enemy2.drawe22(g);
            bullet2.drawb22(g);  
            
            if(player2.score==600){
                g.drawImage(bggg, 0, 0,Main.WIDTH, Main.HEIGHT,null);
                g.drawImage(gifwin, 470,400, 300,320,this);
                g.drawImage(gwin, 200, 40,900, 450,null);
            }
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        player2.run();
        bullet2.run();
        repaint();
    }
}
