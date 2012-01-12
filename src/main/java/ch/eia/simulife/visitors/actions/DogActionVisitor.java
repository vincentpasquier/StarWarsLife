package ch.eia.simulife.visitors.actions;

import java.awt.Point;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.Wolf;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class DogActionVisitor extends GenericVisitor {

	@Override
	public boolean isContinuous() {
		return true;
	}

	@Override
	public void visit(Wolf wolf) {
		setVisitorStatus(VisitorStatus.DISPLACE);
		Board board = GameModel.INSTANCE.getBoard();
		Point pFrom = getInteractCreature().getPosition();
		Point pTo = wolf.getPosition();
		Point vector = board.getVector(pFrom, pTo, Constants.DOG_PUSH);
		pTo.translate(vector.x, vector.y);
		Creature newWolf = CreatureFactory.createWolf();
		newWolf.setPosition(pTo);
		setCreature(newWolf);
	}
}
