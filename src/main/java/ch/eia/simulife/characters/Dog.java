package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.AllMove;
import ch.eia.simulife.commands.CommandVisitor;

public class Dog extends Creature {

	protected Dog() {
		super(new AllMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.DOG;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}