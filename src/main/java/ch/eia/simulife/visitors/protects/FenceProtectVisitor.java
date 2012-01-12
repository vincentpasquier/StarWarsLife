package ch.eia.simulife.visitors.protects;

import ch.eia.simulife.creatures.FemaleSheep;
import ch.eia.simulife.creatures.MaleSheep;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public final class FenceProtectVisitor extends GenericVisitor {

	@Override
	public void visit(FemaleSheep femaleSheep) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

	@Override
	public void visit(MaleSheep maleSheep) {
		setVisitorStatus(VisitorStatus.PROTECT);
	}

}
