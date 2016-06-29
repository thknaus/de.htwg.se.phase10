package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckStackField extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	JTextArea textfield;
    JButton stack, deck, narchiv, phasen1, halter, phasen2;
    JPanel STD;
    Phase10gui gui;
    Color starbucks = new Color(0x00592D);
    
	public DeckStackField(Phase10gui g, IPhase10Controller con) {
		
		this.controller = con;
		this.gui = g;
		
		STD = new JPanel();
		STD.setName("Deck and Stack");
		STD.setPreferredSize(new Dimension(1900, 130));
		STD.setBackground(starbucks);
		this.setBackground(starbucks);
		
		phasen1 = new JButton();
		phasen1.setIcon(new ImageIcon(new ImageIcon("./img/phasen1.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
		phasen1.setPreferredSize(new Dimension(100,120));
		phasen1.setOpaque(false);
		phasen1.setContentAreaFilled(true);
		phasen1.setBorderPainted(false);
        STD.add(phasen1);
        phasen2 = new JButton();
        phasen2.setIcon(new ImageIcon(new ImageIcon("./img/phasen2.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
        phasen2.setPreferredSize(new Dimension(100,120));
        phasen2.setOpaque(false);
        phasen2.setContentAreaFilled(true);
        phasen2.setBorderPainted(false);
        STD.add(phasen2);
        
        deck = new JButton();
        deck.setIcon(new ImageIcon(new ImageIcon("./img/deck2.png").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
        deck.setPreferredSize(new Dimension(100,120));
        STD.add(deck);
        deck.addActionListener(this);        
        
        stack = new JButton();
        stack.setIcon(null);
		stack.setOpaque(false);
		stack.setContentAreaFilled(false);
		stack.setBorderPainted(true);
        stack.setName("Stack");
        stack.setPreferredSize(new Dimension(100,120));
        STD.add(stack);
        stack.addActionListener(this);
        
        halter = new JButton();
        halter.setPreferredSize(new Dimension(1000,120));
        halter.setOpaque(false);
        halter.setContentAreaFilled(false);
        halter.setBorderPainted(false);
        STD.add(halter);
        
        textfield = new JTextArea("Welcome to Phase 10.");
        textfield.setPreferredSize(new Dimension(400,100));
        textfield.setEditable(false);
        STD.add(textfield);
        this.add(STD);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == stack){
			if(!controller.getCardFromStack()){
				textfield.setText("You have already 11 Cards on your hand.");
			}else{
				gui.handCardUpdate();
				controller.setPulledCard();
				textfield.setText("Pulled card from Stack");
			}
		}else if(source == deck){
			if(!controller.getCardFromDeck()){
				textfield.setText("You have already 11 Cards on your hand.");
			}else{
				gui.handCardUpdate();
				controller.setPulledCard();
				textfield.setText("Pulled card from deck.");
			}
		}

	}
	public void updateStack(){
		if(controller.getStack() == null){
			stack.setOpaque(false);
			stack.setContentAreaFilled(false);
			stack.setBorderPainted(true);
			stack.setIcon(null);
		}else{
			stack.setIcon(controller.getStack().getIcon());
		}
	}
}
