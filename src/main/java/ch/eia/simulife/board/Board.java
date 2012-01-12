package ch.eia.simulife.board;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.moves.Displacement;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.IVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public abstract class Board {
	private List<List<Cell>> cells;
	protected final int bHeight;
	protected final int bWidth;

	protected abstract int transformCoordsForBoard(int coord, int length);

	protected Board(Game game) {
		bHeight = game.getbHeigth();
		bWidth = game.getbWidth();
		cells = new ArrayList<List<Cell>>(bHeight);
		for (int i = 0; i < bHeight; i++) {
			cells.add(new ArrayList<Cell>(bWidth));
		}
		fillWithNoCreature();
	}

	public List<List<Cell>> getCells() {
		return cells;
	}

	public Cell getCellAt(Point pos) {
		return getCellAt(pos.x, pos.y);
	}

	public Cell getCellAt(int x, int y) {
		x = transformCoordsForBoard(x, bWidth);
		y = transformCoordsForBoard(y, bHeight);
		return cells.get(x).get(y);
	}

	public void placeMovable(List<Creature> lCreatures) {
		place(lCreatures, true);
	}

	public void placeUnmovables(List<Creature> lCreatures) {
		place(lCreatures, false);
	}

	public boolean isInsideBoardLimits(int i, int j) {
		return (i >= 0) && (j >= 0) && (i < bWidth) && (j < bHeight);
	}

	public Point getVector(Point pFrom, Point pTo, int multiplier) {
		int x = pTo.x - pFrom.x;
		int y = pTo.y - pFrom.y;
		return new Point(multiplier * x, multiplier * y);
	}

	public boolean isCreatureMoveAvailable(Creature creature, Displacement disp) {
		Point position = creature.getPosition();
		Point vector = disp.getPoint();
		Point newPosition = new Point(position.x + vector.x, position.y + vector.y);
		int i = transformCoordsForBoard(newPosition.x, bWidth);
		int j = transformCoordsForBoard(newPosition.y, bHeight);
		if (!isInsideBoardLimits(i, j)) {
			return false;
		}
		Cell newCell = getCellAt(i, j);
		boolean occupied = newCell.getCreature().isCreatureUsingSpace();
		IVisitor visitor = newCell.getUnmovable().getProtectVisitor();
		creature.accept(visitor);
		return !occupied && (visitor.getStatus().equals(VisitorStatus.ACCEPT) || visitor.isProtected());
	}

	public void swap(Creature creature, Displacement disp) {
		Point position = creature.getPosition();
		Point vector = disp.getPoint();
		int i = transformCoordsForBoard(position.x + vector.x, bWidth);
		int j = transformCoordsForBoard(position.y + vector.y, bHeight);
		Point newPosition = new Point(i, j);
		Cell cellOne = getCellAt(position);
		Cell cellTwo = getCellAt(i, j);
		cellOne.setCreature(cellTwo.getCreature());
		cellTwo.setCreature(creature);
		creature.setPosition(newPosition);
		IVisitor vProtect = cellTwo.getUnmovable().getProtectVisitor();
		creature.accept(vProtect);
		creature.setCreatureProtected(vProtect.isProtected());
	}

	public Set<Creature> getCharactersAround(Creature creature, int radius) {
		Set<Creature> sCreatures = new HashSet<Creature>();
		if (!creature.isCreatureUsingSpace()) {
			return sCreatures;
		}
		Point around = creature.getPosition();
		for (int i = around.x - radius; i <= around.x + radius; i++) {
			for (int j = around.y - radius; j <= around.y + radius; j++) {
				if (i == around.x && j == around.y) {
					continue;
				}
				int ni = transformCoordsForBoard(i, bWidth);
				int nj = transformCoordsForBoard(j, bHeight);
				if (!isInsideBoardLimits(ni, nj)) {
					continue;
				}
				sCreatures.add(getCellAt(ni, nj).getCreature());
			}
		}
		return sCreatures;
	}

	public void removeCreature(Creature toKill) {
		Point position = toKill.getPosition();
		Cell cell = getCellAt(position);
		cell.setCreature(CreatureFactory.createNoCreature(position));
	}

	public void replaceMovable(Creature replacement) {
		Point pReplacement = replacement.getPosition();
		Cell cell = getCellAt(pReplacement);
		cell.setCreature(replacement);
	}

	public void placeNewCreature(Creature newCreature) {
		place(newCreature, true);
	}

	protected Point getRandomLocation() {
		Random random = GameModel.INSTANCE.getRandom();
		return new Point(random.nextInt(bWidth), random.nextInt(bHeight));
	}

	private void fillWithNoCreature() {
		for (int i = 0; i < bHeight; i++) {
			List<Cell> lCreatureWidth = cells.get(i);
			for (int j = 0; j < bWidth; j++) {
				lCreatureWidth.add(new Cell(i, j));
			}
		}
	}

	private void place(List<Creature> lCreatures, boolean movable) {
		for (Creature creature : lCreatures) {
			place(creature, movable);
		}
	}

	private void place(Creature creature, boolean movable) {
		Point pos;
		boolean placed = false;
		do {
			pos = getRandomLocation();
			placed = creatureFitInCell(creature, pos, movable);
		} while (!placed);
		placeCreature(creature, pos, movable);
	}

	private boolean creatureFitInCell(Creature creature, Point pos, boolean movable) {
		for (int i = pos.x + creature.getWidth(); i > pos.x; i--) {
			for (int j = pos.y + creature.getHeight(); j > pos.y; j--) {
				i = transformCoordsForBoard(i, bWidth);
				j = transformCoordsForBoard(j, bHeight);
				if (!isInsideBoardLimits(i, j)) {
					return false;
				}
				Cell cell = getCellAt(i, j);
				Creature cellCreature = movable ? cell.getCreature() : cell.getUnmovable();
				if (movable) {
					Creature unmovable = getCellAt(i, j).getUnmovable();
					IVisitor visitor = unmovable.getProtectVisitor();
					creature.accept(visitor);
					if (!visitor.getStatus().equals(VisitorStatus.ACCEPT) || visitor.isProtected()) {
						return false;
					}
				}
				if (cellCreature.isCreatureUsingSpace()) {
					return false;
				}
			}
		}
		return true;
	}

	private void placeCreature(Creature creature, Point pos, boolean movable) {
		for (int i = pos.x + creature.getWidth(); i > pos.x; i--) {
			for (int j = pos.y + creature.getHeight(); j > pos.y; j--) {
				int ni = transformCoordsForBoard(i, bWidth);
				int nj = transformCoordsForBoard(j, bHeight);
				Cell cell = getCellAt(ni, nj);
				if (movable) {
					IVisitor vProtect = cell.getUnmovable().getProtectVisitor();
					creature.accept(vProtect);
					creature.setCreatureProtected(vProtect.isProtected());
					cell.setCreature(creature);
				} else {
					cell.setUnmovable(creature);
				}
				creature.setPosition(cell.getPosition());
			}
		}
	}

}