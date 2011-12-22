package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.NoMove;

public final class Fence extends Creature {

	protected Fence() {
		super(new NoMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.FENCE;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}