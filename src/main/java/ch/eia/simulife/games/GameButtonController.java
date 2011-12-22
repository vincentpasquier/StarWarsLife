package ch.eia.simulife.games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButtonController implements ActionListener {
	
	private Game game;
	private ChoiceView vChoice;
	
	public GameButtonController(Game game, ChoiceView vChoice) {
		this.game = game;
		this.vChoice = vChoice;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vChoice.switchViewSelection(game);
	}

}
