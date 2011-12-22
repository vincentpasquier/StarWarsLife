package ch.eia.simulife.games.executions;

import javax.swing.ImageIcon;

import ch.eia.simulife.utils.ImageHelper;

public class StepByStep extends Execution {

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("stepbystep.png");
	}

	@Override
	public String getName() {
		return "Step-by-step";
	}

}
