package de.htwg.se.phase10.aview.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckStackField extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	
	private JTextField textfield;
    private JButton stack, deck;
    
	public DeckStackField() {
		
        deck = new JButton("Deck");
        deck.setPreferredSize(new Dimension(240,100));
        this.add(deck);
        deck.addActionListener(this);
        //Für Bild anstelle des Button
        //deck.setIcon(new ImageIcon("PFAD")); 
        
        stack = new JButton("Stack");
        stack.setPreferredSize(new Dimension(240,100));
        this.add(stack);
        stack.addActionListener(this);
        
        textfield = new JTextField("Hier kommen die Meldungen");
        textfield.setPreferredSize(new Dimension(482,100));
        textfield.setEditable(false);
        this.add(textfield);
	}
	
	public void actionPerformed(ActionEvent e) {

	}
	
}
