package ch.eia.simulife.visitors.attacks;

import ch.eia.simulife.creatures.Stormtrooper;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class RebelPilotAttack extends GenericVisitor {

	@Override
	public void visit(Stormtrooper stormtrooper) {
		setVisitorStatus(VisitorStatus.KILL);
	}

}
