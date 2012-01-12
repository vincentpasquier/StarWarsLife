package ch.eia.simulife.board;

import ch.eia.simulife.games.Game;

public class BoardBergerie extends Board {

	public BoardBergerie(Game game) {
		super(game);
	}

	@Override
	protected int transformCoordsForBoard(int coord, int length) {
		return (coord + length) % length;
	}

}
