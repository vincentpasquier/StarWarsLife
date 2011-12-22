package ch.eia.simulife.commands;

import java.util.Collections;
import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.moves.Displacement;
import ch.eia.simulife.models.GameModel;

public class Move implements Command {

	@Override
	public void execute(Creature creature) {
		List<Displacement> lDisp = creature.getCreatureMove().getKnownMove();
		Board board = GameModel.getInstance().getBoard();
		Collections.shuffle(lDisp);
		for (Displacement disp : lDisp) {
			if(board.isCreatureMoveAvailable(disp))
				board.swap(creature, disp);
		}
	}

	@Override
	public void unexecute() {
	}

}