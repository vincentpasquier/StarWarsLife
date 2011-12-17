package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.NoMove;
import ch.eia.simulife.commands.CommandVisitor;

public class Fence extends Creature {

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