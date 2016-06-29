package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.model.impl.Card;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchiveField extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	JPanel archive1;
	JButton archive1bn, archive1bc, archive1b1, archive1b2, archive1b3, archive1b4, archive1b5, archive1b6 ,archive1b7, archive1b8;
	JButton archive1b9, archive1b10, archive1b11, archive1b12, archive1b13, archive1b14, archive1b15;
	JButton archive2b1, archive2b2, archive2b3, archive2b4, archive2b5, archive2b6, archive2b7, archive2b8 ,archive2b9, archive2b10;
	JButton archive2b11, archive2b12, archive2b13, archive2b14, archive2b15, archive2b16, archive2b17;
	JButton archive3b1, archive3b2, archive3b3, archive3b4, archive3b5, archive3b6, archive3b7, archive3b8 ,archive3b9, archive3b10;
	JButton archive3b11, archive3b12, archive3b13, archive3b14, archive3b15, archive3b16, archive3b17;
	JButton	archive2, archive3, archive4;
	JButton archive5, archive6, archive7, archive8;
	JButton archive9, archive10;
	
	String abutton;
	
	Phase10gui gui;
	Color starbucksb = new Color(0xEAC784);
	
	public ArchiveField(Phase10gui g, IPhase10Controller con) {

		this.controller = con;
		this.gui = g;
		
		JPanel archivefield1 = new JPanel();
		archivefield1.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield1.setPreferredSize(new Dimension(1790,130));
		archivefield1.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield1);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield1);
        
        
        
        
        archive1bn = new JButton("New Archive");
        archive1bn.setPreferredSize(new Dimension(100,120));
        archive1bn.setOpaque(false);
        archive1bn.setContentAreaFilled(false);
        archive1bn.setBorderPainted(true);
        archive1bn.addActionListener(this);
        archivefield1.add(archive1bn);
        
        archive1bc = new JButton("Check");
        archive1bc.setPreferredSize(new Dimension(100,120));
        archive1bc.setOpaque(false);
        archive1bc.setContentAreaFilled(false);
        archive1bc.setBorderPainted(true);
        archive1bc.addActionListener(this);

        archive1b1 = new JButton("");
        archive1b1.setPreferredSize(new Dimension(100,120));
        archive1b1.setOpaque(false);
        archive1b1.setContentAreaFilled(false);
        archive1b1.setBorderPainted(true);
        archive1b1.addActionListener(this);
        
        archive1b2 = new JButton("");
        archive1b2.setPreferredSize(new Dimension(100,120));
        archive1b2.setOpaque(false);
        archive1b2.setContentAreaFilled(false);
        archive1b2.setBorderPainted(true);
        archive1b2.addActionListener(this);
        
        archive1b3 = new JButton("");
        archive1b3.setPreferredSize(new Dimension(100,120));
        archive1b3.setOpaque(false);
        archive1b3.setContentAreaFilled(false);
        archive1b3.setBorderPainted(true);
        archive1b3.addActionListener(this);
        
        archive1b4 = new JButton("");
        archive1b4.setPreferredSize(new Dimension(100,120));
        archive1b4.setOpaque(false);
        archive1b4.setContentAreaFilled(false);
        archive1b4.setBorderPainted(true);
        archive1b4.addActionListener(this);
        
        archive1b5 = new JButton("");
        archive1b5.setPreferredSize(new Dimension(100,120));
        archive1b5.setOpaque(false);
        archive1b5.setContentAreaFilled(false);
        archive1b5.setBorderPainted(true);
        archive1b5.addActionListener(this);

        archive1b6 = new JButton("");
        archive1b6.setPreferredSize(new Dimension(100,120));
        archive1b6.setOpaque(false);
        archive1b6.setContentAreaFilled(false);
        archive1b6.setBorderPainted(true);
        archive1b6.addActionListener(this);
        
        archive1b7 = new JButton("");
        archive1b7.setPreferredSize(new Dimension(100,120));
        archive1b7.setOpaque(false);
        archive1b7.setContentAreaFilled(false);
        archive1b7.setBorderPainted(true);
        archive1b7.addActionListener(this);
        
        archive1b8 = new JButton("");
        archive1b8.setPreferredSize(new Dimension(100,120));
        archive1b8.setOpaque(false);
        archive1b8.setContentAreaFilled(false);
        archive1b8.setBorderPainted(true);
        archive1b8.addActionListener(this);
        
        archive1b9 = new JButton("");
        archive1b9.setPreferredSize(new Dimension(100,120));
        archive1b9.setOpaque(false);
        archive1b9.setContentAreaFilled(false);
        archive1b9.setBorderPainted(true);
        archive1b9.addActionListener(this);
        
        archive1b10 = new JButton("");
        archive1b10.setPreferredSize(new Dimension(100,120));
        archive1b10.setOpaque(false);
        archive1b10.setContentAreaFilled(false);
        archive1b10.setBorderPainted(true);
        archive1b10.addActionListener(this);
        
        archive1b11 = new JButton("");
        archive1b11.setPreferredSize(new Dimension(100,120));
        archive1b11.setOpaque(false);
        archive1b11.setContentAreaFilled(false);
        archive1b11.setBorderPainted(true);
        archive1b11.addActionListener(this);
        
        archive1b12 = new JButton("");
        archive1b12.setPreferredSize(new Dimension(100,120));
        archive1b12.setOpaque(false);
        archive1b12.setContentAreaFilled(false);
        archive1b12.setBorderPainted(true);
        archive1b12.addActionListener(this);
        
        archive1b13 = new JButton("");
        archive1b13.setPreferredSize(new Dimension(100,120));
        archive1b13.setOpaque(false);
        archive1b13.setContentAreaFilled(false);
        archive1b13.setBorderPainted(true);
        archive1b13.addActionListener(this);
        
        archive1b14 = new JButton("");
        archive1b14.setPreferredSize(new Dimension(100,120));
        archive1b14.setOpaque(false);
        archive1b14.setContentAreaFilled(false);
        archive1b14.setBorderPainted(true);
        archive1b14.addActionListener(this);
        
        archive1b15 = new JButton("");
        archive1b15.setPreferredSize(new Dimension(100,120));
        archive1b15.setOpaque(false);
        archive1b15.setContentAreaFilled(false);
        archive1b15.setBorderPainted(true);
        archive1b15.addActionListener(this);
        
        archivefield1.add(archive1bc);
        archivefield1.add(archive1b1);
        archivefield1.add(archive1b2);
        archivefield1.add(archive1b3);
        archivefield1.add(archive1b4);
        archivefield1.add(archive1b5);
        archivefield1.add(archive1b6);
        archivefield1.add(archive1b7);
        archivefield1.add(archive1b8);
        archivefield1.add(archive1b9);
        archivefield1.add(archive1b10);
        archivefield1.add(archive1b11);
        archivefield1.add(archive1b12);
        archivefield1.add(archive1b13);
        archivefield1.add(archive1b14);
        archivefield1.add(archive1b15);

		JPanel archivefield2 = new JPanel();
		archivefield2.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield2.setPreferredSize(new Dimension(1790,130));
		archivefield2.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield2);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield2);
        
        
        
        
        /*archive2bn = new JButton("New Archive");
        archive2bn.setPreferredSize(new Dimension(100,120));
        archive2bn.setOpaque(false);
        archive2bn.setContentAreaFilled(false);
        archive2bn.setBorderPainted(true);
        archive2bn.addActionListener(this);
        archivefield2.add(archive2b1);
        
        archive2bc = new JButton("Check");
        archive2bc.setPreferredSize(new Dimension(100,120));
        archive2bc.setOpaque(false);
        archive2bc.setContentAreaFilled(false);
        archive2bc.setBorderPainted(true);
        archive2bc.addActionListener(this);

        archive2b1 = new JButton("");
        archive2b1.setPreferredSize(new Dimension(100,120));
        archive2b1.setOpaque(false);
        archive2b1.setContentAreaFilled(false);
        archive2b1.setBorderPainted(true);
        archive2b1.addActionListener(this);
        
        archive2b4 = new JButton("");
        archive2b4.setPreferredSize(new Dimension(100,120));
        archive2b4.setOpaque(false);
        archive2b4.setContentAreaFilled(false);
        archive2b4.setBorderPainted(true);
        archive2b4.addActionListener(this);
        
        archive2b5 = new JButton("");
        archive2b5.setPreferredSize(new Dimension(100,120));
        archive2b5.setOpaque(false);
        archive2b5.setContentAreaFilled(false);
        archive2b5.setBorderPainted(true);
        archive2b5.addActionListener(this);
        
        archive2b6 = new JButton("");
        archive2b6.setPreferredSize(new Dimension(100,120));
        archive2b6.setOpaque(false);
        archive2b6.setContentAreaFilled(false);
        archive2b6.setBorderPainted(true);
        archive2b6.addActionListener(this);
        
        archive2b7 = new JButton("");
        archive2b7.setPreferredSize(new Dimension(100,120));
        archive2b7.setOpaque(false);
        archive2b7.setContentAreaFilled(false);
        archive2b7.setBorderPainted(true);
        archive2b7.addActionListener(this);

        archive2b8 = new JButton("");
        archive2b8.setPreferredSize(new Dimension(100,120));
        archive2b8.setOpaque(false);
        archive2b8.setContentAreaFilled(false);
        archive2b8.setBorderPainted(true);
        archive2b8.addActionListener(this);
        
        archive2b9 = new JButton("");
        archive2b9.setPreferredSize(new Dimension(100,120));
        archive2b9.setOpaque(false);
        archive2b9.setContentAreaFilled(false);
        archive2b9.setBorderPainted(true);
        archive2b9.addActionListener(this);
        
        archive2b10 = new JButton("");
        archive2b10.setPreferredSize(new Dimension(100,120));
        archive2b10.setOpaque(false);
        archive2b10.setContentAreaFilled(false);
        archive2b10.setBorderPainted(true);
        archive2b10.addActionListener(this);
        
        archive2b11 = new JButton("");
        archive2b11.setPreferredSize(new Dimension(100,120));
        archive2b11.setOpaque(false);
        archive2b11.setContentAreaFilled(false);
        archive2b11.setBorderPainted(true);
        archive2b11.addActionListener(this);
        
        archive2b12 = new JButton("");
        archive2b12.setPreferredSize(new Dimension(100,120));
        archive2b12.setOpaque(false);
        archive2b12.setContentAreaFilled(false);
        archive2b12.setBorderPainted(true);
        archive2b12.addActionListener(this);
        
        archive2b13 = new JButton("");
        archive2b13.setPreferredSize(new Dimension(100,120));
        archive2b13.setOpaque(false);
        archive2b13.setContentAreaFilled(false);
        archive2b13.setBorderPainted(true);
        archive2b13.addActionListener(this);
        
        archive2b14 = new JButton("");
        archive2b14.setPreferredSize(new Dimension(100,120));
        archive2b14.setOpaque(false);
        archive2b14.setContentAreaFilled(false);
        archive2b14.setBorderPainted(true);
        archive2b14.addActionListener(this);
        
        archive2b15 = new JButton("");
        archive2b15.setPreferredSize(new Dimension(100,120));
        archive2b15.setOpaque(false);
        archive2b15.setContentAreaFilled(false);
        archive2b15.setBorderPainted(true);
        archive2b15.addActionListener(this);
        
        archive2b16 = new JButton("");
        archive2b16.setPreferredSize(new Dimension(100,120));
        archive2b16.setOpaque(false);
        archive2b16.setContentAreaFilled(false);
        archive2b16.setBorderPainted(true);
        archive2b16.addActionListener(this);
        
        archive2b17 = new JButton("");
        archive2b17.setPreferredSize(new Dimension(100,120));
        archive2b17.setOpaque(false);
        archive2b17.setContentAreaFilled(false);
        archive2b17.setBorderPainted(true);
        archive2b17.addActionListener(this);
        
        archivefield2.add(archive2b2);
        archivefield2.add(archive2b3);
        archivefield2.add(archive2b4);
        archivefield2.add(archive2b5);
        archivefield2.add(archive2b6);
        archivefield2.add(archive2b7);
        archivefield2.add(archive2b8);
        archivefield2.add(archive2b9);
        archivefield2.add(archive2b10);
        archivefield2.add(archive2b11);
        archivefield2.add(archive2b12);
        archivefield2.add(archive2b13);
        archivefield2.add(archive2b14);
        archivefield2.add(archive2b15);
        archivefield2.add(archive2b16);
        archivefield2.add(archive2b17);*/
        
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(!controller.pulledCard()){
			gui.deckStackInfo("You have to pull a card first.");
		}
		if(source == archive1bn){
			controller.newArch();
			controller.notifyObservers();
			gui.deckStackInfo("Choose your cards to drop to Archive 1.");
		}else if(source == archive1bc){
			controller.setCheckPhase();
			if(controller.checkPhase(1)){
				gui.deckStackInfo("Phase Achieved drop all your cards to end this round.");
				controller.setNextPhase();
				controller.setCheckPhase();
			}else{
				gui.deckStackInfo("Phase not completed.");
				controller.setCheckPhase();
			}
		}else if(source == archive1b1){
			abutton = "a1b1";
			controller.setArchive(1);
		}else if(source == archive1b2){
				abutton = "a1b2";
				controller.setArchive(1);
		}else if(source == archive1b3){
			abutton = "a1b3";
			controller.setArchive(1);
		}else if(source == archive1b4){
			abutton = "a1b4";
			controller.setArchive(1);
		}else if(source == archive1b5){
			abutton = "a1b5";
			controller.setArchive(1);
		}else if(source == archive1b6){
			abutton = "a1b6";
			controller.setArchive(1);
		}else if(source == archive1b7){
			abutton = "a1b7";
			controller.setArchive(1);
		}else if(source == archive1b8){
			abutton = "a1b8";
			controller.setArchive(1);
		}else if(source == archive1b9){
			abutton = "a1b9";
			controller.setArchive(1);
		}else if(source == archive1b10){
			abutton = "a1b10";
			controller.setArchive(1);
		}else if(source == archive1b11){
			abutton = "a1b11";
			controller.setArchive(1);
		}else if(source == archive1b12){
			abutton = "a1b12";
			controller.setArchive(1);
		}else if(source == archive1b13){
			abutton = "a1b13";
			controller.setArchive(1);
		}else if(source == archive1b14){
			abutton = "a1b14";
			controller.setArchive(1);
		}else if(source == archive1b15){
			abutton = "a1b15";
			controller.setArchive(1);
			
			
			
		}else if(source == archive2){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive3){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive4){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive5){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive6){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive7){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive8){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive9){
			controller.newArch();
			controller.notifyObservers();
		}else if(source == archive10){
			controller.newArch();
			controller.notifyObservers();

		}
	}

	public void updateArchive(Card c) {
		controller.getArchive();
		String i = this.abutton;
		switch(i){
			case "a1b1":
				archive1b1.setIcon(c.getIcon());
				break;
			case "a1b2":
				archive1b2.setIcon(c.getIcon());
				break;
			case "a1b3":
				archive1b3.setIcon(c.getIcon());
				break;
			case "a1b4":
				archive1b4.setIcon(c.getIcon());
				break;
			case "a1b5":
				archive1b5.setIcon(c.getIcon());
				break;
			case "a1b6":
				archive1b6.setIcon(c.getIcon());
				break;
			case "a1b7":
				archive1b7.setIcon(c.getIcon());
				break;
			case "a1b8":
				archive1b8.setIcon(c.getIcon());
				break;
			case "a1b9":
				archive1b9.setIcon(c.getIcon());
				break;
			case "a1b10":
				archive1b10.setIcon(c.getIcon());
				break;
			case "a1b11":
				archive1b11.setIcon(c.getIcon());
				break;
			case "a1b12":
				archive1b12.setIcon(c.getIcon());
				break;
			case "a1b13":
				archive1b13.setIcon(c.getIcon());
				break;
			case "a1b14":
				archive1b14.setIcon(c.getIcon());
				break;
			case "a1b15":
				archive1b15.setIcon(c.getIcon());
				break;
			default:
				break;
		}
	}
}