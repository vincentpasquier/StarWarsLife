package ch.eia.simulife.games.executions;

import javax.swing.ImageIcon;

import ch.eia.simulife.games.Constants;
import ch.eia.simulife.views.utils.ImageHelper;

public final class Automatic extends Execution {

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("auto.png");
	}

	@Override
	public String getName() {
		return "Automatic";
	}

	@Override
	public void nextRound() {
		try {
			Thread.sleep(Constants.PAUSE_TIME);
			callback();
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
