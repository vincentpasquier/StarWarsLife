package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.DiagonalMove;
import ch.eia.simulife.commands.CommandVisitor;

public class DarthVader extends EmpireCreature {

	protected DarthVader() {
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