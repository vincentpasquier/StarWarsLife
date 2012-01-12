package ch.eia.simulife.visitors.attacks;

import ch.eia.simulife.creatures.Wolf;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class ShepherdAttackVisitor extends GenericVisitor {

	@Override
	public void visit(Wolf wolf) {
		setVisitorStatus(VisitorStatus.KILL);
	}
	
}
