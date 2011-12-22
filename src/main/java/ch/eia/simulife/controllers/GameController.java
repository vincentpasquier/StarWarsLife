package ch.eia.simulife.controllers;

import java.util.List;

import ch.eia.simulife.games.Game;
import ch.eia.simulife.models.GameModel;

public class GameController {
	private static final GameController INSTANCE = new GameController();
	// public SimuLife unnamed_SimuLife_; Voir si besoin ?
	private List<SideController> cSide;
	private Game game;

	private GameController() {
	}

	public static GameController getInstance() {
		return INSTANCE;
	}

	public void createGame(Game game) {
		this.game = game;
		cSide = game.getSideControllers();
		for (SideController ctrl : cSide)
			GameModel.getInstance().addModel(ctrl.getModel());
	}

	public void nextRound() {
	}
}