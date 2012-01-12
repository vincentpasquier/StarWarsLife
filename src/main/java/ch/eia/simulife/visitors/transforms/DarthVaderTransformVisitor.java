package ch.eia.simulife.visitors.transforms;

import java.awt.Point;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.Stormtrooper;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class DarthVaderTransformVisitor extends GenericVisitor {

	@Override
	public void visit(Stormtrooper stormtrooper) {
		setVisitorStatus(VisitorStatus.REPLACE);
		Point pos = stormtrooper.getPosition();
		Creature newStormtrooper = CreatureFactory.createSith();
		newStormtrooper.setPosition(pos);
		setCreature(newStormtrooper);
	}
}
