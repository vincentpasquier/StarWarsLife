package ch.eia.simulife.board;

import java.util.List;
import java.util.Set;

import ch.eia.simulife.characters.Creature;
import ch.eia.simulife.models.GameModel;

public class Board {
	public GameModel unnamed_GameModel_;
	public List<Cell> cells;

	public Set<Creature> getCharactersAround(Cell aCell) {
		throw new UnsupportedOperationException();
	}

	public List<Cell> getCells() {
		throw new UnsupportedOperationException();
	}

	public void placeImmovable(List<Creature> aL) {
		throw new UnsupportedOperationException();
	}

	public void placeMovable(List<Creature> aL) {
		throw new UnsupportedOperationException();
	}
}