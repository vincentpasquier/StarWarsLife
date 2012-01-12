package ch.eia.simulife.visitors.transforms;

import ch.eia.simulife.creatures.FemaleSheep;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class MaleSheepTransformVisitor extends GenericVisitor {

	@Override
	public void visit(FemaleSheep femaleSheep) {
		setVisitorStatus(VisitorStatus.CREATE);
		setCreature(CreatureFactory.createRandomSheep());
	}
}
