package ch.eia.simulife.gamechoice;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch.eia.simulife.SimuLife;
import ch.eia.simulife.views.View;

public final class ChoiceView extends JFrame {

	//
	private static final long serialVersionUID = -4972735076473802388L;
	private final SimuLife simuLife;
	private Game game;
	private final List<Game> lGames;
	private final List<View> lViews;
	private static final int ROW_SIZE = 75;
	private static final int WIDTH = 220;
	private JPanel pnChoiceGame = new JPanel();

	public ChoiceView(final List<Game> lGames, final List<View> lViews, final SimuLife simuLife) {
		super();
		this.lGames = lGames;
		this.lViews = lViews;
		this.simuLife = simuLife;
		updateSize(WIDTH, ROW_SIZE * lGames.size());
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("SimuLife");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnChoiceGame.setLayout(new GridLayout(0, 1, 0, 0));
		add(pnChoiceGame, BorderLayout.CENTER);

		generateGameButtonsWithEventHandler();
		pack();
	}

	protected void switchViewSelection(Game game) {
		this.game = game;
		updateSize(WIDTH, ROW_SIZE * lViews.size());
		cleanPnChoiceList();
		generateViewButtonsWithEventHandler();
	}

	protected void switchGameStart(View view) {
		simuLife.startGame(game, view);
	}

	private void generateGameButtonsWithEventHandler() {
		for (Game game : lGames) {
			JButton jb = new JButton(game.getGameName());
			jb.addActionListener(new GameButtonController(game, this));
			jb.setIcon(game.getGameIcon());
			jb.setAlignmentX(Component.CENTER_ALIGNMENT);
			pnChoiceGame.add(jb);
		}
		super.validate();
		super.repaint();
	}

	private void generateViewButtonsWithEventHandler() {
		for (View view : lViews) {
			JButton jb = new JButton(view.getName());
			jb.addActionListener(new ViewButtonController(view, this));
			jb.setIcon(view.getViewIcon());
			pnChoiceGame.add(jb);
		}
		super.validate();
		super.repaint();
	}

	private void updateSize(int width, int heigth) {
		Dimension frameSize = new Dimension(width, heigth);
		setMinimumSize(frameSize);
		setPreferredSize(frameSize);
	}

	private void cleanPnChoiceList() {
		for (Component c : pnChoiceGame.getComponents())
			pnChoiceGame.remove(c);
	}

}
