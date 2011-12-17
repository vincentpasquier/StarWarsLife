package ch.eia.simulife;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.controllers.GameController;
import ch.eia.simulife.gamechoice.Bergerie;
import ch.eia.simulife.gamechoice.ChoiceView;
import ch.eia.simulife.gamechoice.Game;
import ch.eia.simulife.gamechoice.StarWarsLife;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.ConsoleView;
import ch.eia.simulife.views.View;
import ch.eia.simulife.views.WindowsView;

public class SimuLife {

	private ChoiceView vChoice;
	private GameController controller;
	private View view;
	private GameModel model;
	private Game game;

	public SimuLife() {
		List<Game> lGames = new ArrayList<Game>();
		lGames.add(new Bergerie());
		lGames.add(new StarWarsLife());
		List<View> lViews = new ArrayList<View>();
		lViews.add(new ConsoleView());
		lViews.add(new WindowsView());

		ChoiceView vChoice = new ChoiceView(lGames, lViews, this);
		vChoice.setVisible(true);
	}

	public void startGame(Game game, View view) {
		this.game = game;
		this.view = view;
		vChoice.setVisible(false);
		view.startGame(game);
	}

	public static void main(String[] args) {
		new SimuLife();
	}
}