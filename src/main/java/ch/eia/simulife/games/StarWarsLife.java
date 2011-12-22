package ch.eia.simulife.games;

import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.display.CreatureDisplay;

public class StarWarsLife extends Game {

	public StarWarsLife() {
		super(CreatureDisplay.DARTH_VADER);
	}

	@Override
	public List<SideController> getSideControllers() {
		return fControllers.createController(this);
	}

	@Override
	public String getName() {
		return "StarWarsLife";
	}

	@Override
	public Board getBoard() {
		return fBoards.createBoard(this);
	}
}
