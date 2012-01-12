package ch.eia.simulife.views.choice;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch.eia.simulife.SimuLife;
import ch.eia.simulife.factories.ListableFactory;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.games.Listable;

public final class ChoiceView extends JFrame {

	private static final long serialVersionUID = -4972735076473802388L;
	private final SimuLife simuLife;
	private JPanel pnChoiceGame = new JPanel(new GridLayout(0, 1, 0, 0));
	private ChoiceState state;

	public ChoiceView(final SimuLife simuLife) {
		super();
		this.simuLife = simuLife;
		this.state = ChoiceState.CHOICE_GAME;
		setResizable(false);
		setTitle("SimuLife");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(pnChoiceGame, BorderLayout.CENTER);

		generateButtonsWithEventHandler(ListableFactory.buildGameList());
		setVisible(true);
	}

	public void switchSelectionView() {
		generateButtonsWithEventHandler(ListableFactory.buildViewList());
	}

	public void switchSelectionExecution() {
		generateButtonsWithEventHandler(ListableFactory.buildExecutionList());
	}

	public void switchStartGame() {
		setVisible(false);
		simuLife.startGame();
	}
	
	protected ChoiceState getChoiceState() {
		return state;
	}

	protected void setChoiceState(final ChoiceState state) {
		this.state = state;
	}

	private void generateButtonsWithEventHandler(final List<? extends Listable> lListable) {
		cleanPnChoiceList();
		updateSize(lListable);
		setLocationRelativeTo(null);
		for (Listable listable : lListable) {
			JButton jb = new JButton(listable.getName());
			jb.addActionListener(new ChoiceViewController(listable, this));
			jb.setIcon(listable.getImageIcon());
			pnChoiceGame.add(jb);
		}
		super.validate();
		super.repaint();
	}

	private void updateSize(final List<?> list) {
		Dimension frameSize = new Dimension(Constants.WIDTH, Constants.ROW_SIZE * list.size());
		setMinimumSize(frameSize);
		setPreferredSize(frameSize);
	}

	private void cleanPnChoiceList() {
		for (Component c : pnChoiceGame.getComponents()) {
			pnChoiceGame.remove(c);
		}
	}

}
