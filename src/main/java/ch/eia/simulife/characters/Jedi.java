package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.AllMove;
import ch.eia.simulife.commands.CommandVisitor;

public class Jedi extends AllianceCreature {

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