package ch.eia.simulife.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.games.Game;

public enum GameModel {
	INSTANCE;

	private List<SideModel> lModels;
	private Board board;
	private Game game;
	private final Random random;

	private GameModel() {
		lModels = new ArrayList<SideModel>();
		random = new Random();
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void addModel(SideModel model) {
		lModels.add(model);
	}

	public void createGame() {
		this.board = game.createBoard();
		for (SideModel model : lModels) {
			model.createCreatures();
		}

		for (SideModel model : lModels) {
			board.placeUnmovables(model.getUnmovables());
		}

		for (SideModel model : lModels) {
			board.placeMovable(model.getCreatures());
		}
	}

	public Game getGame() {
		return game;
	}

	public Board getBoard() {
		return board;
	}

	public Random getRandom() {
		return random;
	}

	public void kill(Creature neighbour) {
		for (SideModel model : lModels) {
			List<Creature> lCreature = model.getCreatures();
			for (int i = lCreature.size() - 1; i >= 0; i--) {
				Creature toKill = lCreature.get(i);
				if (toKill.equals(neighbour)) {
					lCreature.remove(i);
				}
			}
		}
	}

	public void replace(Creature neighbour, Creature replacementCreature) {
		for (SideModel model : lModels) {
			List<Creature> lCreature = model.getCreatures();
			for (int i = 0; i < lCreature.size(); i++) {
				Creature toKill = lCreature.get(i);
				if(toKill.equals(neighbour)) {
					lCreature.remove(i);
					lCreature.add(replacementCreature);
					return;
				}
			}
		}
	}
}