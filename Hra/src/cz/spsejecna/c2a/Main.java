package cz.spsejecna.c2a;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame obj = new JFrame();
		Gameplay g = new Gameplay();
		obj.setBounds(10,10,711,600);
		
		obj.setTitle("Nièení blokù");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(g);
		obj.setLocationRelativeTo(null);
	}

}
