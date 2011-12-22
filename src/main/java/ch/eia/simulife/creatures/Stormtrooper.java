package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CrossMove;

public final class Stormtrooper extends EmpireCreature {

	public Stormtrooper() {
		super(new CrossMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.STORMTROOPER;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}