package ch.eia.simulife.factories;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.controllers.AllianceController;
import ch.eia.simulife.controllers.DogController;
import ch.eia.simulife.controllers.EmpireController;
import ch.eia.simulife.controllers.FemaleSheepController;
import ch.eia.simulife.controllers.FenceController;
import ch.eia.simulife.controllers.MaleSheepController;
import ch.eia.simulife.controllers.ShepherdController;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.controllers.WolfController;
import ch.eia.simulife.games.Bergerie;
import ch.eia.simulife.games.StarWarsLife;

public final class ControllersFactory {

	private static final int MAXIMUM_CONTROLLERS = 8;
	private List<SideController> lSideControllers;

	public ControllersFactory() {
		lSideControllers = new ArrayList<SideController>(MAXIMUM_CONTROLLERS);
	}

	public List<SideController> createController(StarWarsLife game) {
		lSideControllers.add(new AllianceController());
		lSideControllers.add(new EmpireController());
		return lSideControllers;
	}

	// TODO : Régler l'ordre comme La Bergerie le veut !
	public List<SideController> createController(Bergerie game) {
		lSideControllers.add(new DogController());
		lSideControllers.add(new FemaleSheepController());
		lSideControllers.add(new FenceController());
		lSideControllers.add(new MaleSheepController());
		lSideControllers.add(new ShepherdController());
		lSideControllers.add(new WolfController());
		return lSideControllers;
	}
}