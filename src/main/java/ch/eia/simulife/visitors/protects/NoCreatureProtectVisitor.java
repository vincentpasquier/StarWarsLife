package ch.eia.simulife.visitors.protects;

import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class NoCreatureProtectVisitor extends GenericVisitor {

	@Override
	public VisitorStatus getStatus() {
		return VisitorStatus.ACCEPT;
	}
	
}
