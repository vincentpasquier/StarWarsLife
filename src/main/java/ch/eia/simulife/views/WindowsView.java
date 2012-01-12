package ch.eia.simulife.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.board.Cell;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.games.executions.Execution;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.utils.ImageHelper;

public class WindowsView extends View {

	private JFrame frame;
	private JPanel pnCreatures;
	private JPanel pnButton;
	private JButton btNextRound;
	private List<List<JLabel>> lIconsLabels;

	@Override
	public String getName() {
		return "Interface";
	}

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("gui.png");
	}

	@Override
	public void startGame() {
		Game game = GameModel.INSTANCE.getGame();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(game.getName());
		frame.setSize(new Dimension(game.getbHeigth() * Constants.GRID_LABEL_SIZE, game.getbHeigth()
				* Constants.GRID_LABEL_SIZE));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		pnCreatures = new JPanel(new GridLayout(game.getbHeigth(), game.getbWidth(), Constants.GRID_LAYOUT_GAP,
				Constants.GRID_LAYOUT_GAP));
		pnButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
		frame.add(pnCreatures, BorderLayout.CENTER);
		frame.add(pnButton, BorderLayout.SOUTH);

		btNextRound = new JButton("Next round");
		btNextRound.setEnabled(false);
		pnButton.add(btNextRound);

		lIconsLabels = new ArrayList<List<JLabel>>();
		for (int i = 0; i < game.getbHeigth(); i++) {
			List<JLabel> lWidth = new ArrayList<JLabel>();
			lIconsLabels.add(lWidth);
			for (int j = 0; j < game.getbWidth(); j++) {
				JLabel jb = new JLabel();
				jb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				lWidth.add(jb);
				pnCreatures.add(jb, i, j);
			}
		}
		frame.setVisible(true);

		displayBoard();
	}

	@Override
	public void nextRound() {
		if (SwingUtilities.isEventDispatchThread()) {
			displayBoard();
		} else {
			try {
				SwingUtilities.invokeAndWait(new Runnable() {

					@Override
					public void run() {
						displayBoard();
					}
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void askForNextRound(final Execution execution) {
		if (btNextRound.getActionListeners().length <= 0) {
			btNextRound.setEnabled(true);
			btNextRound.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					btNextRound.setEnabled(false);
					btNextRound.removeActionListener(this);
					execution.callback();
				}
			});
		}
	}

	private void displayBoard() {
		Board board = GameModel.INSTANCE.getBoard();
		Game game = GameModel.INSTANCE.getGame();
		for (int i = 0; i < game.getbHeigth(); i++) {
			List<JLabel> lIconsLabelsWidth = lIconsLabels.get(i);
			for (int j = 0; j < game.getbWidth(); j++) {
				Cell cell = board.getCellAt(i, j);
				Creature movable = cell.getCreature();
				Creature toDisplay = movable.isCreatureUsingSpace() ? movable : cell.getUnmovable();
				lIconsLabelsWidth.get(j).setIcon(toDisplay.getCreatureDisplay().getImageIcon());
			}
		}
		pnCreatures.validate();
		pnCreatures.repaint();
	}

	@Override
	public void displayGameOver(String winner) {
		JOptionPane.showMessageDialog(null, winner, "Game Over !", JOptionPane.WARNING_MESSAGE);
	}
}