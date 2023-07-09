package main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class GamePanel extends JPanel implements Runnable{
	//to have all JPanel's functions
	
	//SCREEN SETTINGS
	final int originalTilesSize = 16; //16x16 pixels
	final int scale = 3; //scale window resolution to see lil' character
	
	final int tileSize = originalTilesSize * scale; //to increase visible tiles == 48x48 pixels
	final int maxScreenColumn = 16; //width
	final int maxScreenLines = 12; //height
	final int screenWidth = maxScreenColumn * tileSize; //768 pixels
	final int screenHeight = maxScreenLines * tileSize; //576 pixels
	
	Thread gameThread; //keeps game running till stop command 
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
