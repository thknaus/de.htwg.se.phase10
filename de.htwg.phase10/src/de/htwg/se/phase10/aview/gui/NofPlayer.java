package de.htwg.se.phase10.aview.gui;

import javax.swing.*;
import de.htwg.se.phase10.controller.IPhase10Controller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NofPlayer extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	JPanel numberofplayer;
	Color starbucksb = new Color(0xEAC784);
	Color starbucks = new Color(0x00592D);
	JButton number2, number3, number4, number5, number6;
	Phase10gui gui;
	
	public NofPlayer(Phase10gui g, IPhase10Controller con){
		
		this.controller = con;
		this.gui = g;
		
		numberofplayer = new JPanel();
		setTitle("Choos Number of Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(100, 180));
		setResizable(false);
		numberofplayer.setBackground(starbucks);
		
		
		number2 = new JButton("2 Player");
		number3 = new JButton("3 Player");
	    number4 = new JButton("4 Player");
	    number5 = new JButton("5 Player");
	    number6 = new JButton("6 Player");
	    
	    number2.addActionListener(this);
	    number3.addActionListener(this);
	    number4.addActionListener(this);
	    number5.addActionListener(this);
	    number6.addActionListener(this);

	    number2.setContentAreaFilled(false);
	    number3.setContentAreaFilled(false);
	    number4.setContentAreaFilled(false);
	    number5.setContentAreaFilled(false);
	    number6.setContentAreaFilled(false);
		
	    numberofplayer.setLayout(new BoxLayout(numberofplayer, BoxLayout.Y_AXIS));
	    numberofplayer.add(number2);
	    numberofplayer.add(number3);
	    numberofplayer.add(number4);
	    numberofplayer.add(number5);
	    numberofplayer.add(number6);
	    
		this.setLayout(new FlowLayout());
		numberofplayer.setBackground(starbucksb);
		this.add(numberofplayer);
		this.setBackground(starbucks);
	    
		this.pack();
		this.setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == number2||source == number3||source == number4||source == number5
				||source == number6){
			this.setVisible(false);
			controller.setNewGame(true);
			gui.Name();
		}	
	}

}
