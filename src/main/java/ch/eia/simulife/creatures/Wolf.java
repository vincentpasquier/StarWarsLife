package ch.eia.simulife.creatures;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;
import ch.eia.simulife.visitors.IVisitor;

public final class Wolf extends Creature {

	public Wolf(CreatureMove move, CreatureDisplay display) {
		super(move, display);
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}