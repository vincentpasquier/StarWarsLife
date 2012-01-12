package ch.eia.simulife.creatures;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;

public abstract class EmpireCreature extends Creature {

	protected EmpireCreature(CreatureMove move, CreatureDisplay display) {
		super(move, display);
	}
}