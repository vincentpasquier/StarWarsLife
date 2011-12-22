package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.AllMove;

public final class Sith extends EmpireCreature {

	public Sith() {
		super(new AllMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.SITH;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}

}