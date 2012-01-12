package ch.eia.simulife.board;

import ch.eia.simulife.games.Game;

public class BoardStarWars extends Board {

	public BoardStarWars(Game game) {
		super(game);
	}

	@Override
	protected int transformCoordsForBoard(int coord, int length) {
		return coord;
	}
}
