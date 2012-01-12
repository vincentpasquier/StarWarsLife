package ch.eia.simulife.controllers;

import java.util.Iterator;
import java.util.List;

import ch.eia.simulife.games.Game;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.View;

public enum GameController {
	INSTANCE;

	private View view;
	private List<GameOverChecker> lGameOverChecker;
	private List<SideController> lSideController;
	private Iterator<SideController> iSideController;

	public void setView(View view) {
		this.view = view;
	}

	public View getView() {
		return view;
	}

	public void createGame() {
		Game game = GameModel.INSTANCE.getGame();
		lSideController = game.getSideControllers();
		lGameOverChecker = game.getGameOverCheckers();
		for (SideController ctrl : lSideController) {
			GameModel.INSTANCE.addModel(ctrl.getModel());
		}
		iSideController = lSideController.iterator();
	}

	public void nextRound() {
		if (!isGameOver()) {
			Runnable tNextRound = new Runnable() {

				@Override
				public void run() {
					iSideController = iSideController.hasNext() ? iSideController : lSideController.iterator();
					SideController cSide = iSideController.next();
					cSide.playRound();
					cSide.checkIntegrity();
					GameModel.INSTANCE.getGame().getExecution().nextRound();
				}

			};
			new Thread(tNextRound).start();
		} else {
			view.announceGameOver(lGameOverChecker);
		}
	}

	private boolean isGameOver() {
		boolean gameOver = false;
		for (GameOverChecker goc : lGameOverChecker) {
			gameOver = gameOver || goc.checkGameOver();
		}
		return gameOver;
	}

}