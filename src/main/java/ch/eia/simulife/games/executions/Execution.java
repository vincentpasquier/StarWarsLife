package ch.eia.simulife.games.executions;

import ch.eia.simulife.controllers.GameController;
import ch.eia.simulife.games.Listable;

public abstract class Execution implements Listable {

	public abstract void nextRound();

	public void callback() {
		GameController.INSTANCE.getView().nextRound();
		GameController.INSTANCE.nextRound();
	}

}
