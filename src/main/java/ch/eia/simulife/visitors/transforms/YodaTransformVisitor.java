package ch.eia.simulife.visitors.transforms;

import java.awt.Point;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.creatures.Sith;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class YodaTransformVisitor extends GenericVisitor {
	
	@Override
	public void visit(RebelPilot rebelPilot) {
		setVisitorStatus(VisitorStatus.REPLACE);
		Point pos = rebelPilot.getPosition();
		Creature newJedi = CreatureFactory.createJedi();
		newJedi.setPosition(pos);
		setCreature(newJedi);
	}

	@Override
	public void visit(Sith sith) {
		setVisitorStatus(VisitorStatus.REPLACE);
		Point pos = sith.getPosition();
		Creature newStormtrooper = CreatureFactory.createStormtrooper();
		newStormtrooper.setPosition(pos);
		setCreature(newStormtrooper);
	}

}
