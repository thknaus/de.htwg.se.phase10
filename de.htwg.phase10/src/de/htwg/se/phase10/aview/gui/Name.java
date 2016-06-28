package de.htwg.se.phase10.aview.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import de.htwg.se.phase10.controller.IPhase10Controller;

public class Name extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private IPhase10Controller controller;
	private Phase10gui gui;
	JTextField feld1, feld2, feld3;
	JTextField feld4, feld5, feld6;
	
	JLabel player1, player2, player3;
	JLabel player4, player5, player6;
	
	JButton ok1, ok2, ok3;
	JButton ok4, ok5, ok6;
	JButton finish;
	
	Color starbucksb = new Color(0xEAC784);
	Color starbucks = new Color(0x00592D);
	
	public Name(Phase10gui g, IPhase10Controller con){
		controller = con;
		gui = g;
		this.setTitle("Name of Players");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(400, 260));
		this.setBackground(starbucks);

		player1 = new JLabel("Player 1");
		player2 = new JLabel("Player 2");
		player3 = new JLabel("Player 3");
		player4 = new JLabel("Player 4");
		player5 = new JLabel("Player 5");
		player6 = new JLabel("Player 6");


		feld1 = new JTextField("", 10);
		feld2 = new JTextField("", 10);
		feld3 = new JTextField("", 10);
		feld4 = new JTextField("", 10);
		feld5 = new JTextField("", 10);
		feld6 = new JTextField("", 10);

		ok1 = new JButton("ok");
		ok1.addActionListener(this);
		ok2 = new JButton("ok");
		ok2.addActionListener(this);
		ok3 = new JButton("ok");
		ok3.addActionListener(this);
		ok4 = new JButton("ok");
		ok4.addActionListener(this);
		ok5 = new JButton("ok");
		ok5.addActionListener(this);
		ok6 = new JButton("ok");
		ok6.addActionListener(this);
		
		// Felder und Buttons zu Panels zusammenfassen
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(6,1));
		panel1.add(player1);
		panel1.add(feld1);
		panel1.add(ok1);
		panel1.add(player2);
		panel1.add(feld2);
		panel1.add(ok2);
		panel1.add(player3);
		panel1.add(feld3);
		panel1.add(ok3);
		panel1.add(player4);
		panel1.add(feld4);
		panel1.add(ok4);
		panel1.add(player5);
		panel1.add(feld5);
		panel1.add(ok5);
		panel1.add(player6);
		panel1.add(feld6);
		panel1.add(ok6);
		panel1.setBackground(starbucksb);
		
		panel1.setBorder(BorderFactory.createEtchedBorder());
		
		finish = new JButton("Finish");
		finish.addActionListener(this);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(panel1);
		panel.add(finish);
		panel.setBackground(starbucks);

		
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		this.setContentPane(panel);
		
		this.pack();
		this.setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if(source == finish) {
			this.setVisible(false);
			controller.setNewGame(false);
			gui.HandCardUpdate();
		}else if(source == ok1){
			controller.newPlayer(feld1.getText());
		}else if(source == ok2){
			controller.newPlayer(feld2.getText());
		}else if(source == ok3){
			controller.newPlayer(feld3.getText());
		}else if(source == ok4){
			controller.newPlayer(feld4.getText());
		}else if(source == ok5){
			controller.newPlayer(feld5.getText());
		}else if(source == ok6){
			controller.newPlayer(feld6.getText());
		}

	}
}
