package ch.eia.simulife.games.executions;

import javax.swing.ImageIcon;

import ch.eia.simulife.controllers.GameController;
import ch.eia.simulife.views.utils.ImageHelper;

public final class StepByStep extends Execution {

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("stepbystep.png");
	}

	@Override
	public String getName() {
		return "Step-by-step";
	}

	@Override
	public void nextRound() {
		GameController.INSTANCE.getView().askForNextRound(this);
	}
}
