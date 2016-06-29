package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.UpdateStack;
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
        card1.setOpaque(false);
        card1.setContentAreaFilled(false);
        card1.setBorderPainted(true);
	    this.add(card1);
	    card1.addActionListener(this);  
	    
		card2 = new JButton();
		card2.setPreferredSize(new Dimension(100,120));
        card2.setOpaque(false);
        card2.setContentAreaFilled(false);
        card2.setBorderPainted(true);
	    this.add(card2);
	    card2.addActionListener(this);
	    
		card3 = new JButton();
		card3.setPreferredSize(new Dimension(100,120));
        card3.setOpaque(false);
        card3.setContentAreaFilled(false);
        card3.setBorderPainted(true);
	    this.add(card3);
	    card3.addActionListener(this);
	    
		card4 = new JButton();
		card4.setPreferredSize(new Dimension(100,120));
        card4.setOpaque(false);
        card4.setContentAreaFilled(false);
        card4.setBorderPainted(true);
	    this.add(card4);
	    card4.addActionListener(this);
	    
		card5 = new JButton();
		card5.setPreferredSize(new Dimension(100,120));
        card5.setOpaque(false);
        card5.setContentAreaFilled(false);
        card5.setBorderPainted(true);
	    this.add(card5);
	    card5.addActionListener(this);
	    
		card6 = new JButton();
		card6.setPreferredSize(new Dimension(100,120));
        card6.setOpaque(false);
        card6.setContentAreaFilled(false);
        card6.setBorderPainted(true);
	    this.add(card6);
	    card6.addActionListener(this);
	    
		card7 = new JButton();
		card7.setPreferredSize(new Dimension(100,120));
        card7.setOpaque(false);
        card7.setContentAreaFilled(false);
        card7.setBorderPainted(true);
	    this.add(card7);
	    card7.addActionListener(this);
	    
		card8 = new JButton();
		card8.setPreferredSize(new Dimension(100,120));
        card8.setOpaque(false);
        card8.setContentAreaFilled(false);
        card8.setBorderPainted(true);
	    this.add(card8);
	    card8.addActionListener(this);
	    
		card9 = new JButton();
		card9.setPreferredSize(new Dimension(100,120));
        card9.setOpaque(false);
        card9.setContentAreaFilled(false);
        card9.setBorderPainted(true);
	    this.add(card9);
	    card9.addActionListener(this);
	    
		card10 = new JButton();
		card10.setPreferredSize(new Dimension(100,120));
        card10.setOpaque(false);
        card10.setContentAreaFilled(false);
        card10.setBorderPainted(true);
	    this.add(card10);
	    card10.addActionListener(this);
	    
		card11 = new JButton();
		card11.setPreferredSize(new Dimension(100,120));
        card11.setOpaque(false);
        card11.setContentAreaFilled(false);
        card11.setBorderPainted(true);
	    this.add(card11);
	    card11.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(controller.pulledCard()){
			if(source == card1){
				if(controller.getDropCardStack()){
					controller.dropCardStack(1);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[0];
					controller.dropCardArchive(1);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card2){
				if(controller.getDropCardStack()){
					controller.dropCardStack(2);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[1];
					controller.dropCardArchive(2);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card3){
				if(controller.getDropCardStack()){
					controller.dropCardStack(3);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[2];
					controller.dropCardArchive(3);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card4){
				if(controller.getDropCardStack()){
					controller.dropCardStack(4);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[3];
					controller.dropCardArchive(4);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card5){
				if(controller.getDropCardStack()){
					controller.dropCardStack(5);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[4];
					controller.dropCardArchive(5);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card6){
				if(controller.getDropCardStack()){
					controller.dropCardStack(6);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[5];
					controller.dropCardArchive(6);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card7){
				if(controller.getDropCardStack()){
					controller.dropCardStack(7);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[6];
					controller.dropCardArchive(7);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card8){
				if(controller.getDropCardStack()){
					controller.dropCardStack(8);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[7];
					controller.dropCardArchive(8);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card9){
				if(controller.getDropCardStack()){
					controller.dropCardStack(9);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[8];
					controller.dropCardArchive(9);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card10){
				if(controller.getDropCardStack()){
					controller.dropCardStack(10);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[9];
					controller.dropCardArchive(10);
					gui.updateArchive(c);
				}
				updateHand();
			}else if(source == card11){
				if(controller.getDropCardStack()){
					controller.dropCardStack(11);
					controller.setDropedCardStack();
					controller.setPulledCard();
					controller.setCurrentPlayerNumber();
					controller.notifyObservers(new UpdateStack());
					if(controller.checkStackTop()){
						gui.deckStackInfo("Player skiped - Skip card");
					}
					if(controller.getRoundOver()){
						controller.startNewRound();
						gui.deckStackInfo(controller.getStatus() + "-" + " Next ROUND!!!");
					}
				}else{
					Card c = controller.getCurrentPlayer().getHand()[10];
					controller.dropCardArchive(11);
					gui.updateArchive(c);
				}
				updateHand();
			}
		}else{
			gui.deckStackInfo("You have to pull a card first.");
		}
	}
	public void updateHand(){
		Card[] ph = controller.getCurrentPlayer().getHand();
		
		for(int i = 0; i <= ph.length; i++){
			switch(i){
				case 0:
					if(ph[i] == null){
						card1.setIcon(null);
						break;
					}
					card1.setIcon(ph[i].getIcon());
					break;
				case 1:
					if(ph[i] == null){
						card2.setIcon(null);
						break;
					}
					card2.setIcon(ph[i].getIcon());
					break;
				case 2:
					if(ph[i] == null){
						card3.setIcon(null);
						break;
					}
					card3.setIcon(ph[i].getIcon());
					break;
				case 3:
					if(ph[i] == null){
						card4.setIcon(null);
						break;
					}
					card4.setIcon(ph[i].getIcon());
					break;
				case 4:
					if(ph[i] == null){
						card5.setIcon(null);
						break;
					}
					card5.setIcon(ph[i].getIcon());
					break;
				case 5:
					if(ph[i] == null){
						card6.setIcon(null);
						break;
					}
					card6.setIcon(ph[i].getIcon());
					break;
				case 6:
					if(ph[i] == null){
						card7.setIcon(null);
						break;
					}
					card7.setIcon(ph[i].getIcon());
					break;
				case 7:
					if(ph[i] == null){
						card8.setIcon(null);
						break;
					}
					card8.setIcon(ph[i].getIcon());
					break;
				case 8:
					if(ph[i] == null){
						card9.setIcon(null);
						break;
					}
					card9.setIcon(ph[i].getIcon());
					break;
				case 9:
					if(ph[i] == null){
						card10.setIcon(null);
						break;
					}
					card10.setIcon(ph[i].getIcon());
					break;
				case 10:
					if(ph[i] == null){
						card11.setIcon(null);
						break;
					}
					card11.setIcon(ph[i].getIcon());
					break;
			}
		}
	}
}