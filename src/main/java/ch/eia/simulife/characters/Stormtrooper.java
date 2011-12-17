package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.CrossMove;
import ch.eia.simulife.commands.CommandVisitor;

public class Stormtrooper extends EmpireCreature {

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