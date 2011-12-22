package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;

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

	/**
	 * Used for generic placement of Creature on the board.
	 * 
	 * @return whether or not the {@code Creature} is taking place
	 * @see NoCreature
	 */
	public boolean isCreatureTakingSpace() {
		return true;
	}

	public abstract CreatureDisplay getCreatureDisplay();

	public abstract void accept(CommandVisitor visitor);
}