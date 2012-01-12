package ch.eia.simulife;

import ch.eia.simulife.controllers.GameController;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.choice.ChoiceView;

public class SimuLife {

	public SimuLife() {
		new ChoiceView(this);
	}

	public void startGame() {
		GameController.INSTANCE.createGame();
		GameModel.INSTANCE.createGame();
		GameController.INSTANCE.getView().startGame();
		GameController.INSTANCE.nextRound();
	}

	public static void main(String[] args) {
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "BergerieWars");
		new SimuLife();
	}
}