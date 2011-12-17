package ch.eia.simulife.characters;

import ch.eia.simulife.characters.moves.CreatureMove;

public abstract class EmpireCreature extends Creature {

	protected EmpireCreature(CreatureMove move) {
		super(move);
	}
}