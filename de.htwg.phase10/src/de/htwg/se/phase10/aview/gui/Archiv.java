package de.htwg.se.phase10.aview.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Archiv extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton archiv, narchiv;
	
	public Archiv() {
 
        
        narchiv = new JButton("New Archiv");
        narchiv.setPreferredSize(new Dimension(240,100));
        this.add(narchiv);
        narchiv.addActionListener(this);
		
		JPanel archivfield1 = new JPanel();
		archivfield1.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(archivfield1);	
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield1);
        archiv = new JButton("Archiv1");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield1.add(archiv);
        archiv = new JButton("Archiv2");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield1.add(archiv);	    
        archiv = new JButton("Archiv3");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield1.add(archiv);      
        archiv = new JButton("Archiv4");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield1.add(archiv);
        
		JPanel archivfield2 = new JPanel();
		archivfield2.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(archivfield2);		
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield2);                
        archiv = new JButton("Archiv5");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield2.add(archiv);
        archiv = new JButton("Archiv6");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield2.add(archiv);	    
        archiv = new JButton("Archiv7");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield2.add(archiv);       
        archiv = new JButton("Archiv8");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield2.add(archiv);
        
		JPanel archivfield3 = new JPanel();
		archivfield3.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(archivfield3);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield3);
        archiv = new JButton("Archi9");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield3.add(archiv);
        archiv = new JButton("Archiv10");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield3.add(archiv);  
        archiv = new JButton("Archiv11");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield3.add(archiv);
        archiv = new JButton("Archiv12");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield3.add(archiv);
        
		JPanel archivfield4 = new JPanel();
		archivfield4.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(archivfield4);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield4);
        archiv = new JButton("Archiv13");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield4.add(archiv);
        archiv = new JButton("Archiv14");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield4.add(archiv);
        archiv = new JButton("Archiv15");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield4.add(archiv);
        archiv = new JButton("Archiv16");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield4.add(archiv);
        
		JPanel archivfield5 = new JPanel();
		archivfield5.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(archivfield5);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(archivfield5);
        archiv = new JButton("Archiv17");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield5.add(archiv);
        archiv = new JButton("Archiv18");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield5.add(archiv);
        archiv = new JButton("Archiv19");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield5.add(archiv);
        archiv = new JButton("Archiv20");
        archiv.setPreferredSize(new Dimension(240,100));
        archivfield5.add(archiv);
        

	}
	
	public void actionPerformed(ActionEvent e) {

	}
	
}