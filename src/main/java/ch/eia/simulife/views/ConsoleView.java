package ch.eia.simulife.views;

import javax.swing.ImageIcon;

import ch.eia.simulife.games.Game;
import ch.eia.simulife.utils.ImageHelper;

public class ConsoleView extends View {

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("console.png");
	}

	@Override
	public String getName() {
		return "Console";
	}

	@Override
	public void startGame(Game game) {
	}

	@Override
	public void nextRound() {
	}

}