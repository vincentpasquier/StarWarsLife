package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.NoMove;
import ch.eia.simulife.commands.CommandVisitor;

public final class NoCreature extends Creature {

	protected NoCreature() {
		super(new NoMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.NO_CREATURE;
	}

	@Override
	public void accept(CommandVisitor visitor) {
	}

}
