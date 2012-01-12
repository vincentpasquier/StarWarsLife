package ch.eia.simulife.commands;

import java.util.Set;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.IVisitor;
import ch.eia.simulife.visitors.VisitorStatus;

public class Attack implements Command {

	@Override
	public void execute(Creature creature, SideController cSide) {
		Board board = GameModel.INSTANCE.getBoard();
		Set<Creature> sCreatures = board.getCharactersAround(creature, Constants.CREATURE_RADIUS);
		IVisitor vAttack = creature.getAttackVisitor();
		for (Creature neighbour : sCreatures) {
			if (!neighbour.isCreatureUsingSpace() || neighbour.isCreatureProtected()) {
				continue;
			}
			neighbour.accept(vAttack);
			if (vAttack.getStatus().equals(VisitorStatus.KILL)) {
				creature.resetMovesWithoutKilling();
				board.removeCreature(neighbour);
				GameModel.INSTANCE.kill(neighbour);
				if (!vAttack.isContinuous()) {
					break;
				}
			}
		}
	}

	@Override
	public void unexecute() {
	}

}