/*Brauchen wir shortcuts für das menu? wenn nicht wieder raus*/


package de.htwg.se.phase10.gui;

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
		
		JMenuItem NewGame = new JMenuItem("New Game");
		NewGame.setMnemonic(KeyEvent.VK_N);
		menu.add(NewGame);
		
		
		menu.addSeparator();
        submenu = new JMenu("choose number of player");
        submenu.setMnemonic(KeyEvent.VK_S);
        menu.add(submenu);
 
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        
        rbMenuItem = new JRadioButtonMenuItem("2");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_2);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("3");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_3);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("4");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_4);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("5");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_5);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("6");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_6);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
		JMenuItem Quit = new JMenuItem("Quit");
		Quit.setMnemonic(KeyEvent.VK_Q);
		menu.add(Quit);
		
        //Build shortcut menu.
        menu = new JMenu("shortcuts");
        menu.setMnemonic(KeyEvent.VK_S);
        menuBar.add(menu);
        
        
        menuItem = new JMenuItem("drop card to archiv",KeyEvent.VK_A);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("drop card to stack",KeyEvent.VK_F);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("take card from stack",KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("take card from deck",KeyEvent.VK_D);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
        menu.add(menuItem);
        
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
		
	}
}
