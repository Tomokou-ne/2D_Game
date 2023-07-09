package main;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		JFrame window = new JFrame(); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set closing game operation
		window.setResizable(false); //set resizable window to false, for close preventation
		window.setTitle("2D Game");//set Title of the project. game-name
		
		final GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();		
		
		window.setLocationRelativeTo(null); //set size of the game-screen. null = fullscreen; window = windowed
		window.setVisible(true); //to see the game-window
	
	}
	
}
