package ch.eia.simulife.visitors.protects;

import ch.eia.simulife.creatures.Jedi;
import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.creatures.Yoda;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public final class HothPlanetProtectVisitor extends GenericVisitor {

	@Override
	public void visit(Jedi jedi) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

	@Override
	public void visit(RebelPilot rebelPilot) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

	@Override
	public void visit(Yoda yoda) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

}
