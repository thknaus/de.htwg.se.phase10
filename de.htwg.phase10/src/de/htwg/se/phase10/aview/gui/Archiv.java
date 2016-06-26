package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Archiv extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton archiv1, archiv2, archiv3, archiv4;
	JButton archiv5, archiv6, archiv7, archiv8;
	JButton archiv9, archiv10, archiv11, archiv12;
	JButton archiv13, archiv14, archiv15, archiv16;
	JButton archiv17, archiv18, archiv19, archiv20;
	Color starbucksb = new Color(0xEAC784);
	
	public Archiv() {
//field1	
		JPanel archivfield1 = new JPanel();
		archivfield1.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivfield1.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivfield1);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield1);
        
        archiv1 = new JButton("");
        archiv1.setPreferredSize(new Dimension(935,100));
        archiv1.setOpaque(false);
        archiv1.setContentAreaFilled(false);
        archiv1.setBorderPainted(true);
        archivfield1.add(archiv1);
        
        archiv2 = new JButton("");
        archiv2.setPreferredSize(new Dimension(935,100));
        archiv2.setOpaque(false);
        archiv2.setContentAreaFilled(false);
        archiv2.setBorderPainted(true);
        archivfield1.add(archiv2);	


//field2        
		JPanel archivfield2 = new JPanel();
		archivfield2.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivfield2.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivfield2);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield2);
        
        archiv3 = new JButton("");
        archiv3.setPreferredSize(new Dimension(935,100));
        archiv3.setOpaque(false);
        archiv3.setContentAreaFilled(false);
        archiv3.setBorderPainted(true);
        archivfield2.add(archiv3);
        
        archiv4 = new JButton("");
        archiv4.setPreferredSize(new Dimension(935,100));
        archiv4.setOpaque(false);
        archiv4.setContentAreaFilled(false);
        archiv4.setBorderPainted(true);
        archivfield2.add(archiv4);	

        
//field3        
		JPanel archivfield3 = new JPanel();
		archivfield3.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivfield3.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivfield3);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield3);
        
        archiv5 = new JButton("");
        archiv5.setPreferredSize(new Dimension(935,100));
        archiv5.setOpaque(false);
        archiv5.setContentAreaFilled(false);
        archiv5.setBorderPainted(true);
        archivfield3.add(archiv5);
        
        archiv6 = new JButton("");
        archiv6.setPreferredSize(new Dimension(935,100));
        archiv6.setOpaque(false);
        archiv6.setContentAreaFilled(false);
        archiv6.setBorderPainted(true);
        archivfield3.add(archiv6);	

//field4
		JPanel archivfield4 = new JPanel();
		archivfield4.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivfield4.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivfield4);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield4);
        
        archiv7 = new JButton("");
        archiv7.setPreferredSize(new Dimension(935,100));
        archiv7.setOpaque(false);
        archiv7.setContentAreaFilled(false);
        archiv7.setBorderPainted(true);
        archivfield4.add(archiv7);
        
        archiv8 = new JButton("");
        archiv8.setPreferredSize(new Dimension(935,100));
        archiv8.setOpaque(false);
        archiv8.setContentAreaFilled(false);
        archiv8.setBorderPainted(true);
        archivfield4.add(archiv8);	

        
//field5
		JPanel archivfield5 = new JPanel();
		archivfield5.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivfield5.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivfield5);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield5);
        
        archiv9 = new JButton("");
        archiv9.setPreferredSize(new Dimension(935,100));
        archiv9.setOpaque(false);
        archiv9.setContentAreaFilled(false);
        archiv9.setBorderPainted(true);
        archivfield5.add(archiv9);
        
        archiv10 = new JButton("");
        archiv10.setPreferredSize(new Dimension(935,100));
        archiv10.setOpaque(false);
        archiv10.setContentAreaFilled(false);
        archiv10.setBorderPainted(true);
        archivfield5.add(archiv10);	

       
//field6
		JPanel archivfield6 = new JPanel();
		archivfield6.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivfield6.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivfield6);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield6);
        
        archiv11 = new JButton("");
        archiv11.setPreferredSize(new Dimension(935,100));
        archiv11.setOpaque(false);
        archiv11.setContentAreaFilled(false);
        archiv11.setBorderPainted(true);
        archivfield6.add(archiv11);
        
        archiv12 = new JButton("");
        archiv12.setPreferredSize(new Dimension(935,100));
        archiv12.setOpaque(false);
        archiv12.setContentAreaFilled(false);
        archiv12.setBorderPainted(true);
        archivfield6.add(archiv12);	

	}
	
	public void actionPerformed(ActionEvent e) {

	}
	
}