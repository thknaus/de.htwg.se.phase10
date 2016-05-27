package de.htwg.se.phase10;

import java.util.Scanner;

import javax.swing.plaf.TextUI;

import de.htwg.se.phase10.controller.Phase10Controller;
import de.htwg.se.phase10.model.Deck;

public class Phase10 {

	private static Scanner scanner;
	private TextUI tui;
	protected Phase10Controller controller;
	private static Phase10 instance = null;
	public static void main(String[] args) {

		//Phase10 game = Phase10.getInstance();

		if (args.length == 0) {
			// continue to read user input on the tui until the user decides to
			// quit
			boolean continu = true;
			scanner = new Scanner(System.in);
			while (continu) {
				continu = game.tui.processInputLine(scanner.next());
			}
		} else {
			// read arguments from the args input parameters. Used for integration tests only!!!
			for (String input : args) {
				game.tui.processInputLine(input);
			}

		}
	}
}
