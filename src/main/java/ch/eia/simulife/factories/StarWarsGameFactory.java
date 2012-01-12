package ch.eia.simulife.factories;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.board.BoardStarWars;
import ch.eia.simulife.controllers.AllianceController;
import ch.eia.simulife.controllers.EmpireController;
import ch.eia.simulife.controllers.GameOverChecker;
import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.games.Game;

public final class StarWarsGameFactory extends GameFactory {

	@Override
	protected void createControllers() {
		SideController cAlliance = new AllianceController(new AllianceFactory());
		SideController cEmpire = new EmpireController(new EmpireFactory());
		GameOverChecker gocAlliance = new GameOverChecker(Constants.GAME_OVER_CHECKER_ALLIANCE);
		GameOverChecker gocEmpire = new GameOverChecker(Constants.GAME_OVER_CHECKER_EMPIRE);
		gocAlliance.addSideController(cAlliance.getModel());
		gocEmpire.addSideController(cEmpire.getModel());

		lGameOverCheckers.add(gocAlliance);
		lGameOverCheckers.add(gocEmpire);

		lSideControllers.add(cAlliance);
		lSideControllers.add(cEmpire);
	}

	@Override
	public Board createBoard(Game game) {
		return new BoardStarWars(game);
	}

}
