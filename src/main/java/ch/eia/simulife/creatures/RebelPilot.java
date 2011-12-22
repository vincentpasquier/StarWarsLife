package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CrossMove;

public final class RebelPilot extends AllianceCreature {

	public RebelPilot() {
		super(new CrossMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.REBEL_PILOT;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}