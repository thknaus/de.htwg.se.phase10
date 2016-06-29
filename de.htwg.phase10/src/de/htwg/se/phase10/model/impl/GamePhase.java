package de.htwg.se.phase10.model.impl;

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
	private boolean checkPhase1(Archive arch){
		Archive archive = arch;
		Card c = archive.get(0);
		if (archive.size() != 6){
			return false;
		}
		for (int i = 0; i < archive.size(); i++) {
			Card d = archive.get(i);
			if(i>3){
				c = archive.get(3);
				if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
					return false;
				}
			}
			if(i<3){
				c = archive.get(0);
				if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
					return false;
				}
			}
		}
		return true;
	}
	private boolean checkPhase2(Archive arch){
		Archive archive = arch;
		Card c = archive.get(0);
		
		if(archive.size() != 7){
			return false;
		}
		int z = archive.get(3).getRankValue();
		for(int i = 0; i<archive.size(); i++){
			Card d = archive.get(i);
			if(i < 3){
				c = archive.get(0);
				if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
					return false;
				}
			}
			if(i > 3){
				z++;
				if (d.getRankValue() != z && d.getRank() != Card.Rank.JOKER) {
					return false;
				}
			}
		}
		return true;
	}
	private boolean checkPhase3(Archive arch){
		Archive archive = arch;
		Card c = archive.get(0);
		
		if(archive.size() != 8){
			return false;
		}
		int z = archive.get(4).getRankValue();
		for(int i = 0; i<archive.size(); i++){
			Card d = archive.get(i);
			if(i < 4){
				c = archive.get(0);
				if (!(c.getRank().name().equals(d.getRank().name()) || d.getRank().name().equals(Card.Rank.JOKER.name()))) {
					return false;
				}
			}
			if(i > 4){
				z++;
				if (d.getRankValue() != z && d.getRank() != Card.Rank.JOKER) {
					return false;
				}
			}
		}
		return true;
	}
	private boolean checkPhase4(Archive arch){
		Archive archive = arch;
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
		return true;
	}
	private boolean checkPhase5(Archive arch){
		Archive archive = arch;
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
		return true;
	}
	private boolean checkPhase6(Archive arch){
		Archive archive = arch;
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
		return true;
	}
	private boolean checkPhase7(Archive arch){
		Archive archive = arch;
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
		return true;
	}
	private boolean checkPhase8(Archive arch){
		Archive archive = arch;
		Card c = archive.get(0);
		if (archive.size() != 7) {
			return false;
		}
		for (Card d : archive.getArchive()) {
			if (d.getColor() != c.getColor() && d.getRank() != Card.Rank.JOKER) {
				return false;
			}
		}
		return true;
	}
	private boolean checkPhase9(Archive arch){
		Archive archive = arch;
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
		return true;
	}
	private boolean checkPhase10(Archive arch){
		Archive archive = arch;
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
		return true;
	}
	public boolean checkGamePhase(String p, Archive arch) {
		if (p.toString().startsWith("Phase 1: 2 triplet")) {
			return checkPhase1(arch);
		} else if (p.toString().startsWith("Phase 2: 1 triplet + 1 row of four")) {
			return checkPhase2(arch);
		} else if (p.toString().startsWith("Phase 3: 1 quadruplet + 1 row of four")) {
			return checkPhase3(arch);
		} else if (p.toString().startsWith("Phase 4: 1 row of seven")) {
			return checkPhase4(arch);
		} else if (p.toString().startsWith("Phase 5: 1 row of eight")) {
			return checkPhase5(arch);
		} else if (p.toString().startsWith("Phase 6: 1 row of nine")) {
			return checkPhase6(arch);
		} else if (p.toString().startsWith("Phase 7: 2 quadruplet")) {
			return checkPhase7(arch);
		} else if (p.toString().startsWith("Phase 8: 7 cards of the same color")) {
			return checkPhase8(arch);
		} else if (p.toString().startsWith("Phase 9: 1 quintuplet + 1 twin")) {
			return checkPhase9(arch);
		} else if (p.toString().startsWith("Phase 10: 1 quintuplet + 1 triplet")) {
			return checkPhase10(arch);
		}else {
			return false;
		}
	}
}
