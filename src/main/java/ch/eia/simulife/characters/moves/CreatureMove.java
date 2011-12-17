package ch.eia.simulife.characters.moves;

import java.util.ArrayList;
import java.util.List;

public abstract class CreatureMove {

	private static final int MAXIMUM_NUMBER_DISPLACEMENT = 9;
	private List<Displacement> move;

	protected CreatureMove() {
		move = new ArrayList<Displacement>(MAXIMUM_NUMBER_DISPLACEMENT);
	}

	public List<Displacement> getKnownMove() {
		return move;
	}

	protected CreatureMove addDisplacement(Displacement disp) {
		move.add(disp);
		return this;
	}
}