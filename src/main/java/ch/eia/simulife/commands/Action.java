package ch.eia.simulife.commands;

import java.util.Set;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.IVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class Action implements Command {

	@Override
	public void execute(Creature creature, SideController cSide) {
		Board board = GameModel.INSTANCE.getBoard();
		Set<Creature> sCreatures = board.getCharactersAround(creature, Constants.CREATURE_RADIUS);
		if (creature.isCreatureProtected()) {
			IVisitor vCreate = creature.getActionVisitor();
			creature.accept(vCreate);
			Creature newCreature = vCreate.getCreature();
			if (newCreature.isCreatureUsingSpace()) {
				cSide.getModel().addCreature(newCreature);
				board.placeNewCreature(newCreature);
			}
		} else {
			IVisitor vAction = creature.getActionVisitor();
			vAction.setInteractCreature(creature);
			for (Creature neighbour : sCreatures) {
				if (neighbour.isCreatureProtected()) {
					neighbour.accept(vAction);
					VisitorStatus status = vAction.getStatus();
					if (status.equals(VisitorStatus.DISPLACE) || status.equals(VisitorStatus.REPLACE)) {
						Creature displace = vAction.getCreature();
						if (!displace.isCreatureUsingSpace()) {
							continue;
						}
						GameModel.INSTANCE.replace(neighbour, displace);
						board.replaceMovable(displace);
					} else if (status.equals(VisitorStatus.KILL)) {
						GameModel.INSTANCE.kill(neighbour);
					}

					board.removeCreature(neighbour);
					if (!vAction.isContinuous()) {
						break;
					}
				}
			}
		}
	}

	@Override
	public void unexecute() {
	}

}