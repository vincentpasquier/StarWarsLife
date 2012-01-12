package ch.eia.simulife.factories;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.GameOverChecker;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.games.Game;

public abstract class GameFactory {

	protected List<SideController> lSideControllers;
	protected List<GameOverChecker> lGameOverCheckers;

	public GameFactory() {
		lSideControllers = new ArrayList<SideController>(Constants.MAXIMUM_CONTROLLERS);
		lGameOverCheckers = new ArrayList<GameOverChecker>();
	}

	public List<SideController> getControllers() {
		createControllers();
		return lSideControllers;
	}

	/**
	 * Gets {@code GameOverChecker}.
	 * 
	 * <p>
	 * Needs to be done after {@code #createControllers()}.
	 * 
	 * @return a {@code List} of {@code GameOverChecker}
	 */
	public List<GameOverChecker> getGameOverCheckers() {
		return lGameOverCheckers;
	}

	protected abstract void createControllers();

	public abstract Board createBoard(Game game);
}