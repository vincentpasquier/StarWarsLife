package ch.eia.simulife.creatures;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;
import ch.eia.simulife.visitors.IVisitor;

public final class DeathStar extends EmpireCreature {

	public DeathStar(CreatureMove move, CreatureDisplay display) {
		super(move, display);
	}

	@Override
	public int getWidth() {
		return 2;
	}

	@Override
	public int getHeight() {
		return 2;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}