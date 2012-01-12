package ch.eia.simulife.creatures;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;

public abstract class Sheep extends Creature {

	protected Sheep(CreatureMove move, CreatureDisplay display) {
		super(move, display);
	}
}