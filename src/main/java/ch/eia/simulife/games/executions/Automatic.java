package ch.eia.simulife.games.executions;

import javax.swing.ImageIcon;

import ch.eia.simulife.utils.ImageHelper;

public class Automatic extends Execution {

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("auto.png");
	}

	@Override
	public String getName() {
		return "Automatic";
	}

}
