package cz.spsejecna.c2a;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

	/* Tuhle hru jsem m�l vymy�lenou u� n�jakou dobu, ale nev�d�l jsem moc dob�e jak na to, proto jsem to d�lal hodn� podle tutori�lu, tedy hlavn� jsem nev�d�l jak m�m vytvo�it hitboxy
	 * jinak vykreslov�n� jsem d�lal ji� p�ed t�m v kalkula�ce tak�e to nebyl takov� probl�m (v�t�ina actionPerformed nen� moje, proto�e jsem j� nech�pal, ale te� bych to u� asi zvl�dl l�pe)*/
	
	Random rnd = new Random();
	int max = 1, min = -1;
	
	private boolean play = false;
	private int score = 0;
	
	private int totalBricks = 21;
	
	private Timer timer;
	private int delay = 8; // jak rychle se m�� pohybuje 
	
	private int playerX = 310;
	
	private int poziceMiceX = rnd.nextInt((550-150)+1)+150;
	private int poziceMiceY = 350;
	private int kamMicLetiX = rnd.nextInt((max-min)+1)+min;
	private int kamMicLetiY = -2;
	
	private Mapa map;
	public Gameplay() {
		map = new Mapa(3,7);
		addKeyListener(this);
		setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		//pozad�
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		//mapa
		map.draw((Graphics2D)g);
		//ohrani�en�
		g.setColor(Color.red);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(692, 0, 3, 592);
		
		g.setColor(Color.white);
		g.setFont(new Font("serif",Font.BOLD,25));
		g.drawString(""+score,590,30);
		//hr��
		g.setColor(Color.white);
		g.fillRect(playerX, 550, 100, 8);
		//m��
		g.setColor(Color.red);
		g.fillOval(poziceMiceX, poziceMiceY, 20,20);
		//konec hry(v�t�zstv�)
		if(totalBricks==0) {
			play = false;
			kamMicLetiX = 0;
			kamMicLetiY = 0;
			g.setColor(Color.RED);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("Vyhr�li jste!! " ,230,300);
			g.setFont(new Font("serif",Font.BOLD,20));
			g.drawString("Press space to RESTART"  ,230,350);
		}
		//game over
		if(poziceMiceY >570) {
			play = false;
			kamMicLetiX = 0;
			kamMicLetiY = 0;
			g.setColor(Color.RED);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("Konec hry, Sk�re: "+score ,230,300);
			g.setFont(new Font("serif",Font.BOLD,20));
			g.drawString("Press space to RESTART"  ,230,350);
		}
		
		g.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if(play) {
			if(new Rectangle(poziceMiceX, poziceMiceY,20,20).intersects(new Rectangle(playerX, 550, 100,8))) {
				kamMicLetiY = -kamMicLetiY;
				if(kamMicLetiX==0) {
					kamMicLetiX = 1;
				}
			}
			for(int i=0; i<map.map.length; i++) {
				for(int j=0;j<map.map[0].length; j++) {
					if(map.map[i][j]>0) {
						int brickX = j*map.brickWidth+80;
						int brickY = i*map.brickHeight+50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;
						
						Rectangle r = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle bR = new Rectangle(poziceMiceX, poziceMiceY,20,20); 
						Rectangle bR1 = r; 
						
						if(bR.intersects(bR1)) {
							map.setBrickValue(0, i, j);
							totalBricks--;
							score+=5;
							
							if(poziceMiceX+19<=bR1.x || poziceMiceX + 1 >=bR1.x + bR1.width) {
								kamMicLetiX = -kamMicLetiX;
							}
							else {
								kamMicLetiY = -kamMicLetiY;
							}
							
						}
					}
				}
			}
			poziceMiceX += kamMicLetiX;
			poziceMiceY += kamMicLetiY;
			if(poziceMiceX<0) {
				kamMicLetiX = -kamMicLetiX;
			}
			if(poziceMiceY<0) {
				kamMicLetiY = -kamMicLetiY;
			}
			if(poziceMiceX>670) {
				kamMicLetiX = -kamMicLetiX;
			}
		}
		
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D) {
			if(playerX>=600) {
				playerX = 600;
			}
			else {
				moveRight();
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			if(playerX<10) {
				playerX = 10;
			}
			else {
				moveLeft();
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			if(!play) {
				play = true;
				poziceMiceX = rnd.nextInt((550-150)+1)+150;
				poziceMiceY = 350;
				kamMicLetiX = rnd.nextInt((max-min)+1)+min;
					if(kamMicLetiX ==0) {
						kamMicLetiX =1;
					}
				kamMicLetiY = -2;
				playerX = 310;
				score = 0;
				totalBricks = 21;
				map = new Mapa(3,7);
				repaint();
			}
		}
	}

	public void moveRight()	{
		play = true;
		playerX+=20;
	}
	public void moveLeft()	{
		play = true;
		playerX-=20;
	}
	
}
