package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandCard extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	private JButton card;
	Color starbucks = new Color(0x00592D);
	Phase10gui gui;
	ImageIcon HCard1, HCard2;
	
	
	public HandCard(Phase10gui g, IPhase10Controller con) {
		
		this.controller = con;
		this.gui = g;
		this.setBackground(starbucks);
		
		HCard1 = new ImageIcon(new ImageIcon("./img/red_03.jpg").getImage().getScaledInstance(80, 100, java.awt.Image.SCALE_SMOOTH));
		HCard2 = new ImageIcon(new ImageIcon("./img/green_11.jpg").getImage().getScaledInstance(80, 100, java.awt.Image.SCALE_SMOOTH));
		
		card = new JButton(HCard1);
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);  
	    
		card = new JButton(HCard2);
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card3");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card4");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card5");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card6");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card7");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card8");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card9");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card10");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card11");
		card.setPreferredSize(new Dimension(80,100));
	    this.add(card);
	    card.addActionListener(this);
	    
	    
	    
	}

	public void actionPerformed(ActionEvent e) {

	}
}