package ch.eia.simulife.gamechoice;

import java.util.List;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.controllers.SideController;

public final class Bergerie extends Game {

	public Bergerie() {
		super(CreatureDisplay.MALE_SHEEP);
	}

	@Override
	public List<SideController> getSideControllers() {
		return fControllers.createController(this);
	}

	@Override
	public String getGameName() {
		return "La Bergerie";
	}

}
