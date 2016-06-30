package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.model.impl.Card;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ArchiveField extends JPanel{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	JButton abutton;
	ArrayList<JPanel> archivef;
	
	Phase10gui gui;
	Color starbucksb = new Color(0xEAC784);
	
	public ArchiveField(Phase10gui g, IPhase10Controller con) {
		
		this.controller = con;
		this.gui = g;

		archivef = new ArrayList<>();
		ImageIcon buttonNA = new ImageIcon(new ImageIcon("./img/na.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH));
		ImageIcon buttonC = new ImageIcon(new ImageIcon("./img/check.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH));
		for(int i = 1 ; i < 6; i++){
			JPanel archivefield = new JPanel();
			archivefield.setLayout(new FlowLayout(FlowLayout.LEFT));
			archivefield.setPreferredSize(new Dimension(1790,130));
			archivefield.setBackground(starbucksb);
            archivef.add(archivefield);
    		this.setBackground(starbucksb);
            this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
            this.add(archivefield);
		}


        
        for(int i = 0; i < archivef.size(); i++){
        	for(int j = 0; j <= 16; j++){
        		ArchiveButton button;
        		if(j == 0){
        			button = new ArchiveButton("a" + i + "bn");
        		    button.setIcon(buttonNA);
        		    button.setPreferredSize(new Dimension(100,120));
        		}else if(j == 1){
        			button = new ArchiveButton("a" + i + "bc");
        			button.setIcon(buttonC);
        	        button.setPreferredSize(new Dimension(100,120));
        		}else{
        			button = new ArchiveButton("a" + i + "b"+(j-1));
        	        button.setPreferredSize(new Dimension(100,120));
        	        button.setOpaque(false);
        	        button.setContentAreaFilled(false);
        	        button.setBorderPainted(true);
        		}
        		button.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
							if(button.getName().endsWith("n")){
								controller.newArch();
								controller.notifyObservers();
								gui.deckStackInfo("Choose your cards to drop to Archive.");
								button.setBorderPainted(true);
							}else if(button.getName().endsWith("c")){
								controller.setCheckPhase();
								button.setBorderPainted(true);
								if(controller.checkPhase(1)){
									gui.deckStackInfo("Phase Achieved drop all your cards to end this round.");
									controller.setNextPhase();
									controller.setCheckPhase();
								}else{
									gui.deckStackInfo("Phase not completed.");
									controller.setCheckPhase();
								}
							}else if(button.getName().endsWith("1")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("2")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("3")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("4")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("5")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("6")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("7")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("8")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("9")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("10")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("11")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("12")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("13")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("14")){
								abutton = button;
								controller.setArchive(1);
							}else if(button.getName().endsWith("15")){
								abutton = button;
								controller.setArchive(1);
							}
						}
					});
        		archivef.get(i).add(button);
        	}
        }

	}
	public void updateArchive(Card c) {
		controller.getArchive();
		abutton.setIcon(c.getIcon());
	}
}