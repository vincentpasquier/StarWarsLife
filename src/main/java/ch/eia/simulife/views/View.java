package ch.eia.simulife.views;

import java.util.List;

import ch.eia.simulife.controllers.GameOverChecker;
import ch.eia.simulife.games.Listable;
import ch.eia.simulife.games.executions.Execution;

public abstract class View implements Listable {

	public abstract void startGame();

	public abstract void nextRound();

	public abstract void askForNextRound(Execution execution);

	protected abstract void displayGameOver(String winner);

	public void announceGameOver(List<GameOverChecker> lGameOverChecker) {
		StringBuilder sb = new StringBuilder();
		for (GameOverChecker goc : lGameOverChecker) {
			if (!goc.checkGameOver()) {
				sb.append("Winner : ").append(goc.getName()).append("\n");
			}
		}
		displayGameOver(sb.toString());
	}
}