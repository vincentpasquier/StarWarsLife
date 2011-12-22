package ch.eia.simulife.factories;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.games.Bergerie;
import ch.eia.simulife.games.StarWarsLife;

public final class BoardsFactory {
	public Board createBoard(Bergerie game) {
		return new Board(game);
	}

	public Board createBoard(StarWarsLife game) {
		return new Board(game);
	}
}
