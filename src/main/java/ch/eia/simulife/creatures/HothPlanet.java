package ch.eia.simulife.creatures;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.NoMove;

public final class HothPlanet extends AllianceCreature {

	protected HothPlanet() {
		super(new NoMove());
	}

	@Override
	public CreatureDisplay getCreatureDisplay() {
		return null;
	}

	@Override
	public void accept(CommandVisitor visitor) {
		visitor.visit(this);
	}
}