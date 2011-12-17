package ch.eia.simulife.views;

import javax.swing.ImageIcon;

import ch.eia.simulife.gamechoice.Game;

public class ConsoleView implements View {

	@Override
	public ImageIcon getViewIcon() {
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