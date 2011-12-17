package ch.eia.simulife.characters.moves;

import java.awt.Point;

public enum Displacement {
	UPLEFT(-1, 1),
	UP(0, 1),
	UPRIGHT(1, 1),
	LEFT(-1, 0),
	NOMOVE(0, 0),
	RIGHT(1, 0),
	DOWNLEFT(-1, -1),
	DOWN(0, -1),
	DOWNRIGHT(1, -1);

	private final Point point;

	private Displacement(int x, int y) {
		point = new Point(x, y);
	}

	public Point getPoint() {
		return (Point) point.clone();
	}
}