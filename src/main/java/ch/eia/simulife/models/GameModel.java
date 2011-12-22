package ch.eia.simulife.models;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.games.Game;

public class GameModel {
	private static final GameModel INSTANCE = new GameModel();
	private List<SideModel> lModels;
	private Board board;

	private GameModel() {
		lModels = new ArrayList<SideModel>();
	}

	public static GameModel getInstance() {
		return INSTANCE;
	}

	public void addModel(SideModel model) {
		lModels.add(model);
	}

	public void createGame(Game game) {
		this.board = game.getBoard();
	}

	public Board getBoard() {
		return board;
	}

}