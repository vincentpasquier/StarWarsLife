package ch.eia.simulife.visitors.actions;

import java.awt.Point;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.board.Cell;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.Stormtrooper;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.IVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class JediActionVisitor extends GenericVisitor {

	@Override
	public void visit(Stormtrooper stormtrooper) {
		Board board = GameModel.INSTANCE.getBoard();
		Point pFrom = getInteractCreature().getPosition();
		Point pTo = stormtrooper.getPosition();
		Point vector = board.getVector(pFrom, pTo, Constants.CREATURE_PUSH);
		pTo.translate(vector.x, vector.y);
		Cell potentialPlace;
		boolean displace = board.isInsideBoardLimits(pTo.x, pTo.y);
		potentialPlace = displace ? board.getCellAt(pTo) : null;
		displace = displace && !potentialPlace.getCreature().isCreatureUsingSpace();

		Creature newStormTrooper = CreatureFactory.createStormtrooper();
		newStormTrooper.setPosition(pTo);
		
		if (displace) {
			IVisitor vProtect = potentialPlace.getUnmovable().getProtectVisitor();
			newStormTrooper.accept(vProtect);
			displace = displace && vProtect.getStatus().equals(VisitorStatus.ACCEPT);
		}
		
		if(displace) {
			setVisitorStatus(VisitorStatus.DISPLACE);
		} else {
			setVisitorStatus(VisitorStatus.KILL);
		}

		setCreature(newStormTrooper);
	}

}
