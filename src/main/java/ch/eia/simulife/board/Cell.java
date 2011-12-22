package ch.eia.simulife.board;

import java.awt.Point;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.DarthVader;
import ch.eia.simulife.creatures.NoCreature;

public final class Cell {
	private final Point pos;
	private Creature creature;
	private Creature unmovable;
	
	public Cell(int x, int y) {
		pos = new Point(x, y);
		creature = new DarthVader();
		unmovable = new NoCreature();
	}

	public Point getPosition() {
		return (Point) pos.clone();
	}

	public Creature getUnmovable() {
		return unmovable;
	}

	public Creature getCreature() {
		return creature;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Cell) {
			return pos.equals(o);
		}
		return super.equals(o);
	}
	
	@Override
	public int hashCode() {
		return pos.hashCode();
	}
}