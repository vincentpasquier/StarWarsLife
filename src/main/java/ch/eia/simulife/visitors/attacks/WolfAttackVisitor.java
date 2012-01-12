package ch.eia.simulife.visitors.attacks;

import ch.eia.simulife.creatures.FemaleSheep;
import ch.eia.simulife.creatures.MaleSheep;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class WolfAttackVisitor extends GenericVisitor {

	@Override
	public void visit(FemaleSheep femaleSheep) {
		setVisitorStatus(VisitorStatus.KILL);
	}

	@Override
	public void visit(MaleSheep maleSheep) {
		setVisitorStatus(VisitorStatus.KILL);
	}
}
