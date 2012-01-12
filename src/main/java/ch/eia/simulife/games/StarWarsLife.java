package ch.eia.simulife.games;

import javax.swing.ImageIcon;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.factories.GameFactory;

public final class StarWarsLife extends Game {

	public StarWarsLife(GameFactory fGame) {
		super(fGame);
	}

	@Override
	public ImageIcon getImageIcon() {
		return CreatureDisplay.DARTH_VADER.getImageIcon();
	}

	@Override
	public String getName() {
		return "StarWarsLife";
	}
}
