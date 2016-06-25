package de.htwg.se.phase10.model.impl;

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

	public boolean checkGamePhase(String p, Archive arch) {
		Archive archive = arch;
		if (p.toString().startsWith("Phase 1: 2 triplet")) {
			Card c = archive.get(0);
			if (archive.size() != 3){
				return false;
			}
			for (int i = 0; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 2: 1 triplet + 1 row of four")) {
			Card c = archive.get(0);
			int a = archive.size();
			if(archive.size() != 3 && archive.size() != 4){
				return false;
			}
			if (archive.size() == 3) {
				for (int i = 0; i < archive.size(); i++) {
					Card d = archive.get(i);
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
			} else {
				for (int i = 1; i < archive.size(); i++) {
					Card d = archive.get(i);
					if (d.getRankValue() != c.getRankValue()+ i && d.getRank() != Card.Rank.JOKER) {
						return false;
					}
				}
			}
			return true;
		} else if (p.toString().startsWith("Phase 3: 1 quadruplet + 1 row of four")) {
			Card c = archive.get(0);
			if (archive.size() != 4) {
				return false;
			}
			Card z = archive.get(1);
			if(z.getRankValue() != c.getRankValue()+1){
				for(int i = 0; i < archive.size(); i++){
					Card d = archive.get(i);
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
			}else{
				for (int i = 1; i < archive.size(); i++) {
					Card d = archive.get(i);
					if (d.getRankValue() != c.getRankValue()+ i && d.getRank() != Card.Rank.JOKER) {
						return false;
					}
				}
			}
		} else if (p.toString().startsWith("Phase 4: 1 row of seven")) {
			Card c = archive.get(0);
			if (archive.size() != 7) {
				return false;
			}
			for (int i = 1; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (d.getRankValue() != c.getRankValue() + i && d.getRank() != Card.Rank.JOKER) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 5: 1 row of eight")) {
			Card c = archive.get(0);
			if (archive.size() != 8) {
				return false;
			}
			for (int i = 1; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (d.getRankValue() != c.getRankValue() + i && d.getRank() != Card.Rank.JOKER) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 6: 1 row of nine")) {
			Card c = archive.get(0);
			if (archive.size() != 9) {
				return false;
			}
			for (int i = 1; i < archive.size(); i++) {
				Card d = archive.get(i);
				if (d.getRankValue() != c.getRankValue() + i && d.getRank() != Card.Rank.JOKER) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 7: 2 quadruplet")) {
			Card c = archive.get(0);
			if (archive.size() != 8) {
				return false;
			}
			for (int i = 1; i < archive.size(); i++) {
				Card d = archive.get(i);
				if(i < 4){
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
				if(i > 3){
					c = archive.get(4);
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
			}
		} else if (p.toString().startsWith("Phase 8: 7 cards of the same color")) {
			Card c = archive.get(0);
			if (archive.size() != 7) {
				return false;
			}
			for (Card d : archive.getArchive()) {
				if (d.getColor() != c.getColor() && d.getRank() != Card.Rank.JOKER) {
					return false;
				}
			}
		} else if (p.toString().startsWith("Phase 9: 1 quintuplet + 1 twin")) {
			Card c = archive.get(0);
			if (archive.size() != 7) {
				return false;
			}
			for (int i = 1; i < archive.size(); i++) {
				Card d = archive.get(i);
				if(i < 5){
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
				if(i > 5){
					c = archive.get(5);
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
			}
		} else if (p.toString().startsWith("Phase 10: 1 quintuplet + 1 triplet")) {
			Card c = archive.get(0);
			if (archive.size() != 8) {
				return false;
			}
			for (int i = 1; i < archive.size(); i++) {
				Card d = archive.get(i);
				if(i < 5){
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
				if(i > 5){
					c = archive.get(5);
					if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
						return false;
					}
				}
			}
		}else {
			return false;
		}
		return true;
	}
}
