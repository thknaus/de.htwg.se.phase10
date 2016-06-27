package de.htwg.se.phase10.aview.gui;


import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.util.observer.Event;
import de.htwg.se.phase10.util.observer.IObserver;

import java.awt.*;

public class Phase10gui extends JFrame implements IObserver{

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private IPhase10Controller controller;
	JFrame field;
	JMenuBar Phase10MenuBar;
	Color starbucks = new Color(0x00592D);
	
	public Phase10gui(IPhase10Controller con){
//MEnuBar einbinden	
		this.controller = con;
		Phase10MenuBar menuB = new Phase10MenuBar(this, controller);
		this.setJMenuBar(menuB.menuBar);
		
//Hauptfenster bauen.	
		mainPanel = new JPanel();
		setTitle("Phase10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1920, 1040));
		setResizable(false);
		//falls wir eine farbe haben wollen
		mainPanel.setBackground(starbucks);

		
		mainPanel.add(new DeckStackField());
		mainPanel.add(new Archiv());
		mainPanel.add(new HandCard());
		mainPanel.add(new ToolBar());
		this.setContentPane(mainPanel);

	
        
//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	public void setNofPlayer(){
		mainPanel.add(new NofPlayer());
	}

	@Override
	public void update(Event e) {
		// TODO Auto-generated method stub
		
	}
}
