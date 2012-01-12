package ch.eia.simulife.controllers;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.models.SideModel;

public final class GameOverChecker {

	private final String name;
	private List<SideModel> lSideModels;

	public GameOverChecker(String name) {
		this.name = name;
		lSideModels = new ArrayList<SideModel>();
	}

	public void addSideController(SideModel mSide) {
		lSideModels.add(mSide);
	}

	public boolean checkGameOver() {
		boolean gameOver = true;
		for (SideModel mSide : lSideModels) {
			gameOver = gameOver && mSide.getCreatures().isEmpty();
		}
		return gameOver;
	}

	public String getName() {
		return name;
	}

}
