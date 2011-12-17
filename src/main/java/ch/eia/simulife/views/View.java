package ch.eia.simulife.views;

import javax.swing.ImageIcon;

import ch.eia.simulife.gamechoice.Game;

public interface View {
	
	ImageIcon getViewIcon();
	
	String getName();

	void startGame(Game game);

	void nextRound();
}