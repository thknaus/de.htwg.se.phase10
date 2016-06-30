package de.htwg.se.phase10.aview;

import java.util.HashMap;
import java.util.Map;

import de.htwg.se.phase10.controller.GameStatus;

public class StatusMessage {
	public static final Map<GameStatus, String> text = new HashMap<>();
	private StatusMessage(){
		
	}
	static{
		text.put(GameStatus.WELCOME, "Welcome to Phase 10.");
		text.put(GameStatus.ADDPLAYER, "New Player has been added.");
		text.put(GameStatus.EXITGAME, "Game has been close");
		text.put(GameStatus.NEWARCHIVE, "New Archive generated");
		text.put(GameStatus.NEWDECK, "New Deck has been generated");
		text.put(GameStatus.NEWSTACK, "New Stack has been generated");
		text.put(GameStatus.ROUNDOVER, "Current Round is over");
		text.put(GameStatus.NEXTROUND, "Next Round will be started");
	}
}
