package de.htwg.se.phase10.aview.gui;


import javax.swing.*;

import de.htwg.se.phase10.controller.GameStatus;
import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.UpdateStack;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.util.observer.Event;
import de.htwg.se.phase10.util.observer.IObserver;

import java.awt.*;

public class Phase10gui extends JFrame implements IObserver{

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private IPhase10Controller controller;
	
	private HandCard hand;
	private ToolBar toolb;
	private DeckStackField dsfield;
	private ArchiveField arch;
	
	JFrame field;
	JMenuBar Phase10MenuBar;
	Color starbucks = new Color(0x00592D);
	
	public Phase10gui(IPhase10Controller con){
//MEnuBar einbinden	
		this.controller = con;
		this.controller.addObserver(this);
		Phase10MenuBar menuB = new Phase10MenuBar(this, controller);
		this.setJMenuBar(menuB.menuBar);
		
//Hauptfenster bauen.	
		mainPanel = new JPanel();
		setTitle("Phase10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1920, 1040));
		setResizable(true);
		//falls wir eine farbe haben wollen
		mainPanel.setBackground(starbucks);

		dsfield = new DeckStackField(this, controller);
		arch = new ArchiveField(this, controller);
		hand = new HandCard(this, controller);
		toolb = new ToolBar(this, controller);
		
		mainPanel.add(dsfield);
		mainPanel.add(arch);
		mainPanel.add(hand);
		mainPanel.add(toolb);
		this.setContentPane(mainPanel);
	
        
//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	
	public void setNofPlayer(){
		new NofPlayer(this, controller);
	}

	public void Name() {
		new Name(this, controller);
	}
	
	@Override
	public void update(Event e) {
		if(e instanceof UpdateStack){
			dsfield.updateStack();
		}
	}

	public void handCardUpdate() {
		this.hand.updateHand();
		controller.notifyObservers();
	}

	public void deckStackInfo(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append("Player " + controller.getCurrentPlayer().getName() + " it´s your turn.\n");
		sb.append(controller.getCurrentPlayer().getCurrentPhase() +"\n");
		sb.append(s);
		dsfield.textfield.setText(sb.toString());
	}
	public void updateArchive(Card c){
		this.arch.updateArchive(c);
	}
}
