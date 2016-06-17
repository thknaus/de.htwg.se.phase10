/*Brauchen wir shortcuts für das menu? wenn nicht wieder raus*/


package de.htwg.se.phase10.aview.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class field extends JFrame implements ActionListener{
	JMenuBar menuBar;
	JMenu menu, submenu; 
	JRadioButtonMenuItem rbMenuItem;
	JMenuItem menuItem;
	
	JMenuItem quit;
	
	
	public field(){
		//Hauptfenster
		this.setTitle("Phase10");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(1024, 840));
		
		//Build Menu menu.
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		//Menu1:
		JMenu menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_M);
		menuBar.add(menu);
		
		
		menu.addSeparator();
        submenu = new JMenu("New Game");
        submenu.setMnemonic(KeyEvent.VK_S);
        menu.add(submenu);
 
		JMenuItem numberofplayer = new JMenuItem("choose number of player");
		submenu.add(numberofplayer);
		
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        
        rbMenuItem = new JRadioButtonMenuItem("2 Players");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_2);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("3 Players");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_3);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("4 Players");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_4);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("5 Players");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_5);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("6 Players");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_6);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
		JMenuItem quit = new JMenuItem("Quit");
		quit.setMnemonic(KeyEvent.VK_Q);
		menu.add(quit);

        
		//Hauptfenster zusammenbauen
		this.setJMenuBar(menuBar);
		this.setLayout(new FlowLayout());
		
		//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	

	public static void main(String[] args){
		JFrame myApp = new field();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
