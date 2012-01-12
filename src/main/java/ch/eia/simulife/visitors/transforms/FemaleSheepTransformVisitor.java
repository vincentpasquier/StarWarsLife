package ch.eia.simulife.visitors.transforms;

import ch.eia.simulife.creatures.MaleSheep;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class FemaleSheepTransformVisitor extends GenericVisitor {

	@Override
	public void visit(MaleSheep maleSheep) {
		setVisitorStatus(VisitorStatus.CREATE);
		setCreature(CreatureFactory.createRandomSheep());
	}

}
