package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandCard extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JButton card;
    
	public HandCard() {
		
		this.setBackground(Color.BLACK);
		
		card = new JButton("Card1");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card2");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card3");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card4");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card5");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card6");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card7");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card8");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card9");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card10");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
		card = new JButton("Card11");
		card.setPreferredSize(new Dimension(80,30));
	    this.add(card);
	    card.addActionListener(this);
	    
	    
	    
	}

	public void actionPerformed(ActionEvent e) {

	}
}