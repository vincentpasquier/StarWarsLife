package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.CrossMove;
import ch.eia.simulife.commands.CommandVisitor;

public class RebelPilot extends AllianceCreature {

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