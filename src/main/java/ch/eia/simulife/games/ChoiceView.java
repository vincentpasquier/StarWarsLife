package ch.eia.simulife.games;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch.eia.simulife.SimuLife;
import ch.eia.simulife.games.executions.Execution;
import ch.eia.simulife.views.View;

public final class ChoiceView extends JFrame {

	//
	private static final long serialVersionUID = -4972735076473802388L;
	private final SimuLife simuLife;
	private View view;
	private Game game;
	private final List<View> lViews;
	private final List<Execution> lExecutions;
	private static final int ROW_SIZE = 75;
	private static final int WIDTH = 220;
	private JPanel pnChoiceGame = new JPanel(new GridLayout(0, 1, 0, 0));

	public ChoiceView(final List<Game> lGames, final List<View> lViews, final List<Execution> lExecutions,
			final SimuLife simuLife) {
		super();
		this.lViews = lViews;
		this.lExecutions = lExecutions;
		this.simuLife = simuLife;
		updateSize(lGames);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("SimuLife");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(pnChoiceGame, BorderLayout.CENTER);

		generateButtonsWithEventHandler(lGames);
	}

	protected void switchViewSelection(Game game) {
		this.game = game;
		generateButtonsWithEventHandler(lViews);
	}

	protected void switchViewSelection(View view) {
		this.view = view;
		generateButtonsWithEventHandler(lExecutions);
	}

	protected void switchViewSelection(Execution execution) {
		simuLife.startGame(game, view, execution);
	}

	private void generateButtonsWithEventHandler(List<? extends Listable> lListable) {
		cleanPnChoiceList();
		updateSize(lListable);
		for (Listable listable : lListable) {
			JButton jb = new JButton(listable.getName());
			jb.addActionListener(listable.getActionListener(this));
			jb.setIcon(listable.getImageIcon());
			pnChoiceGame.add(jb);
		}
		super.validate();
		super.repaint();
	}

	private void updateSize(List<?> list) {
		Dimension frameSize = new Dimension(WIDTH, ROW_SIZE * list.size());
		setMinimumSize(frameSize);
		setPreferredSize(frameSize);
	}

	private void cleanPnChoiceList() {
		for (Component c : pnChoiceGame.getComponents())
			pnChoiceGame.remove(c);
	}

}
