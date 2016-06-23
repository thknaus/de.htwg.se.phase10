package de.htwg.se.phase10.aview.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;



public class Phase10gui extends JFrame implements ActionListener{
	

	JFrame field;
	
	
	public Phase10gui(){
		
//Hauptfenster bauen.

		setTitle("Phase10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1024, 840));
		
		this.setLayout(new BorderLayout());
		JButton leftside = new JButton("Left Side");
		this.add(leftside, BorderLayout.WEST);
		
		JButton ground = new JButton("GroundPanel");
		this.add(ground, BorderLayout.SOUTH); 
		
		JButton mainfield = new JButton("MainField");
		this.add(mainfield, BorderLayout.CENTER);
		
		

		//JPanel p = new JPanel(new BoarderLayout());



        
//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	

	
//main	
    public static void main(String[] args) {
		JFrame myApp = new Phase10gui();
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}