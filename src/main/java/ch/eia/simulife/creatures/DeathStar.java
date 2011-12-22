package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.NoMove;

public final class DeathStar extends EmpireCreature {

	protected DeathStar() {
		super(new NoMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.DEATH_STAR;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}

}