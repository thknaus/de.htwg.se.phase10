package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckStackField extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	JTextField textfield;
    JButton stack, deck, narchiv;
    JPanel STD;
    Phase10gui gui;
    Color starbucks = new Color(0x00592D);
    ImageIcon deckCard, sCard;
    
	public DeckStackField(Phase10gui g, IPhase10Controller con) {
		
		this.controller = con;
		this.gui = g;
		
		deckCard = new ImageIcon(new ImageIcon("./img/deck2.png").getImage().getScaledInstance(240, 100, java.awt.Image.SCALE_SMOOTH));
		sCard = new ImageIcon(new ImageIcon("./img/yellow_08.jpg").getImage().getScaledInstance(80, 100, java.awt.Image.SCALE_SMOOTH));

		STD = new JPanel();
		STD.setName("Deck and Stack");
		STD.setPreferredSize(new Dimension(1900, 120));
		STD.setBackground(starbucks);
		this.setBackground(starbucks);
		
        deck = new JButton(deckCard);
        deck.setPreferredSize(new Dimension(240,100));
        STD.add(deck);
        deck.addActionListener(this);
        
        
        stack = new JButton(sCard);
        stack.setName("Stack");
        stack.setPreferredSize(new Dimension(80,100));
        STD.add(stack);
        stack.addActionListener(this);
        
        narchiv = new JButton("New Aarchiv");
        narchiv.setPreferredSize(new Dimension(240,100));
        STD.add(narchiv);
        stack.addActionListener(this);
        
        textfield = new JTextField("Hier kommen die Meldungen");
        textfield.setPreferredSize(new Dimension(1000,100));
        textfield.setEditable(false);
        STD.add(textfield);
        this.add(STD);
	}
	
	public void actionPerformed(ActionEvent e) {

	}
	
}
