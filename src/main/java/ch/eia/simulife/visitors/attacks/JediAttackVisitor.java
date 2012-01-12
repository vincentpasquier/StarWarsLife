package ch.eia.simulife.visitors.attacks;

import ch.eia.simulife.creatures.DarthVader;
import ch.eia.simulife.creatures.Sith;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public final class JediAttackVisitor extends GenericVisitor {

	@Override
	public void visit(DarthVader darthVader) {
		setVisitorStatus(VisitorStatus.KILL);
	}

	@Override
	public void visit(Sith sith) {
		setVisitorStatus(VisitorStatus.KILL);
	}
}
