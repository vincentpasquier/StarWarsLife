package ch.eia.simulife.factories;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.board.BoardBergerie;
import ch.eia.simulife.controllers.DogController;
import ch.eia.simulife.controllers.GameOverChecker;
import ch.eia.simulife.controllers.SheepController;
import ch.eia.simulife.controllers.ShepherdController;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.controllers.WolfController;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.games.Game;

public class BergerieGameFactory extends GameFactory {

	@Override
	public void createControllers() {
		SideController cDog = new DogController(new DogFactory());
		SideController cSheep = new SheepController(new SheepFactory());
		SideController cShepherd = new ShepherdController(new ShepherdFactory());
		SideController cWolf = new WolfController(new WolfFactory());
		GameOverChecker gocDogShepherd = new GameOverChecker(Constants.GAME_OVER_CHECKER_DOG_SHEPHERD);
		GameOverChecker gocSheeps = new GameOverChecker(Constants.GAME_OVER_CHECKER_SHEEPS);
		GameOverChecker gocWolfs = new GameOverChecker(Constants.GAME_OVER_CHECKER_WOLFS);

		gocDogShepherd.addSideController(cDog.getModel());
		gocDogShepherd.addSideController(cShepherd.getModel());
		gocSheeps.addSideController(cSheep.getModel());
		gocWolfs.addSideController(cWolf.getModel());

		lGameOverCheckers.add(gocDogShepherd);
		lGameOverCheckers.add(gocSheeps);
		lGameOverCheckers.add(gocWolfs);

		lSideControllers.add(cDog);
		lSideControllers.add(cSheep);
		lSideControllers.add(cShepherd);
		lSideControllers.add(cWolf);
	}

	@Override
	public Board createBoard(Game game) {
		return new BoardBergerie(game);
	}

}
