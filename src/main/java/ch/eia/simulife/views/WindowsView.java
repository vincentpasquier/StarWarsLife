package ch.eia.simulife.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import ch.eia.simulife.games.Game;
import ch.eia.simulife.utils.ImageHelper;

public class WindowsView extends View {

	private static final long serialVersionUID = 761538419796761757L;
	private JFrame frame;

	public WindowsView() {
		frame = new JFrame();
	}

	@Override
	public String getName() {
		return "Interface";
	}

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("gui.png");
	}

	@Override
	public void startGame(Game game) {
	}

	@Override
	public void nextRound() {
	}
}