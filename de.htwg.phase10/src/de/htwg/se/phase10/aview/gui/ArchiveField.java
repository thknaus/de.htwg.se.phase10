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

	JButton archive1bn, archive1bc, archive1b1, archive1b2, archive1b3, archive1b4, archive1b5, archive1b6 ,archive1b7, archive1b8;
	JButton archive1b9, archive1b10, archive1b11, archive1b12, archive1b13, archive1b14, archive1b15;
	
	JButton archive2bn, archive2bc, archive2b1, archive2b2, archive2b3, archive2b4, archive2b5, archive2b6 ,archive2b7, archive2b8;
	JButton archive2b9, archive2b10, archive2b11, archive2b12, archive2b13, archive2b14, archive2b15;
	
	JButton archive3bn, archive3bc, archive3b1, archive3b2, archive3b3, archive3b4, archive3b5, archive3b6 ,archive3b7, archive3b8;
	JButton archive3b9, archive3b10, archive3b11, archive3b12, archive3b13, archive3b14, archive3b15;
	
	JButton archive4bn, archive4bc, archive4b1, archive4b2, archive4b3, archive4b4, archive4b5, archive4b6 ,archive4b7, archive4b8;
	JButton archive4b9, archive4b10, archive4b11, archive4b12, archive4b13, archive4b14, archive4b15;
	
	JButton archive5bn, archive5bc, archive5b1, archive5b2, archive5b3, archive5b4, archive5b5, archive5b6 ,archive5b7, archive5b8;
	JButton archive5b9, archive5b10, archive5b11, archive5b12, archive5b13, archive5b14, archive5b15;
	
	JButton	archive2, archive3, archive4;
	JButton archive5, archive6, archive7, archive8;
	JButton archive9, archive10;
	
	String abutton;
	
	Phase10gui gui;
	Color starbucksb = new Color(0xEAC784);
	
	public ArchiveField(Phase10gui g, IPhase10Controller con) {

		this.controller = con;
		this.gui = g;
//1		
		JPanel archivefield1 = new JPanel();
		archivefield1.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield1.setPreferredSize(new Dimension(1790,130));
		archivefield1.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield1);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield1);

        archive1bn = new JButton();
        archive1bn.setIcon(new ImageIcon(new ImageIcon("./img/na.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
        archive1bn.setPreferredSize(new Dimension(100,120));
        archive1bn.addActionListener(this);
        archivefield1.add(archive1bn);
        
        archive1bc = new JButton();
        archive1bc.setPreferredSize(new Dimension(100,120));
        archive1bc.setOpaque(false);
        archive1bc.setContentAreaFilled(false);
        archive1bc.setBorderPainted(false);
        archive1bc.addActionListener(this);

        archive1b1 = new JButton("");
        archive1b1.setPreferredSize(new Dimension(100,120));
        archive1b1.setOpaque(false);
        archive1b1.setContentAreaFilled(false);
        archive1b1.setBorderPainted(false);
        archive1b1.addActionListener(this);
        
        archive1b2 = new JButton("");
        archive1b2.setPreferredSize(new Dimension(100,120));
        archive1b2.setOpaque(false);
        archive1b2.setContentAreaFilled(false);
        archive1b2.setBorderPainted(false);
        archive1b2.addActionListener(this);
        
        archive1b3 = new JButton("");
        archive1b3.setPreferredSize(new Dimension(100,120));
        archive1b3.setOpaque(false);
        archive1b3.setContentAreaFilled(false);
        archive1b3.setBorderPainted(false);
        archive1b3.addActionListener(this);
        
        archive1b4 = new JButton("");
        archive1b4.setPreferredSize(new Dimension(100,120));
        archive1b4.setOpaque(false);
        archive1b4.setContentAreaFilled(false);
        archive1b4.setBorderPainted(false);
        archive1b4.addActionListener(this);
        
        archive1b5 = new JButton("");
        archive1b5.setPreferredSize(new Dimension(100,120));
        archive1b5.setOpaque(false);
        archive1b5.setContentAreaFilled(false);
        archive1b5.setBorderPainted(false);
        archive1b5.addActionListener(this);

        archive1b6 = new JButton("");
        archive1b6.setPreferredSize(new Dimension(100,120));
        archive1b6.setOpaque(false);
        archive1b6.setContentAreaFilled(false);
        archive1b6.setBorderPainted(false);
        archive1b6.addActionListener(this);
        
        archive1b7 = new JButton("");
        archive1b7.setPreferredSize(new Dimension(100,120));
        archive1b7.setOpaque(false);
        archive1b7.setContentAreaFilled(false);
        archive1b7.setBorderPainted(false);
        archive1b7.addActionListener(this);
        
        archive1b8 = new JButton("");
        archive1b8.setPreferredSize(new Dimension(100,120));
        archive1b8.setOpaque(false);
        archive1b8.setContentAreaFilled(false);
        archive1b8.setBorderPainted(false);
        archive1b8.addActionListener(this);
        
        archive1b9 = new JButton("");
        archive1b9.setPreferredSize(new Dimension(100,120));
        archive1b9.setOpaque(false);
        archive1b9.setContentAreaFilled(false);
        archive1b9.setBorderPainted(false);
        archive1b9.addActionListener(this);
        
        archive1b10 = new JButton("");
        archive1b10.setPreferredSize(new Dimension(100,120));
        archive1b10.setOpaque(false);
        archive1b10.setContentAreaFilled(false);
        archive1b10.setBorderPainted(false);
        archive1b10.addActionListener(this);
        
        archive1b11 = new JButton("");
        archive1b11.setPreferredSize(new Dimension(100,120));
        archive1b11.setOpaque(false);
        archive1b11.setContentAreaFilled(false);
        archive1b11.setBorderPainted(false);
        archive1b11.addActionListener(this);
        
        archive1b12 = new JButton("");
        archive1b12.setPreferredSize(new Dimension(100,120));
        archive1b12.setOpaque(false);
        archive1b12.setContentAreaFilled(false);
        archive1b12.setBorderPainted(false);
        archive1b12.addActionListener(this);
        
        archive1b13 = new JButton("");
        archive1b13.setPreferredSize(new Dimension(100,120));
        archive1b13.setOpaque(false);
        archive1b13.setContentAreaFilled(false);
        archive1b13.setBorderPainted(false);
        archive1b13.addActionListener(this);
        
        archive1b14 = new JButton("");
        archive1b14.setPreferredSize(new Dimension(100,120));
        archive1b14.setOpaque(false);
        archive1b14.setContentAreaFilled(false);
        archive1b14.setBorderPainted(false);
        archive1b14.addActionListener(this);
        
        archive1b15 = new JButton("");
        archive1b15.setPreferredSize(new Dimension(100,120));
        archive1b15.setOpaque(false);
        archive1b15.setContentAreaFilled(false);
        archive1b15.setBorderPainted(false);
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

 
//2
        JPanel archivefield2 = new JPanel();
		archivefield2.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield2.setPreferredSize(new Dimension(1790,130));
		archivefield2.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield2);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield2);
        
        archive2bn = new JButton();
        archive2bn.setPreferredSize(new Dimension(100,120));
        archive2bn.setOpaque(false);
        archive2bn.setContentAreaFilled(false);
        archive2bn.setBorderPainted(false);
        archive2bn.addActionListener(this);
        archivefield2.add(archive2bn);
        
        archive2bc = new JButton();
        archive2bc.setPreferredSize(new Dimension(100,120));
        archive2bc.setOpaque(false);
        archive2bc.setContentAreaFilled(false);
        archive2bc.setBorderPainted(false);
        archive2bc.addActionListener(this);

        archive2b1 = new JButton("");
        archive2b1.setPreferredSize(new Dimension(100,120));
        archive2b1.setOpaque(false);
        archive2b1.setContentAreaFilled(false);
        archive2b1.setBorderPainted(false);
        archive2b1.addActionListener(this);
        
        archive2b2 = new JButton("");
        archive2b2.setPreferredSize(new Dimension(100,120));
        archive2b2.setOpaque(false);
        archive2b2.setContentAreaFilled(false);
        archive2b2.setBorderPainted(false);
        archive2b2.addActionListener(this);
        
        archive2b3 = new JButton("");
        archive2b3.setPreferredSize(new Dimension(100,120));
        archive2b3.setOpaque(false);
        archive2b3.setContentAreaFilled(false);
        archive2b3.setBorderPainted(false);
        archive2b3.addActionListener(this);
        
        archive2b4 = new JButton("");
        archive2b4.setPreferredSize(new Dimension(100,120));
        archive2b4.setOpaque(false);
        archive2b4.setContentAreaFilled(false);
        archive2b4.setBorderPainted(false);
        archive2b4.addActionListener(this);
        
        archive2b5 = new JButton("");
        archive2b5.setPreferredSize(new Dimension(100,120));
        archive2b5.setOpaque(false);
        archive2b5.setContentAreaFilled(false);
        archive2b5.setBorderPainted(false);
        archive2b5.addActionListener(this);

        archive2b6 = new JButton("");
        archive2b6.setPreferredSize(new Dimension(100,120));
        archive2b6.setOpaque(false);
        archive2b6.setContentAreaFilled(false);
        archive2b6.setBorderPainted(false);
        archive2b6.addActionListener(this);
        
        archive2b7 = new JButton("");
        archive2b7.setPreferredSize(new Dimension(100,120));
        archive2b7.setOpaque(false);
        archive2b7.setContentAreaFilled(false);
        archive2b7.setBorderPainted(false);
        archive2b7.addActionListener(this);
        
        archive2b8 = new JButton("");
        archive2b8.setPreferredSize(new Dimension(100,120));
        archive2b8.setOpaque(false);
        archive2b8.setContentAreaFilled(false);
        archive2b8.setBorderPainted(false);
        archive2b8.addActionListener(this);
        
        archive2b9 = new JButton("");
        archive2b9.setPreferredSize(new Dimension(100,120));
        archive2b9.setOpaque(false);
        archive2b9.setContentAreaFilled(false);
        archive2b9.setBorderPainted(false);
        archive2b9.addActionListener(this);
        
        archive2b10 = new JButton("");
        archive2b10.setPreferredSize(new Dimension(100,120));
        archive2b10.setOpaque(false);
        archive2b10.setContentAreaFilled(false);
        archive2b10.setBorderPainted(false);
        archive2b10.addActionListener(this);
        
        archive2b11 = new JButton("");
        archive2b11.setPreferredSize(new Dimension(100,120));
        archive2b11.setOpaque(false);
        archive2b11.setContentAreaFilled(false);
        archive2b11.setBorderPainted(false);
        archive2b11.addActionListener(this);
        
        archive2b12 = new JButton("");
        archive2b12.setPreferredSize(new Dimension(100,120));
        archive2b12.setOpaque(false);
        archive2b12.setContentAreaFilled(false);
        archive2b12.setBorderPainted(false);
        archive2b12.addActionListener(this);
        
        archive2b13 = new JButton("");
        archive2b13.setPreferredSize(new Dimension(100,120));
        archive2b13.setOpaque(false);
        archive2b13.setContentAreaFilled(false);
        archive2b13.setBorderPainted(false);
        archive2b13.addActionListener(this);
        
        archive2b14 = new JButton("");
        archive2b14.setPreferredSize(new Dimension(100,120));
        archive2b14.setOpaque(false);
        archive2b14.setContentAreaFilled(false);
        archive2b14.setBorderPainted(false);
        archive2b14.addActionListener(this);
        
        archive2b15 = new JButton("");
        archive2b15.setPreferredSize(new Dimension(100,120));
        archive2b15.setOpaque(false);
        archive2b15.setContentAreaFilled(false);
        archive2b15.setBorderPainted(false);
        archive2b15.addActionListener(this);
        
        archivefield2.add(archive2bc);
        archivefield2.add(archive2b1);
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
       
//3
		JPanel archivefield3 = new JPanel();
		archivefield3.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield3.setPreferredSize(new Dimension(1790,130));
		archivefield3.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield3);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield3);
        
        archive3bn = new JButton();
        archive3bn.setPreferredSize(new Dimension(100,120));
        archive3bn.setOpaque(false);
        archive3bn.setContentAreaFilled(false);
        archive3bn.setBorderPainted(false);
        archive3bn.addActionListener(this);
        archivefield3.add(archive3bn);
        
        archive3bc = new JButton();
        archive3bc.setPreferredSize(new Dimension(100,120));
        archive3bc.setOpaque(false);
        archive3bc.setContentAreaFilled(false);
        archive3bc.setBorderPainted(false);
        archive3bc.addActionListener(this);

        archive3b1 = new JButton("");
        archive3b1.setPreferredSize(new Dimension(100,120));
        archive3b1.setOpaque(false);
        archive3b1.setContentAreaFilled(false);
        archive3b1.setBorderPainted(false);
        archive3b1.addActionListener(this);
        
        archive3b2 = new JButton("");
        archive3b2.setPreferredSize(new Dimension(100,120));
        archive3b2.setOpaque(false);
        archive3b2.setContentAreaFilled(false);
        archive3b2.setBorderPainted(false);
        archive3b2.addActionListener(this);
        
        archive3b3 = new JButton("");
        archive3b3.setPreferredSize(new Dimension(100,120));
        archive3b3.setOpaque(false);
        archive3b3.setContentAreaFilled(false);
        archive3b3.setBorderPainted(false);
        archive3b3.addActionListener(this);
        
        archive3b4 = new JButton("");
        archive3b4.setPreferredSize(new Dimension(100,120));
        archive3b4.setOpaque(false);
        archive3b4.setContentAreaFilled(false);
        archive3b4.setBorderPainted(false);
        archive3b4.addActionListener(this);
        
        archive3b5 = new JButton("");
        archive3b5.setPreferredSize(new Dimension(100,120));
        archive3b5.setOpaque(false);
        archive3b5.setContentAreaFilled(false);
        archive3b5.setBorderPainted(false);
        archive3b5.addActionListener(this);

        archive3b6 = new JButton("");
        archive3b6.setPreferredSize(new Dimension(100,120));
        archive3b6.setOpaque(false);
        archive3b6.setContentAreaFilled(false);
        archive3b6.setBorderPainted(false);
        archive3b6.addActionListener(this);
        
        archive3b7 = new JButton("");
        archive3b7.setPreferredSize(new Dimension(100,120));
        archive3b7.setOpaque(false);
        archive3b7.setContentAreaFilled(false);
        archive3b7.setBorderPainted(false);
        archive3b7.addActionListener(this);
        
        archive3b8 = new JButton("");
        archive3b8.setPreferredSize(new Dimension(100,120));
        archive3b8.setOpaque(false);
        archive3b8.setContentAreaFilled(false);
        archive3b8.setBorderPainted(false);
        archive3b8.addActionListener(this);
        
        archive3b9 = new JButton("");
        archive3b9.setPreferredSize(new Dimension(100,120));
        archive3b9.setOpaque(false);
        archive3b9.setContentAreaFilled(false);
        archive3b9.setBorderPainted(false);
        archive3b9.addActionListener(this);
        
        archive3b10 = new JButton("");
        archive3b10.setPreferredSize(new Dimension(100,120));
        archive3b10.setOpaque(false);
        archive3b10.setContentAreaFilled(false);
        archive3b10.setBorderPainted(false);
        archive3b10.addActionListener(this);
        
        archive3b11 = new JButton("");
        archive3b11.setPreferredSize(new Dimension(100,120));
        archive3b11.setOpaque(false);
        archive3b11.setContentAreaFilled(false);
        archive3b11.setBorderPainted(false);
        archive3b11.addActionListener(this);
        
        archive3b12 = new JButton("");
        archive3b12.setPreferredSize(new Dimension(100,120));
        archive3b12.setOpaque(false);
        archive3b12.setContentAreaFilled(false);
        archive3b12.setBorderPainted(false);
        archive3b12.addActionListener(this);
        
        archive3b13 = new JButton("");
        archive3b13.setPreferredSize(new Dimension(100,120));
        archive3b13.setOpaque(false);
        archive3b13.setContentAreaFilled(false);
        archive3b13.setBorderPainted(false);
        archive3b13.addActionListener(this);
        
        archive3b14 = new JButton("");
        archive3b14.setPreferredSize(new Dimension(100,120));
        archive3b14.setOpaque(false);
        archive3b14.setContentAreaFilled(false);
        archive3b14.setBorderPainted(false);
        archive3b14.addActionListener(this);
        
        archive3b15 = new JButton("");
        archive3b15.setPreferredSize(new Dimension(100,120));
        archive3b15.setOpaque(false);
        archive3b15.setContentAreaFilled(false);
        archive3b15.setBorderPainted(false);
        archive3b15.addActionListener(this);
        
        archivefield3.add(archive3bc);
        archivefield3.add(archive3b1);
        archivefield3.add(archive3b2);
        archivefield3.add(archive3b3);
        archivefield3.add(archive3b4);
        archivefield3.add(archive3b5);
        archivefield3.add(archive3b6);
        archivefield3.add(archive3b7);
        archivefield3.add(archive3b8);
        archivefield3.add(archive3b9);
        archivefield3.add(archive3b10);
        archivefield3.add(archive3b11);
        archivefield3.add(archive3b12);
        archivefield3.add(archive3b13);
        archivefield3.add(archive3b14);
        archivefield3.add(archive3b15);       
//4      
        JPanel archivefield4 = new JPanel();
		archivefield4.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield4.setPreferredSize(new Dimension(1790,130));
		archivefield4.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield4);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield4);
        
        archive4bn = new JButton();
        archive4bn.setPreferredSize(new Dimension(100,120));
        archive4bn.setOpaque(false);
        archive4bn.setContentAreaFilled(false);
        archive4bn.setBorderPainted(false);
        archive4bn.addActionListener(this);
        archivefield4.add(archive4bn);
        
        archive4bc = new JButton();
        archive4bc.setPreferredSize(new Dimension(100,120));
        archive4bc.setOpaque(false);
        archive4bc.setContentAreaFilled(false);
        archive4bc.setBorderPainted(false);
        archive4bc.addActionListener(this);

        archive4b1 = new JButton("");
        archive4b1.setPreferredSize(new Dimension(100,120));
        archive4b1.setOpaque(false);
        archive4b1.setContentAreaFilled(false);
        archive4b1.setBorderPainted(false);
        archive4b1.addActionListener(this);
        
        archive4b2 = new JButton("");
        archive4b2.setPreferredSize(new Dimension(100,120));
        archive4b2.setOpaque(false);
        archive4b2.setContentAreaFilled(false);
        archive4b2.setBorderPainted(false);
        archive4b2.addActionListener(this);
        
        archive4b3 = new JButton("");
        archive4b3.setPreferredSize(new Dimension(100,120));
        archive4b3.setOpaque(false);
        archive4b3.setContentAreaFilled(false);
        archive4b3.setBorderPainted(false);
        archive4b3.addActionListener(this);
        
        archive4b4 = new JButton("");
        archive4b4.setPreferredSize(new Dimension(100,120));
        archive4b4.setOpaque(false);
        archive4b4.setContentAreaFilled(false);
        archive4b4.setBorderPainted(false);
        archive4b4.addActionListener(this);
        
        archive4b5 = new JButton("");
        archive4b5.setPreferredSize(new Dimension(100,120));
        archive4b5.setOpaque(false);
        archive4b5.setContentAreaFilled(false);
        archive4b5.setBorderPainted(false);
        archive4b5.addActionListener(this);

        archive4b6 = new JButton("");
        archive4b6.setPreferredSize(new Dimension(100,120));
        archive4b6.setOpaque(false);
        archive4b6.setContentAreaFilled(false);
        archive4b6.setBorderPainted(false);
        archive4b6.addActionListener(this);
        
        archive4b7 = new JButton("");
        archive4b7.setPreferredSize(new Dimension(100,120));
        archive4b7.setOpaque(false);
        archive4b7.setContentAreaFilled(false);
        archive4b7.setBorderPainted(false);
        archive4b7.addActionListener(this);
        
        archive4b8 = new JButton("");
        archive4b8.setPreferredSize(new Dimension(100,120));
        archive4b8.setOpaque(false);
        archive4b8.setContentAreaFilled(false);
        archive4b8.setBorderPainted(false);
        archive4b8.addActionListener(this);
        
        archive4b9 = new JButton("");
        archive4b9.setPreferredSize(new Dimension(100,120));
        archive4b9.setOpaque(false);
        archive4b9.setContentAreaFilled(false);
        archive4b9.setBorderPainted(false);
        archive4b9.addActionListener(this);
        
        archive4b10 = new JButton("");
        archive4b10.setPreferredSize(new Dimension(100,120));
        archive4b10.setOpaque(false);
        archive4b10.setContentAreaFilled(false);
        archive4b10.setBorderPainted(false);
        archive4b10.addActionListener(this);
        
        archive4b11 = new JButton("");
        archive4b11.setPreferredSize(new Dimension(100,120));
        archive4b11.setOpaque(false);
        archive4b11.setContentAreaFilled(false);
        archive4b11.setBorderPainted(false);
        archive4b11.addActionListener(this);
        
        archive4b12 = new JButton("");
        archive4b12.setPreferredSize(new Dimension(100,120));
        archive4b12.setOpaque(false);
        archive4b12.setContentAreaFilled(false);
        archive4b12.setBorderPainted(false);
        archive4b12.addActionListener(this);
        
        archive4b13 = new JButton("");
        archive4b13.setPreferredSize(new Dimension(100,120));
        archive4b13.setOpaque(false);
        archive4b13.setContentAreaFilled(false);
        archive4b13.setBorderPainted(false);
        archive4b13.addActionListener(this);
        
        archive4b14 = new JButton("");
        archive4b14.setPreferredSize(new Dimension(100,120));
        archive4b14.setOpaque(false);
        archive4b14.setContentAreaFilled(false);
        archive4b14.setBorderPainted(false);
        archive4b14.addActionListener(this);
        
        archive4b15 = new JButton("");
        archive4b15.setPreferredSize(new Dimension(100,120));
        archive4b15.setOpaque(false);
        archive4b15.setContentAreaFilled(false);
        archive4b15.setBorderPainted(false);
        archive4b15.addActionListener(this);
        
        archivefield4.add(archive4bc);
        archivefield4.add(archive4b1);
        archivefield4.add(archive4b2);
        archivefield4.add(archive4b3);
        archivefield4.add(archive4b4);
        archivefield4.add(archive4b5);
        archivefield4.add(archive4b6);
        archivefield4.add(archive4b7);
        archivefield4.add(archive4b8);
        archivefield4.add(archive4b9);
        archivefield4.add(archive4b10);
        archivefield4.add(archive4b11);
        archivefield4.add(archive4b12);
        archivefield4.add(archive4b13);
        archivefield4.add(archive4b14);
        archivefield4.add(archive4b15);
//5        
        JPanel archivefield5 = new JPanel();
		archivefield5.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield5.setPreferredSize(new Dimension(1790,130));
		archivefield5.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield5);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield5);
        
        archive5bn = new JButton();
        archive5bn.setPreferredSize(new Dimension(100,120));
        archive5bn.setOpaque(false);
        archive5bn.setContentAreaFilled(false);
        archive5bn.setBorderPainted(false);
        archive5bn.addActionListener(this);
        archivefield5.add(archive5bn);
        
        archive5bc = new JButton();
        archive5bc.setPreferredSize(new Dimension(100,120));
        archive5bc.setOpaque(false);
        archive5bc.setContentAreaFilled(false);
        archive5bc.setBorderPainted(false);
        archive5bc.addActionListener(this);

        archive5b1 = new JButton("");
        archive5b1.setPreferredSize(new Dimension(100,120));
        archive5b1.setOpaque(false);
        archive5b1.setContentAreaFilled(false);
        archive5b1.setBorderPainted(false);
        archive5b1.addActionListener(this);
        
        archive5b2 = new JButton("");
        archive5b2.setPreferredSize(new Dimension(100,120));
        archive5b2.setOpaque(false);
        archive5b2.setContentAreaFilled(false);
        archive5b2.setBorderPainted(false);
        archive5b2.addActionListener(this);
        
        archive5b3 = new JButton("");
        archive5b3.setPreferredSize(new Dimension(100,120));
        archive5b3.setOpaque(false);
        archive5b3.setContentAreaFilled(false);
        archive5b3.setBorderPainted(false);
        archive5b3.addActionListener(this);
        
        archive5b4 = new JButton("");
        archive5b4.setPreferredSize(new Dimension(100,120));
        archive5b4.setOpaque(false);
        archive5b4.setContentAreaFilled(false);
        archive5b4.setBorderPainted(false);
        archive5b4.addActionListener(this);
        
        archive5b5 = new JButton("");
        archive5b5.setPreferredSize(new Dimension(100,120));
        archive5b5.setOpaque(false);
        archive5b5.setContentAreaFilled(false);
        archive5b5.setBorderPainted(false);
        archive5b5.addActionListener(this);

        archive5b6 = new JButton("");
        archive5b6.setPreferredSize(new Dimension(100,120));
        archive5b6.setOpaque(false);
        archive5b6.setContentAreaFilled(false);
        archive5b6.setBorderPainted(false);
        archive5b6.addActionListener(this);
        
        archive5b7 = new JButton("");
        archive5b7.setPreferredSize(new Dimension(100,120));
        archive5b7.setOpaque(false);
        archive5b7.setContentAreaFilled(false);
        archive5b7.setBorderPainted(false);
        archive5b7.addActionListener(this);
       
        archive5b8 = new JButton("");
        archive5b8.setPreferredSize(new Dimension(100,120));
        archive5b8.setOpaque(false);
        archive5b8.setContentAreaFilled(false);
        archive5b8.setBorderPainted(false);
        archive5b8.addActionListener(this);
        
        archive5b9 = new JButton("");
        archive5b9.setPreferredSize(new Dimension(100,120));
        archive5b9.setOpaque(false);
        archive5b9.setContentAreaFilled(false);
        archive5b9.setBorderPainted(false);
        archive5b9.addActionListener(this);
        
        archive5b10 = new JButton("");
        archive5b10.setPreferredSize(new Dimension(100,120));
        archive5b10.setOpaque(false);
        archive5b10.setContentAreaFilled(false);
        archive5b10.setBorderPainted(false);
        archive5b10.addActionListener(this);
        
        archive5b11 = new JButton("");
        archive5b11.setPreferredSize(new Dimension(100,120));
        archive5b11.setOpaque(false);
        archive5b11.setContentAreaFilled(false);
        archive5b11.setBorderPainted(false);
        archive5b11.addActionListener(this);
        
        archive5b12 = new JButton("");
        archive5b12.setPreferredSize(new Dimension(100,120));
        archive5b12.setOpaque(false);
        archive5b12.setContentAreaFilled(false);
        archive5b12.setBorderPainted(false);
        archive5b12.addActionListener(this);
        
        archive5b13 = new JButton("");
        archive5b13.setPreferredSize(new Dimension(100,120));
        archive5b13.setOpaque(false);
        archive5b13.setContentAreaFilled(false);
        archive5b13.setBorderPainted(false);
        archive5b13.addActionListener(this);
        
        archive5b14 = new JButton("");
        archive5b14.setPreferredSize(new Dimension(100,120));
        archive5b14.setOpaque(false);
        archive5b14.setContentAreaFilled(false);
        archive5b14.setBorderPainted(false);
        archive5b14.addActionListener(this);
        
        archive5b15 = new JButton("");
        archive5b15.setPreferredSize(new Dimension(100,120));
        archive5b15.setOpaque(false);
        archive5b15.setContentAreaFilled(false);
        archive5b15.setBorderPainted(false);
        archive5b15.addActionListener(this);
        
        archivefield5.add(archive5bc);
        archivefield5.add(archive5b1);
        archivefield5.add(archive5b2);
        archivefield5.add(archive5b3);
        archivefield5.add(archive5b4);
        archivefield5.add(archive5b5);
        archivefield5.add(archive5b6);
        archivefield5.add(archive5b7);
        archivefield5.add(archive5b8);
        archivefield5.add(archive5b9);
        archivefield5.add(archive5b10);
        archivefield5.add(archive5b11);
        archivefield5.add(archive5b12);
        archivefield5.add(archive5b13);
        archivefield5.add(archive5b14);
        archivefield5.add(archive5b15);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(!controller.pulledCard()){
			gui.deckStackInfo("You have to pull a card first.");
		}
//1
		if(source == archive1bn){
			controller.newArch();
			controller.notifyObservers();
			gui.deckStackInfo("Choose your cards to drop to Archive 1.");
			archive1bc.setIcon(new ImageIcon(new ImageIcon("./img/check.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive2bn.setIcon(new ImageIcon(new ImageIcon("./img/na.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive2bn.setBorderPainted(true);
			archive1bc.setBorderPainted(true);
			archive1b1.setBorderPainted(true);
			archive1b2.setBorderPainted(true);
			archive1b3.setBorderPainted(true);
			archive1b4.setBorderPainted(true);
			archive1b5.setBorderPainted(true);
			archive1b6.setBorderPainted(true);
			archive1b7.setBorderPainted(true);
			archive1b8.setBorderPainted(true);
			archive1b9.setBorderPainted(true);
			archive1b10.setBorderPainted(true);
			archive1b11.setBorderPainted(true);
			archive1b12.setBorderPainted(true);
			archive1b13.setBorderPainted(true);
			archive1b14.setBorderPainted(true);
			archive1b15.setBorderPainted(true);
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
		}	

//2		
		if(source == archive2bn){
			controller.newArch();
			controller.notifyObservers();
			gui.deckStackInfo("Choose your cards to drop to Archive 2.");
			archive2bc.setIcon(new ImageIcon(new ImageIcon("./img/check.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive3bn.setIcon(new ImageIcon(new ImageIcon("./img/na.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive3bn.setBorderPainted(true);
			archive2bc.setBorderPainted(true);
			archive2b1.setBorderPainted(true);
			archive2b2.setBorderPainted(true);
			archive2b3.setBorderPainted(true);
			archive2b4.setBorderPainted(true);
			archive2b5.setBorderPainted(true);
			archive2b6.setBorderPainted(true);
			archive2b7.setBorderPainted(true);
			archive2b8.setBorderPainted(true);
			archive2b9.setBorderPainted(true);
			archive2b10.setBorderPainted(true);
			archive2b11.setBorderPainted(true);
			archive2b12.setBorderPainted(true);
			archive2b13.setBorderPainted(true);
			archive2b14.setBorderPainted(true);
			archive2b15.setBorderPainted(true);
		}else if(source == archive2bc){
			controller.setCheckPhase();
			if(controller.checkPhase(1)){
				gui.deckStackInfo("Phase Achieved drop all your cards to end this round.");
				controller.setNextPhase();
				controller.setCheckPhase();
			}else{
				gui.deckStackInfo("Phase not completed.");
				controller.setCheckPhase();
			}
		}else if(source == archive2b1){
			abutton = "a2b1";
			controller.setArchive(1);
		}else if(source == archive2b2){
				abutton = "a2b2";
				controller.setArchive(1);
		}else if(source == archive2b3){
			abutton = "a2b3";
			controller.setArchive(1);
		}else if(source == archive2b4){
			abutton = "a2b4";
			controller.setArchive(1);
		}else if(source == archive2b5){
			abutton = "a2b5";
			controller.setArchive(1);
		}else if(source == archive2b6){
			abutton = "a2b6";
			controller.setArchive(1);
		}else if(source == archive2b7){
			abutton = "a2b7";
			controller.setArchive(1);
		}else if(source == archive2b8){
			abutton = "a2b8";
			controller.setArchive(1);
		}else if(source == archive2b9){
			abutton = "a2b9";
			controller.setArchive(1);
		}else if(source == archive2b10){
			abutton = "a2b10";
			controller.setArchive(1);
		}else if(source == archive2b11){
			abutton = "a2b11";
			controller.setArchive(1);
		}else if(source == archive2b12){
			abutton = "a2b12";
			controller.setArchive(1);
		}else if(source == archive2b13){
			abutton = "a2b13";
			controller.setArchive(1);
		}else if(source == archive2b14){
			abutton = "a2b14";
			controller.setArchive(1);
		}else if(source == archive2b15){
			abutton = "a2b15";
			controller.setArchive(1);
		}
		
//3		
		if(source == archive3bn){
			controller.newArch();
			controller.notifyObservers();
			gui.deckStackInfo("Choose your cards to drop to Archive 3.");
			archive3bc.setIcon(new ImageIcon(new ImageIcon("./img/check.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive4bn.setIcon(new ImageIcon(new ImageIcon("./img/na.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive4bn.setBorderPainted(true);
			archive3bc.setBorderPainted(true);
			archive3b1.setBorderPainted(true);
			archive3b2.setBorderPainted(true);
			archive3b3.setBorderPainted(true);
			archive3b4.setBorderPainted(true);
			archive3b5.setBorderPainted(true);
			archive3b6.setBorderPainted(true);
			archive3b7.setBorderPainted(true);
			archive3b8.setBorderPainted(true);
			archive3b9.setBorderPainted(true);
			archive3b10.setBorderPainted(true);
			archive3b11.setBorderPainted(true);
			archive3b12.setBorderPainted(true);
			archive3b13.setBorderPainted(true);
			archive3b14.setBorderPainted(true);
			archive3b15.setBorderPainted(true);
		}else if(source == archive3bc){
			controller.setCheckPhase();
			if(controller.checkPhase(1)){
				gui.deckStackInfo("Phase Achieved drop all your cards to end this round.");
				controller.setNextPhase();
				controller.setCheckPhase();
			}else{
				gui.deckStackInfo("Phase not completed.");
				controller.setCheckPhase();
			}
		}else if(source == archive3b1){
			abutton = "a3b1";
			controller.setArchive(1);
		}else if(source == archive3b2){
			abutton = "a3b2";
			controller.setArchive(1);
		}else if(source == archive3b3){
			abutton = "a3b3";
			controller.setArchive(1);
		}else if(source == archive3b4){
			abutton = "a3b4";
			controller.setArchive(1);
		}else if(source == archive3b5){
			abutton = "a3b5";
			controller.setArchive(1);
		}else if(source == archive3b6){
			abutton = "a3b6";
			controller.setArchive(1);
		}else if(source == archive3b7){
			abutton = "a3b7";
			controller.setArchive(1);
		}else if(source == archive3b8){
			abutton = "a3b8";
			controller.setArchive(1);
		}else if(source == archive3b9){
			abutton = "a3b9";
			controller.setArchive(1);
		}else if(source == archive3b10){
			abutton = "a3b10";
			controller.setArchive(1);
		}else if(source == archive3b11){
			abutton = "a3b11";
			controller.setArchive(1);
		}else if(source == archive3b12){
			abutton = "a3b12";
			controller.setArchive(1);
		}else if(source == archive3b13){
			abutton = "a3b13";
			controller.setArchive(1);
		}else if(source == archive3b14){
			abutton = "a3b14";
			controller.setArchive(1);
		}else if(source == archive3b15){
			abutton = "a3b15";
			controller.setArchive(1);
		}

//4		
		if(source == archive4bn){
			controller.newArch();
			controller.notifyObservers();
			gui.deckStackInfo("Choose your cards to drop to Archive 4.");
			archive4bc.setIcon(new ImageIcon(new ImageIcon("./img/check.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive5bn.setIcon(new ImageIcon(new ImageIcon("./img/na.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive5bn.setBorderPainted(true);
			archive4bc.setBorderPainted(true);
			archive4b1.setBorderPainted(true);
			archive4b2.setBorderPainted(true);
			archive4b3.setBorderPainted(true);
			archive4b4.setBorderPainted(true);
			archive4b5.setBorderPainted(true);
			archive4b6.setBorderPainted(true);
			archive4b7.setBorderPainted(true);
			archive4b8.setBorderPainted(true);
			archive4b9.setBorderPainted(true);
			archive4b10.setBorderPainted(true);
			archive4b11.setBorderPainted(true);
			archive4b12.setBorderPainted(true);
			archive4b13.setBorderPainted(true);
			archive4b14.setBorderPainted(true);
			archive4b15.setBorderPainted(true);
		}else if(source == archive4bc){
			controller.setCheckPhase();
			if(controller.checkPhase(1)){
				gui.deckStackInfo("Phase Achieved drop all your cards to end this round.");
				controller.setNextPhase();
				controller.setCheckPhase();
			}else{
				gui.deckStackInfo("Phase not completed.");
				controller.setCheckPhase();
			}
		}else if(source == archive4b1){
			abutton = "a4b1";
			controller.setArchive(1);
		}else if(source == archive4b2){
			abutton = "a4b2";
			controller.setArchive(1);
		}else if(source == archive4b3){
			abutton = "a4b3";
			controller.setArchive(1);
		}else if(source == archive4b4){
			abutton = "a4b4";
			controller.setArchive(1);
		}else if(source == archive4b5){
			abutton = "a4b5";
			controller.setArchive(1);
		}else if(source == archive4b6){
			abutton = "a4b6";
			controller.setArchive(1);
		}else if(source == archive4b7){
			abutton = "a4b7";
			controller.setArchive(1);
		}else if(source == archive4b8){
			abutton = "a4b8";
			controller.setArchive(1);
		}else if(source == archive4b9){
			abutton = "a4b9";
			controller.setArchive(1);
		}else if(source == archive4b10){
			abutton = "a4b10";
			controller.setArchive(1);
		}else if(source == archive4b11){
			abutton = "a4b11";
			controller.setArchive(1);
		}else if(source == archive4b12){
			abutton = "a4b12";
			controller.setArchive(1);
		}else if(source == archive4b13){
			abutton = "a4b13";
			controller.setArchive(1);
		}else if(source == archive4b14){
			abutton = "a4b14";
			controller.setArchive(1);
		}else if(source == archive4b15){
			abutton = "a4b15";
			controller.setArchive(1);
		}
//5
		if(source == archive5bn){
			controller.newArch();
			controller.notifyObservers();
			gui.deckStackInfo("Choose your cards to drop to Archive 5.");
			archive5bc.setIcon(new ImageIcon(new ImageIcon("./img/check.jpg").getImage().getScaledInstance(100,120, java.awt.Image.SCALE_SMOOTH)));
			archive5bc.setBorderPainted(true);
			archive5b1.setBorderPainted(true);
			archive5b2.setBorderPainted(true);
			archive5b3.setBorderPainted(true);
			archive5b4.setBorderPainted(true);
			archive5b5.setBorderPainted(true);
			archive5b6.setBorderPainted(true);
			archive5b7.setBorderPainted(true);
			archive5b8.setBorderPainted(true);
			archive5b9.setBorderPainted(true);
			archive5b10.setBorderPainted(true);
			archive5b11.setBorderPainted(true);
			archive5b12.setBorderPainted(true);
			archive5b13.setBorderPainted(true);
			archive5b14.setBorderPainted(true);
			archive5b15.setBorderPainted(true);
		}else if(source == archive5bc){
			controller.setCheckPhase();
			if(controller.checkPhase(1)){
				gui.deckStackInfo("Phase Achieved drop all your cards to end this round.");
				controller.setNextPhase();
				controller.setCheckPhase();
			}else{
				gui.deckStackInfo("Phase not completed.");
				controller.setCheckPhase();
			}
		}else if(source == archive5b1){
			abutton = "a5b1";
			controller.setArchive(1);
		}else if(source == archive5b2){
			abutton = "a5b2";
			controller.setArchive(1);
		}else if(source == archive5b3){
			abutton = "a5b3";
			controller.setArchive(1);
		}else if(source == archive5b4){
			abutton = "a5b4";
			controller.setArchive(1);
		}else if(source == archive5b5){
			abutton = "a5b5";
			controller.setArchive(1);
		}else if(source == archive5b6){
			abutton = "a5b6";
			controller.setArchive(1);
		}else if(source == archive5b7){
			abutton = "a5b7";
			controller.setArchive(1);
		}else if(source == archive5b8){
			abutton = "a5b8";
			controller.setArchive(1);
		}else if(source == archive5b9){
			abutton = "a5b9";
			controller.setArchive(1);
		}else if(source == archive5b10){
			abutton = "a5b10";
			controller.setArchive(1);
		}else if(source == archive5b11){
			abutton = "a5b11";
			controller.setArchive(1);
		}else if(source == archive5b12){
			abutton = "a5b12";
			controller.setArchive(1);
		}else if(source == archive5b13){
			abutton = "a5b13";
			controller.setArchive(1);
		}else if(source == archive5b14){
			abutton = "a5b14";
			controller.setArchive(1);
		}else if(source == archive5b15){
			abutton = "a5b15";
			controller.setArchive(1);
		}
	}

	public void updateArchive(Card c) {
		controller.getArchive();
		String i = this.abutton;
		
		switch(i){
//1		
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
//2				
			case "a2b1":
				archive2b1.setIcon(c.getIcon());
				break;
			case "a2b2":
				archive2b2.setIcon(c.getIcon());
				break;
			case "a2b3":
				archive2b3.setIcon(c.getIcon());
				break;
			case "a2b4":
				archive2b4.setIcon(c.getIcon());
				break;
			case "a2b5":
				archive2b5.setIcon(c.getIcon());
				break;
			case "a2b6":
				archive2b6.setIcon(c.getIcon());
				break;
			case "a2b7":
				archive2b7.setIcon(c.getIcon());
				break;
			case "a2b8":
				archive2b8.setIcon(c.getIcon());
				break;
			case "a2b9":
				archive2b9.setIcon(c.getIcon());
				break;
			case "a2b10":
				archive2b10.setIcon(c.getIcon());
				break;
			case "a2b11":
				archive2b11.setIcon(c.getIcon());
				break;
			case "a2b12":
				archive2b12.setIcon(c.getIcon());
				break;
			case "a2b13":
				archive2b13.setIcon(c.getIcon());
				break;
			case "a2b14":
				archive2b14.setIcon(c.getIcon());
				break;
			case "a2b15":
				archive2b15.setIcon(c.getIcon());
				break;					
//3				
			case "a3b1":
				archive3b1.setIcon(c.getIcon());
				break;
			case "a3b2":
				archive3b2.setIcon(c.getIcon());
				break;
			case "a3b3":
				archive3b3.setIcon(c.getIcon());
				break;
			case "a3b4":
				archive3b4.setIcon(c.getIcon());
				break;
			case "a3b5":
				archive3b5.setIcon(c.getIcon());
				break;
			case "a3b6":
				archive3b6.setIcon(c.getIcon());
				break;
			case "a3b7":
				archive3b7.setIcon(c.getIcon());
				break;
			case "a3b8":
				archive3b8.setIcon(c.getIcon());
				break;
			case "a3b9":
				archive3b9.setIcon(c.getIcon());
				break;
			case "a3b10":
				archive3b10.setIcon(c.getIcon());
				break;
			case "a3b11":
				archive3b11.setIcon(c.getIcon());
				break;
			case "a3b12":
				archive3b12.setIcon(c.getIcon());
				break;
			case "a3b13":
				archive3b13.setIcon(c.getIcon());
				break;
			case "a3b14":
				archive3b14.setIcon(c.getIcon());
				break;
			case "a3b15":
				archive3b15.setIcon(c.getIcon());
				break;
//4				
			case "a4b1":
				archive4b1.setIcon(c.getIcon());
				break;
			case "a4b2":
				archive4b2.setIcon(c.getIcon());
				break;
			case "a4b3":
				archive4b3.setIcon(c.getIcon());
				break;
			case "a4b4":
				archive4b4.setIcon(c.getIcon());
				break;
			case "a4b5":
				archive4b5.setIcon(c.getIcon());
				break;
			case "a4b6":
				archive4b6.setIcon(c.getIcon());
				break;
			case "a4b7":
				archive4b7.setIcon(c.getIcon());
				break;
			case "a4b8":
				archive4b8.setIcon(c.getIcon());
				break;
			case "a4b9":
				archive4b9.setIcon(c.getIcon());
				break;
			case "a4b10":
				archive4b10.setIcon(c.getIcon());
				break;
			case "a4b11":
				archive4b11.setIcon(c.getIcon());
				break;
			case "a4b12":
				archive4b12.setIcon(c.getIcon());
				break;
			case "a4b13":
				archive4b13.setIcon(c.getIcon());
				break;
			case "a4b14":
				archive4b14.setIcon(c.getIcon());
				break;
			case "a4b15":
				archive4b15.setIcon(c.getIcon());
				break;
//5
			case "a5b1":
				archive5b1.setIcon(c.getIcon());
				break;
			case "a5b2":
				archive5b2.setIcon(c.getIcon());
				break;
			case "a5b3":
				archive5b3.setIcon(c.getIcon());
				break;
			case "a5b4":
				archive5b4.setIcon(c.getIcon());
				break;
			case "a5b5":
				archive5b5.setIcon(c.getIcon());
				break;
			case "a5b6":
				archive5b6.setIcon(c.getIcon());
				break;
			case "a5b7":
				archive5b7.setIcon(c.getIcon());
				break;
			case "a5b8":
				archive5b8.setIcon(c.getIcon());
				break;
			case "a5b9":
				archive5b9.setIcon(c.getIcon());
				break;
			case "a5b10":
				archive5b10.setIcon(c.getIcon());
				break;
			case "a5b11":
				archive5b11.setIcon(c.getIcon());
				break;
			case "a5b12":
				archive5b12.setIcon(c.getIcon());
				break;
			case "a5b13":
				archive5b13.setIcon(c.getIcon());
				break;
			case "a5b14":
				archive5b14.setIcon(c.getIcon());
				break;
			case "a5b15":
				archive5b15.setIcon(c.getIcon());
				break;
				
			default:
				break;
		}
	}
}