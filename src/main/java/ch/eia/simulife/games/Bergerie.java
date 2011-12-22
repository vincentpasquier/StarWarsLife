package ch.eia.simulife.games;

import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.display.CreatureDisplay;

public final class Bergerie extends Game {

	public Bergerie() {
		super(CreatureDisplay.MALE_SHEEP);
	}

	@Override
	public List<SideController> getSideControllers() {
		return fControllers.createController(this);
	}

	@Override
	public String getName() {
		return "La Bergerie";
	}

	@Override
	public Board getBoard() {
		return fBoards.createBoard(this);
	}

}
