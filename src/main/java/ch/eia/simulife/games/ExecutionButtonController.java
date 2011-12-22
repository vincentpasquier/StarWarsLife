package ch.eia.simulife.games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch.eia.simulife.games.executions.Execution;

public class ExecutionButtonController implements ActionListener {

	private Execution execution;
	private ChoiceView vChoice;

	public ExecutionButtonController(Execution execution, ChoiceView vChoice) {
		this.execution = execution;
		this.vChoice = vChoice;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vChoice.switchViewSelection(execution);
	}

}
