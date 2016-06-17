/*Brauchen wir shortcuts für das menu? wenn nicht wieder raus*/


package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;


public class Phase10MenuBar extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu menu, submenu; 
	JRadioButtonMenuItem rbMenuItem;
	JMenuItem quit;
	
	
	public Phase10MenuBar(){
		//Hauptfenster
		this.setTitle("Phase10");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(1024, 840));
		
		//Build Menu menu.
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		//Menu1:
		menu = new JMenu("Menu");
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
        
        quit = new JMenuItem("Quit");
        quit.setMnemonic(KeyEvent.VK_Q);
        quit.addActionListener(this);
		menu.add(quit);

        
		//Hauptfenster zusammenbauen
		this.setJMenuBar(menuBar);
		this.setLayout(new FlowLayout());
		
		//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	

	public static void main(String[] args){
		JFrame myApp = new Phase10MenuBar();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
    	Object source = e.getSource();
    	if(source == quit) {
    		JOptionPane.setDefaultLocale(Locale.ENGLISH);
    		int n = JOptionPane.showConfirmDialog(this, "Quit Phase10?", "Close Phase10?", JOptionPane.YES_NO_OPTION);
    		if(n == JOptionPane.YES_OPTION){
    			System.exit(0);
    		} else if(n == JOptionPane.NO_OPTION){
    			return;
    		}
    	}

    }
}

