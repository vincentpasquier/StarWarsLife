package ch.eia.simulife.games;

import java.util.List;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.GameOverChecker;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.factories.GameFactory;
import ch.eia.simulife.games.executions.Execution;

public abstract class Game implements Listable {

	private Execution execution;
	protected final GameFactory fGame;

	private int bHeigth = Constants.DEFAULT_BOARD_HEIGTH;
	private int bWidth = Constants.DEFAULT_BOARD_WIDTH;

	protected Game(GameFactory fGame) {
		this.fGame = fGame;
	}

	public int getbHeigth() {
		return bHeigth;
	}

	public void setbHeigth(int bHeigth) {
		this.bHeigth = bHeigth;
	}

	public int getbWidth() {
		return bWidth;
	}

	public void setbWidth(int bWidth) {
		this.bWidth = bWidth;
	}

	public Execution getExecution() {
		return execution;
	}

	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	public int getCreatureNumber() {
		int creatureNumber = (getbHeigth() * getbWidth()) / Constants.DIVISION_FACTOR_CREATURE_NUMBER;
		return (creatureNumber % 2 == 0) ? creatureNumber : creatureNumber + 1;

	}

	public List<SideController> getSideControllers() {
		return fGame.getControllers();
	}

	public List<GameOverChecker> getGameOverCheckers() {
		return fGame.getGameOverCheckers();
	}

	public Board createBoard() {
		return fGame.createBoard(this);
	}

}
