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

		start = new JMenuItem("start new game");
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
		
		
		if(source == start){
			controller.setNewGame(true);
			NofPlayer nop= new NofPlayer();
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
