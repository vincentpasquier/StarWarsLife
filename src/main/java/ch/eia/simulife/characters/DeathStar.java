package ch.eia.simulife.characters;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.characters.moves.NoMove;
import ch.eia.simulife.commands.CommandVisitor;

public class DeathStar extends EmpireCreature {

	protected DeathStar() {
		super(new NoMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return CreatureDisplay.DEATH_STAR;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}

}