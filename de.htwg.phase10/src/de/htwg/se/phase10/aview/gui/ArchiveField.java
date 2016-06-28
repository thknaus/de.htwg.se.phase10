package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import de.htwg.se.phase10.controller.IPhase10Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchiveField extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	
	JButton archive1, archive2, archive3, archive4;
	JButton archive5, archive6, archive7, archive8;
	JButton archive9, archive10, archive11, archive12;
	JButton archiv13, archiv14, archiv15, archiv16;
	JButton archiv17, archiv18, archiv19, archiv20;
	Phase10gui gui;
	Color starbucksb = new Color(0xEAC784);
	
	public ArchiveField(Phase10gui g, IPhase10Controller con) {

		this.controller = con;
		this.gui = g;
		
		JPanel archivefield1 = new JPanel();
		archivefield1.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield1.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield1);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield1);
        
        archive1 = new JButton("");
        archive1.setPreferredSize(new Dimension(935,100));
        archive1.setOpaque(false);
        archive1.setContentAreaFilled(false);
        archive1.setBorderPainted(true);
        archivefield1.add(archive1);
        
        archive2 = new JButton("");
        archive2.setPreferredSize(new Dimension(935,100));
        archive2.setOpaque(false);
        archive2.setContentAreaFilled(false);
        archive2.setBorderPainted(true);
        archivefield1.add(archive2);	


//field2        
		JPanel archivefield2 = new JPanel();
		archivefield2.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield2.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield2);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield2);
        
        archive3 = new JButton("");
        archive3.setPreferredSize(new Dimension(935,100));
        archive3.setOpaque(false);
        archive3.setContentAreaFilled(false);
        archive3.setBorderPainted(true);
        archivefield2.add(archive3);
        
        archive4 = new JButton("");
        archive4.setPreferredSize(new Dimension(935,100));
        archive4.setOpaque(false);
        archive4.setContentAreaFilled(false);
        archive4.setBorderPainted(true);
        archivefield2.add(archive4);	

        
//field3        
		JPanel archivefield3 = new JPanel();
		archivefield3.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield3.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield3);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield3);
        
        archive5 = new JButton("");
        archive5.setPreferredSize(new Dimension(935,100));
        archive5.setOpaque(false);
        archive5.setContentAreaFilled(false);
        archive5.setBorderPainted(true);
        archivefield3.add(archive5);
        
        archive6 = new JButton("");
        archive6.setPreferredSize(new Dimension(935,100));
        archive6.setOpaque(false);
        archive6.setContentAreaFilled(false);
        archive6.setBorderPainted(true);
        archivefield3.add(archive6);	

//field4
		JPanel archivefield4 = new JPanel();
		archivefield4.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield4.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield4);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield4);
        
        archive7 = new JButton("");
        archive7.setPreferredSize(new Dimension(935,100));
        archive7.setOpaque(false);
        archive7.setContentAreaFilled(false);
        archive7.setBorderPainted(true);
        archivefield4.add(archive7);
        
        archive8 = new JButton("");
        archive8.setPreferredSize(new Dimension(935,100));
        archive8.setOpaque(false);
        archive8.setContentAreaFilled(false);
        archive8.setBorderPainted(true);
        archivefield4.add(archive8);	

        
//field5
		JPanel archivefield5 = new JPanel();
		archivefield5.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield5.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield5);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield5);
        
        archive9 = new JButton("");
        archive9.setPreferredSize(new Dimension(935,100));
        archive9.setOpaque(false);
        archive9.setContentAreaFilled(false);
        archive9.setBorderPainted(true);
        archivefield5.add(archive9);
        
        archive10 = new JButton("");
        archive10.setPreferredSize(new Dimension(935,100));
        archive10.setOpaque(false);
        archive10.setContentAreaFilled(false);
        archive10.setBorderPainted(true);
        archivefield5.add(archive10);	

       
//field6
		JPanel archivefield6 = new JPanel();
		archivefield6.setLayout(new FlowLayout(FlowLayout.LEFT));
		archivefield6.setBackground(starbucksb);
		this.setBackground(starbucksb);
		this.add(archivefield6);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivefield6);
        
        archive11 = new JButton("");
        archive11.setPreferredSize(new Dimension(935,100));
        archive11.setOpaque(false);
        archive11.setContentAreaFilled(false);
        archive11.setBorderPainted(true);
        archivefield6.add(archive11);
        
        archive12 = new JButton("");
        archive12.setPreferredSize(new Dimension(935,100));
        archive12.setOpaque(false);
        archive12.setContentAreaFilled(false);
        archive12.setBorderPainted(true);
        archivefield6.add(archive12);	

	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == archive1){
			
		}
	}
	
}