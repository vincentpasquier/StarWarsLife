package ch.eia.simulife.games.executions;

import java.awt.event.ActionListener;

import ch.eia.simulife.games.ChoiceView;
import ch.eia.simulife.games.ExecutionButtonController;
import ch.eia.simulife.games.Listable;


public abstract class Execution implements Listable {

	@Override
	public ActionListener getActionListener(ChoiceView vChoice) {
		return new ExecutionButtonController(this, vChoice);
	}
}
