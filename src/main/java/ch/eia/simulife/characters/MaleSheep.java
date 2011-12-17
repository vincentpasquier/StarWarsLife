package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.AllMove;
import ch.eia.simulife.commands.CommandVisitor;

public class MaleSheep extends Sheep {

	public MaleSheep() {
		super(new AllMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.MALE_SHEEP;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}

}