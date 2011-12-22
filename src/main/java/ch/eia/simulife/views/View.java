package ch.eia.simulife.views;

import java.awt.event.ActionListener;

import ch.eia.simulife.games.ChoiceView;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.games.Listable;
import ch.eia.simulife.games.ViewButtonController;

public abstract class View implements Listable {
	
	@Override
	public ActionListener getActionListener(ChoiceView vChoice) {
		return new ViewButtonController(this, vChoice);
	}

	public abstract void startGame(Game game);

	public abstract void nextRound();
}