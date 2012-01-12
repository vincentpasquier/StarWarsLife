package ch.eia.simulife.visitors.attacks;

import ch.eia.simulife.creatures.Jedi;
import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.creatures.Yoda;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class SithAttackVisitor extends GenericVisitor {

	@Override
	public void visit(Jedi jedi) {
		setVisitorStatus(VisitorStatus.KILL);
	}

	@Override
	public void visit(RebelPilot rebelPilot) {
		setVisitorStatus(VisitorStatus.KILL);
	}

	@Override
	public void visit(Yoda yoda) {
		setVisitorStatus(VisitorStatus.KILL);
	}
}
