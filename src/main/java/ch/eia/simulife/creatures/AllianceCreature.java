package ch.eia.simulife.creatures;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;

public abstract class AllianceCreature extends Creature {

	protected AllianceCreature(CreatureMove move, CreatureDisplay display) {
		super(move, display);
	}
	
}