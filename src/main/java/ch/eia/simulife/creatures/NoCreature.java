package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.NoMove;

public final class NoCreature extends Creature {

	public NoCreature() {
		super(new NoMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.NO_CREATURE;
	}

	@Override
	public void accept(CommandVisitor visitor) {
	}

	@Override
	public boolean isCreatureTakingSpace() {
		return true;
	}

}
