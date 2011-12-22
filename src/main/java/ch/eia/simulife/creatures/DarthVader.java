package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.DiagonalMove;

public final class DarthVader extends EmpireCreature {

	public DarthVader() {
		super(new DiagonalMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.DARTH_VADER;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}