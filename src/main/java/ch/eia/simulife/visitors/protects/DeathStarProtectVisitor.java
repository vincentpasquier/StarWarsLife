package ch.eia.simulife.visitors.protects;

import ch.eia.simulife.creatures.DarthVader;
import ch.eia.simulife.creatures.Sith;
import ch.eia.simulife.creatures.Stormtrooper;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public final class DeathStarProtectVisitor extends GenericVisitor {

	@Override
	public void visit(DarthVader darthVader) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

	@Override
	public void visit(Sith sith) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

	@Override
	public void visit(Stormtrooper stormtrooper) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}
}
