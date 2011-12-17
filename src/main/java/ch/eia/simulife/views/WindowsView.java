package ch.eia.simulife.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import ch.eia.simulife.gamechoice.Game;

public class WindowsView extends JFrame implements View {

	private static final long serialVersionUID = 761538419796761757L;

	public WindowsView() {
		super();
	}

	@Override
	public String getName() {
		return "Interface";
	}

	@Override
	public ImageIcon getViewIcon() {
		return ImageHelper.INSTANCE.getImageIcon("gui.png");
	}

	@Override
	public void startGame(Game game) {
	}

	@Override
	public void nextRound() {
	}
}