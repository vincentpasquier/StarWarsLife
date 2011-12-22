package ch.eia.simulife.games;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.factories.BoardsFactory;
import ch.eia.simulife.factories.ControllersFactory;
import ch.eia.simulife.games.executions.Execution;

public abstract class Game implements Listable {

	private final CreatureDisplay cDisplay;
	private Execution execution;
	protected final ControllersFactory fControllers;
	protected final BoardsFactory fBoards;

	private static final int DEFAULT_BOARD_HEIGTH = 15;
	private static final int DEFAULT_BOARD_WIDTH = 15;

	private int bHeigth = DEFAULT_BOARD_HEIGTH;
	private int bWidth = DEFAULT_BOARD_WIDTH;

	protected Game(CreatureDisplay cDisplay) {
		this.cDisplay = cDisplay;
		this.fControllers = new ControllersFactory();
		fBoards = new BoardsFactory();
	}

	@Override
	public ActionListener getActionListener(ChoiceView vChoice) {
		return new GameButtonController(this, vChoice);
	}

	@Override
	public ImageIcon getImageIcon() {
		return cDisplay.getImageIcon();
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

	public abstract List<SideController> getSideControllers();

	public abstract Board getBoard();
}
