
package projectgame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
class State1 extends JPanel implements ActionListener  {
    int time = 60;
    Timer loop;
    Player player1;
    CreateGrass grass;
    CreateRock rock;
    CreateEnemy enemy;
    CreateBullet bullet;
    ImageIcon bgg  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\bgm.png");
    Image bggg =  bgg.getImage();
    ImageIcon over  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\gameover.png");
    Image gover =  over.getImage(); 
    ImageIcon win  = new ImageIcon("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\gamewin.png");
    Image gwin =  win.getImage();  
    Image gifover;
    Image gifwin;
    State1(){
        player1 = new Player(1160,660);
        grass = new CreateGrass();
        rock = new CreateRock();
        enemy = new CreateEnemy();
        bullet =new CreateBullet();
        gifover = Toolkit.getDefaultToolkit().createImage("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\irene.gif");
        gifwin = Toolkit.getDefaultToolkit().createImage("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\irerewin.gif");        
        playmusic("C:\\Users\\peeha\\Documents\\NetBeansProjects\\ProjectGame\\src\\image\\sound.wav");
        addKeyListener(player1);
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
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
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
        if(player1.hp<=0||time<=0){
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
            g.drawString("Score : "+player1.score, 1150, 20);
            g.drawString("HP : " + player1.hp, 1170, 40);
            g.drawString("Time :"+time, 1150,60);

            player1.drawp1(g);
            grass.drawg11(g);
            rock.drawr11(g);
            enemy.drawe11(g);
            bullet.drawb11(g);  
            
            if(player1.score==600){
                g.drawImage(bggg, 0, 0,Main.WIDTH, Main.HEIGHT,null);
                g.drawImage(gifwin, 470,400, 300,320,this);
                g.drawImage(gwin, 200, 40,900, 450,null);
            }
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        player1.run();
        bullet.run();
        repaint();
    }
}
