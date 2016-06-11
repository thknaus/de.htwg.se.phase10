package de.htwg.se.phase10.model;

import de.htwg.se.phase10.controller.Phase10Controller;

public class GamePhase {
	private String[] phasen = {"Phase 1:)",
							"Phase 2:)", 
							"Phase 3:)",
							"Phase 4:)",
							"Phase 5:)",
							"Phase 6:)",
							"Phase 7:)",
							"Phase 8:)",
							"Phase 9:)",
							"Phase 10:)"};
	
	public String getPhase(int number){
		return phasen[number];
	}
}
