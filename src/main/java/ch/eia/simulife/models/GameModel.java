package ch.eia.simulife.models;

import ch.eia.simulife.board.Board;

public class GameModel {
	private static final GameModel INSTANCE = new GameModel();
	private GameModel mGame;
	private SideModel lModels;
	private Board board;

	private GameModel() {
	}

	public GameModel getInstance() {
		return INSTANCE;
	}

	public void addModel(SideModel aM) {
	}
}