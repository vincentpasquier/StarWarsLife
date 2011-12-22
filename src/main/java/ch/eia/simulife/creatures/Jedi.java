package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.AllMove;

public final class Jedi extends AllianceCreature {

	public Jedi() {
		super(new AllMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.JEDI;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}

}