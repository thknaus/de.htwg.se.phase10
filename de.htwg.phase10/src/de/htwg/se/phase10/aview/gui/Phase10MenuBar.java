package de.htwg.se.phase10.aview.gui;

import javax.sound.midi.ControllerEventListener;
import javax.swing.*;
import de.htwg.se.phase10.controller.IPhase10Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;

public class Phase10MenuBar extends JMenuBar implements ActionListener{

	private static final long serialVersionUID = 1L;
	protected IPhase10Controller controller;
	
	JMenuBar menuBar;
	JMenu menu, submenu; 
	JRadioButtonMenuItem rbMenuItem6, rbMenuItem5, rbMenuItem4;
	JRadioButtonMenuItem rbMenuItem3, rbMenuItem2, rbMenuItem1;
	JMenuItem quit, start;
	
	public Phase10MenuBar(){
	//Build Menu menu.
		menuBar = new JMenuBar();
		
		menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_M);
		menuBar.add(menu);
					
					
		menu.addSeparator();
		submenu = new JMenu("New Game");
		submenu.setMnemonic(KeyEvent.VK_S);
		submenu.addActionListener(this);
		menu.add(submenu);
			 
		JMenuItem numberofplayer = new JMenuItem("choose number of player");
		submenu.add(numberofplayer);

		menu.addSeparator();
		
		
		ButtonGroup group = new ButtonGroup();			     
			        
		rbMenuItem2 = new JRadioButtonMenuItem("2 Players");
		rbMenuItem2.setSelected(true);
		rbMenuItem2.setMnemonic(KeyEvent.VK_3);
		group.add(rbMenuItem2);
		rbMenuItem2.addActionListener(this);
		submenu.add(rbMenuItem2);
			        
		rbMenuItem3 = new JRadioButtonMenuItem("3 Players");
		rbMenuItem3.setSelected(true);
		rbMenuItem3.setMnemonic(KeyEvent.VK_4);
		group.add(rbMenuItem3);
		rbMenuItem3.addActionListener(this);
		submenu.add(rbMenuItem3);
			        
		rbMenuItem4 = new JRadioButtonMenuItem("4 Players");
		rbMenuItem4.setSelected(false);
		rbMenuItem4.setMnemonic(KeyEvent.VK_5);
		group.add(rbMenuItem4);
		rbMenuItem4.addActionListener(this);
		submenu.add(rbMenuItem4);
		
		rbMenuItem5 = new JRadioButtonMenuItem("5 Players");
		rbMenuItem5.setSelected(true);
		rbMenuItem5.setMnemonic(KeyEvent.VK_2);
		group.add(rbMenuItem5);
		rbMenuItem5.addActionListener(this);
		submenu.add(rbMenuItem5);
			        
		rbMenuItem6 = new JRadioButtonMenuItem("6 Players");
		rbMenuItem6.setSelected(false);
		rbMenuItem6.setMnemonic(KeyEvent.VK_6);
		group.add(rbMenuItem6);
		rbMenuItem6.addActionListener(this);
		submenu.add(rbMenuItem6);
		
		start = new JMenuItem("start");
		start.setMnemonic(KeyEvent.VK_Q);
		start.addActionListener(this);
		menu.add(start);
			        
		quit = new JMenuItem("Quit");
		quit.setMnemonic(KeyEvent.VK_Q);
		quit.addActionListener(this);
		menu.add(quit);

	}
	//ActionEvent
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
		if(source == rbMenuItem2){
			controller.checkNewGame();
		}
		if(source == rbMenuItem3){
			
		}
		if(source == rbMenuItem4){
			
		}
		if(source == rbMenuItem5){
			
		}
		if(source == rbMenuItem6){
			
		}
	}

}
