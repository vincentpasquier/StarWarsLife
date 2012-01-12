package ch.eia.simulife.visitors.attacks;

import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class StormtrooperAttackVisitor extends GenericVisitor {

	@Override
	public void visit(RebelPilot rebelPilot) {
		setVisitorStatus(VisitorStatus.KILL);
	}

}
