package ch.eia.simulife.gamechoice;

import java.util.List;

import ch.eia.simulife.characters.display.CreatureDisplay;
import ch.eia.simulife.controllers.SideController;

public class StarWarsLife extends Game {

	public StarWarsLife() {
		super(CreatureDisplay.DARTH_VADER);
	}

	@Override
	public List<SideController> getSideControllers() {
		return fControllers.createController(this);
	}

	@Override
	public String getGameName() {
		return "StarWarsLife";
	}

}
