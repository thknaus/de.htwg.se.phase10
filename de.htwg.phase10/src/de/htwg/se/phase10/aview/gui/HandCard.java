package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.PlayerHand;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandCard extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	private JButton card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11;
	Color starbucks = new Color(0x00592D);
	Phase10gui gui;
	
	
	public HandCard(Phase10gui g, IPhase10Controller con) {
		
		this.controller = con;
		this.gui = g;
		this.setBackground(starbucks);
		
		card1 = new JButton();
		card1.setPreferredSize(new Dimension(100,120));
	    this.add(card1);
	    card1.addActionListener(this);  
	    
		card2 = new JButton();
		card2.setPreferredSize(new Dimension(100,120));
	    this.add(card2);
	    card2.addActionListener(this);
	    
		card3 = new JButton();
		card3.setPreferredSize(new Dimension(100,120));
	    this.add(card3);
	    card3.addActionListener(this);
	    
		card4 = new JButton();
		card4.setPreferredSize(new Dimension(100,120));
	    this.add(card4);
	    card4.addActionListener(this);
	    
		card5 = new JButton();
		card5.setPreferredSize(new Dimension(100,120));
	    this.add(card5);
	    card5.addActionListener(this);
	    
		card6 = new JButton();
		card6.setPreferredSize(new Dimension(100,120));
	    this.add(card6);
	    card6.addActionListener(this);
	    
		card7 = new JButton();
		card7.setPreferredSize(new Dimension(100,120));
	    this.add(card7);
	    card7.addActionListener(this);
	    
		card8 = new JButton();
		card8.setPreferredSize(new Dimension(100,120));
	    this.add(card8);
	    card8.addActionListener(this);
	    
		card9 = new JButton();
		card9.setPreferredSize(new Dimension(100,120));
	    this.add(card9);
	    card9.addActionListener(this);
	    
		card10 = new JButton();
		card10.setPreferredSize(new Dimension(100,120));
	    this.add(card10);
	    card10.addActionListener(this);
	    
		card11 = new JButton();
		card11.setPreferredSize(new Dimension(100,120));
	    this.add(card11);
	    card11.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {

	}
	public void updateHand(){
		Card[] ph = controller.getCurrentPlayer().getHand();
		
		for(int i = 0; i <= ph.length; i++){
			switch(i){
				case 0:
					if(ph[i].equals(null)){
						break;
					}
					card1.setIcon(ph[i].getIcon());
					break;
				case 1:
					if(ph[i].equals(null)){
						break;
					}
					card2.setIcon(ph[i].getIcon());
					break;
				case 2:
					if(ph[i].equals(null)){
						break;
					}
					card3.setIcon(ph[i].getIcon());
					break;
				case 3:
					if(ph[i].equals(null)){
						break;
					}
					card4.setIcon(ph[i].getIcon());
					break;
				case 4:
					if(ph[i].equals(null)){
						break;
					}
					card5.setIcon(ph[i].getIcon());
					break;
				case 5:
					if(ph[i].equals(null)){
						break;
					}
					card6.setIcon(ph[i].getIcon());
					break;
				case 6:
					if(ph[i].equals(null)){
						break;
					}
					card7.setIcon(ph[i].getIcon());
					break;
				case 7:
					if(ph[i].equals(null)){
						break;
					}
					card8.setIcon(ph[i].getIcon());
					break;
				case 8:
					if(ph[i].equals(null)){
						break;
					}
					card9.setIcon(ph[i].getIcon());
					break;
				case 9:
					if(ph[i].equals(null)){
						break;
					}
					card10.setIcon(ph[i].getIcon());
					break;
				case 10:
					if(ph[i] == null){
						card11.setOpaque(false);
						card11.setContentAreaFilled(false);
						card11.setBorderPainted(true);
						break;
					}
					card11.setIcon(ph[i].getIcon());
					break;
			}
		}
	}
}