package ch.eia.simulife.visitors.actions;

import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class SithActionVisitor extends GenericVisitor {

	@Override
	public void visit(RebelPilot rebelPilot) {
		setVisitorStatus(VisitorStatus.KILL);
	}
}
