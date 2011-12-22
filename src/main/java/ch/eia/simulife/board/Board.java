package ch.eia.simulife.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.moves.Displacement;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.views.ConsoleView;

public class Board {
	private List<List<Cell>> cells;
	private Game game;
	private int bHeight;
	private int bWidth;

	public Board(Game game) {
		this.game = game;
		bHeight = game.getbHeigth();
		bWidth = game.getbWidth();
		cells = new ArrayList<List<Cell>>(bHeight);
		for (int i = 0; i < bHeight; i++) {
			cells.add(new ArrayList<Cell>(bWidth));
		}
		fillWithNoCreature();
		printBoard();
	}

	private void fillWithNoCreature() {
		for (int i = 0; i < bHeight; i++) {
			List<Cell> width = cells.get(i);
			for (int j = 0; j < bWidth; j++) {
				width.add(new Cell(i, j));
			}
		}
	}

	public void printBoard() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bHeight; i++) {
			sb.append("|");
			for(int nbElem = (bWidth*4) -1; nbElem > 0; nbElem--)
				sb.append("-");
			sb.append("|").append("\n").append("|");
			List<Cell> width = cells.get(i);
			for (int j = 0; j < bWidth; j++) {
				sb.append(" ").append(width.get(j).getCreature().getCreatureDisplay().getName()).append((j < bWidth - 1) ? " |" : "");
			}
			sb.append(" |").append("\n");
		}
		sb.append("|");
		for(int nbElem = (bWidth*4) -1; nbElem > 0; nbElem--)
			sb.append("-");
		sb.append("|").append("\n");
		System.out.println(sb.toString());
	}

	public Set<Creature> getCharactersAround(Cell cell) {
		return null;
	}

	public List<Cell> getCells() {
		return null;
	}

	public void placeImmovable(List<Creature> lCreatures) {
	}

	public void placeMovable(List<Creature> lCreatures) {
	}

	public boolean isCreatureMoveAvailable(Displacement disp) {
		return false;
	}

	public void swap(Creature creature, Displacement disp) {
	}
}