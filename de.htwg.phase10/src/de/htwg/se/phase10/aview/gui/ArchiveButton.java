package de.htwg.se.phase10.aview.gui;

import javax.swing.JButton;

public class ArchiveButton extends JButton{

	private static final long serialVersionUID = 1L;
	private String name;
	public ArchiveButton(String n){
		this.name = n;
	}
	public String getName(){
		return this.name;
	}
	
	
}
