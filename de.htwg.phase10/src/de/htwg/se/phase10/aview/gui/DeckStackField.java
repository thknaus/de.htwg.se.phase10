package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckStackField extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	
	JTextField textfield;
    JButton stack, deck, narchiv;
    JPanel STD;
    
    Color starbucks = new Color(0x00592D);
    
	public DeckStackField() {
			
		STD = new JPanel();
		STD.setName("Deck and Stack");
		STD.setPreferredSize(new Dimension(1900, 120));
		STD.setBackground(starbucks);
		this.setBackground(starbucks);
		
        deck = new JButton("Deck");
        deck.setPreferredSize(new Dimension(240,100));
        STD.add(deck);
        deck.addActionListener(this);
        //Für Bild anstelle des Button
        //deck.setIcon(new ImageIcon("PFAD")); 
        
        stack = new JButton("Stack");
        stack.setPreferredSize(new Dimension(240,100));
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
