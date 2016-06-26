package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ToolBar extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	
	private JButton deck;
	Color starbucks = new Color(0x00592D);
	
	public ToolBar() {
		this.setBackground(starbucks);
	    deck = new JButton("Taster1");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster2");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster3");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster4");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster5");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster6");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster7");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	    
	    deck = new JButton("Taster8");
	    deck.setPreferredSize(new Dimension(100,30));
	    this.add(deck);
	    deck.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == deck){
			
		}
	}
}
