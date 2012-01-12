package ch.eia.simulife.factories;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.games.Bergerie;
import ch.eia.simulife.games.Listable;
import ch.eia.simulife.games.StarWarsLife;
import ch.eia.simulife.games.executions.Automatic;
import ch.eia.simulife.games.executions.StepByStep;
import ch.eia.simulife.views.ConsoleView;
import ch.eia.simulife.views.WindowsView;

public final class ListableFactory {
	
	public static List<Listable> buildGameList() {
		List<Listable> lGames = new ArrayList<Listable>();
		lGames.add(new Bergerie(new BergerieGameFactory()));
		lGames.add(new StarWarsLife(new StarWarsGameFactory()));
		return lGames;
	}

	public static List<Listable> buildViewList() {
		List<Listable> lViews = new ArrayList<Listable>();
		lViews.add(new ConsoleView());
		lViews.add(new WindowsView());
		return lViews;
	}

	public static List<Listable> buildExecutionList() {
		List<Listable> lExecutions = new ArrayList<Listable>();
		lExecutions.add(new Automatic());
		lExecutions.add(new StepByStep());
		return lExecutions;
	}

	private ListableFactory() {
		throw new AssertionError();
	}

}
