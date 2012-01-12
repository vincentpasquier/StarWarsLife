package ch.eia.simulife.board;

import java.awt.Point;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.factories.CreatureFactory;

public final class Cell {
	private final Point position;
	private Creature creature;
	private Creature unmovable;

	public Cell(int x, int y) {
		position = new Point(x, y);
		creature = CreatureFactory.createNoCreature(position);
		unmovable = CreatureFactory.createNoCreature(position);
	}

	public Point getPosition() {
		return (Point) position.clone();
	}

	public Creature getUnmovable() {
		return unmovable;
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public void setUnmovable(Creature unmovable) {
		this.unmovable = unmovable;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Cell) {
			return position.equals(o);
		}
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return position.hashCode();
	}
}