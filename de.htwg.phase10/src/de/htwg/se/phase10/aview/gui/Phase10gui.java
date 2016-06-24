package de.htwg.se.phase10.aview.gui;


import javax.swing.*;
import java.awt.*;

public class Phase10gui extends JFrame{

	private static final long serialVersionUID = 1L;
	
	JFrame field;
	JMenuBar Phase10MenuBar;
	
	public Phase10gui(){
		
//MEnuBar einbinden		
		Phase10MenuBar menuB = new Phase10MenuBar();
		this.setJMenuBar(menuB.menuBar);
		
//Hauptfenster bauen.	
		JPanel mainPanel = new JPanel();
		setTitle("Phase10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1920, 1040));
		setResizable(false);
		//falls wir eine farbe haben wollen
		//mainPanel.setBackground(Color.BLACK);

		
		mainPanel.add(new DeckStackField());
		mainPanel.add(new Archiv());
		mainPanel.add(new HandCard());
		mainPanel.add(new ToolBar());
		
		this.setContentPane(mainPanel);

	
        
//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	



	//main	
    public static void main(String[] args) {
		@SuppressWarnings("unused")
		JFrame myApp = new Phase10gui();
    }
}
