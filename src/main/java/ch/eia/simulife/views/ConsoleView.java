package ch.eia.simulife.views;

import java.util.Scanner;

import javax.swing.ImageIcon;

import ch.eia.simulife.board.Board;
import ch.eia.simulife.board.Cell;
import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.games.executions.Execution;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.utils.ImageHelper;

public class ConsoleView extends View {

	private int turnID;

	@Override
	public ImageIcon getImageIcon() {
		return ImageHelper.INSTANCE.getImageIcon("console.png");
	}

	@Override
	public String getName() {
		return "Console";
	}

	@Override
	public void startGame() {
		this.turnID = 0;
		System.out.println(printBoard().toString());
	}

	@Override
	public void nextRound() {
		turnID++;
		System.out.println(printBoard().toString());
	}

	@Override
	public void askForNextRound(Execution execution) {
		System.out.println();
		System.out.println("Press <Enter> to continue");
		Scanner s = new Scanner(System.in);
		String res = s.nextLine();
		System.out.println(res);
		execution.callback();
	}

	protected StringBuffer printBoard() {
		Game game = GameModel.INSTANCE.getGame();
		Board board = GameModel.INSTANCE.getBoard();
		StringBuffer sb = new StringBuffer();
		sb.append("Turn id : ").append(turnID).append("\n");
		for (int i = 0; i < game.getbHeigth(); i++) {
			sb.append("|");
			for (int nbElem = (game.getbWidth() * 4) - 1; nbElem > 0; nbElem--)
				sb.append("-");
			sb.append("|").append("\n").append("|");
			for (int j = 0; j < game.getbWidth(); j++) {
				Cell cell = board.getCellAt(i, j);
				Creature unmovableCreature = cell.getUnmovable();
				Creature movableCreature = cell.getCreature();
				sb.append(" ");
				if (movableCreature.isCreatureUsingSpace()) {
					sb.append(movableCreature.getCreatureDisplay().getName());
				} else {
					sb.append(unmovableCreature.getCreatureDisplay().getName());
				}
				sb.append((j < game.getbWidth() - 1) ? " |" : "");
			}
			sb.append(" |").append("\n");
		}
		sb.append("|");
		for (int nbElem = (game.getbWidth() * 4) - 1; nbElem > 0; nbElem--)
			sb.append("-");
		sb.append("|").append("\n\n");
		return sb;
	}

	@Override
	public void displayGameOver(String winner) {
		System.out.println(winner);
	}

}