package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ToolBar extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	private JButton stack;
	Color starbucks = new Color(0x00592D);
	Phase10gui gui;
	
	public ToolBar(Phase10gui g, IPhase10Controller con) {
		this.controller = con;
		this.gui = g;
		
		this.setBackground(starbucks);
	    stack = new JButton("Drop Stack");
	    stack.setPreferredSize(new Dimension(100,30));
	    this.add(stack);
	    stack.addActionListener(this);
	    
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == stack){
			if(!controller.pulledCard()){
				gui.deckStackInfo("You have to pull a card first.");
			}else{
				controller.setDropedCardStack();
				gui.deckStackInfo("Choose a card: ");
				controller.notifyObservers();
			}
		}
	}
}
