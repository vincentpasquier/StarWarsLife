package ch.eia.simulife.commands;

import java.util.Collections;
import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.moves.Displacement;
import ch.eia.simulife.models.GameModel;

public class Move implements Command {

	@Override
	public void execute(Creature creature, SideController cSide) {
		if (!creature.isCreatureUsingSpace()) {
			return;
		}
		List<Displacement> lDisp = creature.getCreatureMove().getKnownMove();
		Board board = GameModel.INSTANCE.getBoard();
		Collections.shuffle(lDisp);
		for (Displacement disp : lDisp) {
			if (board.isCreatureMoveAvailable(creature, disp)) {
				board.swap(creature, disp);
				creature.incrementMovesWithoutKilling();
				break;
			}
		}
	}

	@Override
	public void unexecute() {
	}

}