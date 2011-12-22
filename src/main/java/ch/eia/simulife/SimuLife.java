package ch.eia.simulife;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.controllers.GameController;
import ch.eia.simulife.games.Bergerie;
import ch.eia.simulife.games.ChoiceView;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.games.StarWarsLife;
import ch.eia.simulife.games.executions.Automatic;
import ch.eia.simulife.games.executions.Execution;
import ch.eia.simulife.games.executions.StepByStep;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.ConsoleView;
import ch.eia.simulife.views.View;
import ch.eia.simulife.views.WindowsView;

public class SimuLife {

	private ChoiceView vChoice;

	public SimuLife() {
		List<Game> lGames = new ArrayList<Game>();
		lGames.add(new Bergerie());
		lGames.add(new StarWarsLife());
		List<View> lViews = new ArrayList<View>();
		lViews.add(new ConsoleView());
		lViews.add(new WindowsView());
		List<Execution> lExecutions = new ArrayList<Execution>();
		lExecutions.add(new Automatic());
		lExecutions.add(new StepByStep());

		vChoice = new ChoiceView(lGames, lViews, lExecutions, this);
		vChoice.setVisible(true);
	}

	public void startGame(Game game, View view, Execution execution) {
		vChoice.setVisible(false);
		GameModel.getInstance().createGame(game);
		GameController.getInstance().createGame(game);
		view.startGame(game);
	}

	public static void main(String[] args) {
		new SimuLife();
	}
}