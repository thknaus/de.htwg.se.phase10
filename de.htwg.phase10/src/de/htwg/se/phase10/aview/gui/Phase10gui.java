package de.htwg.se.phase10.aview.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;



public class Phase10gui extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu menu, submenu; 
	JRadioButtonMenuItem rbMenuItem;
	JMenuItem quit;
	JFrame field;
	
	
	public Phase10gui(){
		
//Hauptfenster bauen.

		setTitle("Phase10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1024, 840));
		
		this.setLayout(new BorderLayout());
		JButton leftside = new JButton("Left Side");
		this.add(leftside, BorderLayout.WEST);
		
		JButton ground = new JButton("GroundPanel");
		this.add(ground, BorderLayout.SOUTH); 
		
		JButton mainfield = new JButton("MainField");
		this.add(mainfield, BorderLayout.CENTER);
		
		

		//JPanel p = new JPanel(new BoarderLayout());

//Build Menu menu.
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		

		menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_M);
		menuBar.add(menu);
		
		
		menu.addSeparator();
        submenu = new JMenu("New Game");
        submenu.setMnemonic(KeyEvent.VK_S);
        menu.add(submenu);
 
		JMenuItem numberofplayer = new JMenuItem("choose number of player");
		submenu.add(numberofplayer);
		
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        
        rbMenuItem = new JRadioButtonMenuItem("2 Players");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_2);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("3 Players");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_3);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("4 Players");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_4);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("5 Players");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_5);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("6 Players");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_6);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        submenu.add(rbMenuItem);
        
        quit = new JMenuItem("Quit");
        quit.setMnemonic(KeyEvent.VK_Q);
        quit.addActionListener(this);
		menu.add(quit);

        
//Hauptfenster ausgeben
		this.pack();
		this.setVisible(true);
	}
	
//ActionEvent
	@Override
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

    }
	
//main	
    public static void main(String[] args) {
		JFrame myApp = new Phase10gui();
    }
}