package ch.eia.simulife.commands;

import java.util.Set;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.IVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class Transform implements Command {

	@Override
	public void execute(Creature creature, SideController cSide) {
		Board board = GameModel.INSTANCE.getBoard();
		Set<Creature> sCreatures = board.getCharactersAround(creature, Constants.CREATURE_RADIUS);
		IVisitor vTransform = creature.getTransformVisitor();
		for (Creature neighbour : sCreatures) {
			if (!neighbour.isCreatureUsingSpace()) {
				continue;
			}
			neighbour.accept(vTransform);
			VisitorStatus status = vTransform.getStatus();
			Creature replacement = vTransform.getCreature();
			if (status.equals(VisitorStatus.CREATE)) {
				cSide.getModel().addCreature(replacement);
				board.placeNewCreature(replacement);
			} else if (status.equals(VisitorStatus.REPLACE) && !neighbour.isCreatureProtected()) {
				GameModel.INSTANCE.replace(neighbour, replacement);
				board.replaceMovable(replacement);
				board.removeCreature(neighbour);
			}
			if (!vTransform.isContinuous()) {
				break;
			}
		}
	}

	@Override
	public void unexecute() {
	}

}