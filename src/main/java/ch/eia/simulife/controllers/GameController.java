package ch.eia.simulife.controllers;

import ch.eia.simulife.SimuLife;

public class GameController {
	private static final GameController INSTANCE = new GameController();
	public GameController unnamed_GameController_;
	public SimuLife unnamed_SimuLife_;
	public SideController cSide;

	private GameController() {
		throw new UnsupportedOperationException();
	}

	public GameController getInstance() {
		return INSTANCE;
	}

	public void createGame() {
		throw new UnsupportedOperationException();
	}

	public void nextRound() {
		throw new UnsupportedOperationException();
	}
}