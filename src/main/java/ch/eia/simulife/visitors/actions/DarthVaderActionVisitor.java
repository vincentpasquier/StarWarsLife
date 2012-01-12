package ch.eia.simulife.visitors.actions;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.visitors.GenericVisitor;

public class DarthVaderActionVisitor extends GenericVisitor {
	
	@Override
	public Creature getCreature() {
		return CreatureFactory.createStormtrooper();
	}
	
}
