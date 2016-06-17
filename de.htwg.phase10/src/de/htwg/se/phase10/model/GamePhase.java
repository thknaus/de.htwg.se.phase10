package de.htwg.se.phase10.model;

import java.util.Arrays;

import de.htwg.se.phase10.controller.impl.Phase10Controller;

public class GamePhase {
	private String[] phasen = { "Phase 1: 2 triplet",
			"Phase 2: 1 triplet + 1 row of four",
			"Phase 3: 1 quadruplet + 1 row of four", "Phase 4: 1 row of seven",
			"Phase 5: 1 row of eight", "Phase 6: 1 row of nine",
			"Phase 7: 2 quadruplet", "Phase 8: 7 cards of the same color",
			"Phase 9: 1 quintuplet + 1 twin",
			"Phase 10: 1 quintuplet + 1 triplet" };

	public String getPhase(int number) {
		return phasen[number];
	}

	public boolean checkGamePhase(GamePhase p, Archive arch) {
		Archive archive = arch;
		if (p.toString().startsWith("Phase 1")) {
			Card c = archive.get(0);
			if (archive.size() != 3){
				return false;
			}
			for (int i = 0; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (c.getRank() != d.getRank()) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 2")) {
			Card c = archive.get(0);
			if(archive.size() != 3 || archive.size() != 4){
				return false;
			}
			if (archive.size() == 3) {
				for (int i = 0; i < archive.size(); i++) {
					Card d = archive.get(i);
					if (c.getRank() != d.getRank()) {
						return false;
					}
				}
			} else if (archive.size() == 4) {
				for (int i = 0; i < archive.size(); i++) {
					Card d = archive.get(i);
					if (d.getRankValue(d) != c.getRankValue(c) + i + 1) {
						return false;
					}

				}
			}
			return true;
		} else if (p.toString().startsWith("Phase 3")) {
			Card c = archive.get(0);
			if (archive.size() != 4) {
				return false;
			}
			for (int i = 0; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (c.getRank() != d.getRank()
						|| d.getRankValue(d) != c.getRankValue(c) + i + 1) {
					return false;
				}
			}

		} else if (p.toString().startsWith("Phase 4")) {
			Card c = archive.get(0);
			if (archive.size() != 7) {
				return false;
			}
			for (int i = 0; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (d.getRankValue(d) != c.getRankValue(c) + i + 1) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 5")) {
			Card c = archive.get(0);
			if (archive.size() != 8) {
				return false;
			}
			for (int i = 0; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (d.getRankValue(d) != c.getRankValue(c) + i + 1) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 6")) {
			Card c = archive.get(0);
			if (archive.size() != 9) {
				return false;
			}
			for (int i = 0; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (d.getRankValue(d) != c.getRankValue(c) + i + 1) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 7")) {
			Card c = archive.get(0);
			if (archive.size() != 4) {
				return false;
			}
			for (Card d : archive.getArchive()) {
				if (c.getRank() != d.getRank()) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 8")) {
			Card c = archive.get(0);
			if (archive.size() != 7) {
				return false;
			}
			for (Card d : archive.getArchive()) {
				if (d.getColor() != c.getColor()) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 9")) {
			Card c = archive.get(0);
			if (archive.size() != 5 || archive.size() != 2) {
				return false;
			}
			for (Card d : archive.getArchive()) {
				if (c.getRank() != d.getRank()) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 10")) {
			Card c = archive.get(0);
			if (archive.size() != 5 || archive.size() != 3) {
				return false;
			}
			for (Card d : archive.getArchive()) {
				if (c.getRank() != d.getRank()) {
					return false;
				}
			}
		}
		return true;
	}
}
