package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.AllMove;

public final class Wolf extends Creature {

	public Wolf() {
		super(new AllMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.WOLF;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}