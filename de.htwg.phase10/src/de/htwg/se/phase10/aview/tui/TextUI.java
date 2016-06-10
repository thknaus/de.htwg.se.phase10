package de.htwg.se.phase10.aview.tui;

import java.util.Scanner;

import de.htwg.se.phase10.controller.Phase10Controller;
import de.htwg.se.phase10.model.Archive;
import de.htwg.se.phase10.model.GamePhase;
import de.htwg.se.phase10.model.PlayerHand;
import de.htwg.se.phase10.model.Stack;

public class TextUI {
	
	private static Scanner scanner;
	private Phase10Controller controller;
	
	public TextUI(Phase10Controller cont){
		controller = cont;
		printMenu();
	}
	public boolean inputLine(String input){
		if(input.equals("1")){
			printNewGame();
			controller.newGame();
		}else if(input.equals("2")){
			printQuitGame();
			controller.quitGame();
			return false;
		}
		return true;
	}
	public void printMenu(){
		System.out.println("Welcome to Phase 10");
		System.out.println("");
		System.out.println("1.) Start a new Game");
		System.out.println("2.) Quit");
	}
	public void printNewGame(){
		scanner = new Scanner(System.in);
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
	public void printQuitGame(){
		System.out.println("Game closed...");
	}
	public void printAllPhase10(GamePhase pall){
		System.out.println();
	}
	public void printCurrentPhase(GamePhase ps){
		
	}
	public void printPlayerHand(PlayerHand h){
		
	}
	public void printStackFirstCard(Stack stack){
		
	}
	public void printArchive(Archive archive){
		
	}
}
