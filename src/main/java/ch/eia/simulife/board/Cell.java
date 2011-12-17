package ch.eia.simulife.board;

import java.awt.Point;

import ch.eia.simulife.characters.Creature;

public class Cell {
	private Point pos;
	private Creature creature;
	private Creature unmovable;

	public Point getPosition() {
		return (Point) pos.clone();
	}

	public Creature getUnmovable() {
		return unmovable;
	}

	public Creature getCreature() {
		return creature;
	}
}