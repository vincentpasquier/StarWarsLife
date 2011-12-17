package ch.eia.simulife.gamechoice;

import java.util.List;

import javax.swing.ImageIcon;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.factories.ControllersFactory;

public abstract class Game {

	private final CreatureDisplay cDisplay;
	protected final ControllersFactory fControllers;

	protected Game(CreatureDisplay cDisplay) {
		this.cDisplay = cDisplay;
		this.fControllers = new ControllersFactory();
	}

	public ImageIcon getGameIcon() {
		return cDisplay.getImageIcon();
	}

	public abstract List<SideController> getSideControllers();

	public abstract String getGameName();
}
