package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.CreatureMove;
import ch.eia.simulife.commands.CommandVisitor;

public abstract class Creature {

	private static final int DEFAULT_WIDTH = 1;
	private static final int DEFAULT_HEIGHT = 1;
	private CreatureMove move;

	protected Creature(CreatureMove move) {
		this.move = move;
	}

	public int getWidth() {
		return DEFAULT_WIDTH;
	}

	public int getHeight() {
		return DEFAULT_HEIGHT;
	}

	public CreatureMove getCreatureMove() {
		return move;
	}

	public abstract CreatureDisplay getCreatureDisplay();

	public abstract void accept(CommandVisitor visitor);
}