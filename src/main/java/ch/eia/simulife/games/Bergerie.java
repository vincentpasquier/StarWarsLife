package ch.eia.simulife.games;

import javax.swing.ImageIcon;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.factories.GameFactory;

public final class Bergerie extends Game {

	public Bergerie(GameFactory fGame) {
		super(fGame);
	}

	@Override
	public ImageIcon getImageIcon() {
		return CreatureDisplay.FEMALE_SHEEP.getImageIcon();
	}

	@Override
	public String getName() {
		return "La Bergerie";
	}

}
