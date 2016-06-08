package de.htwg.se.phase10;

import java.util.Scanner;

import javax.swing.plaf.TextUI;

import de.htwg.se.phase10.controller.Phase10Controller;
import de.htwg.se.phase10.model.Deck;
import de.htwg.se.phase10.aview.tui.*;

public class Phase10 {

	private static Scanner scanner;
	protected Phase10Controller controller;
	private static Phase10 instance = null;
	
	private static void printWelcome(){
		System.out.println("Welcome to Phase 10");
		System.out.println("");
		System.out.println("1.) Start a new Game");
		System.out.println("2.) Quit");
	}
	private static void printNewGame(){
		System.out.println("A new game will be started...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("How many Players would like to play?(2 - 6): ");
		
		while(scanner.hasNextInt()){
			int numberplayer = scanner.nextInt();
			if(numberplayer <= 1 || numberplayer > 6){
				System.out.println("Please choose a number of Player between 2 - 6");
				continue;
			}else{
				for(int i = 1; i < numberplayer+1; i++){
					System.out.println("Name Player " + i + " :");
					String name = scanner.next();
					//controller.newPlayer(name)
				}
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		boolean quit = false;
		//TextUI tui = new TextUI(new Phase10Controller());
		
		//Phase10 game = Phase10.getInstance();
		
		printWelcome();
		
		while(quit == false){
			int input = scanner.nextInt();

			if(input == 1)
			{
				printNewGame();
				break;
			}else if(input == 2){
				quit = true;
			}
		}
		
	}
}
