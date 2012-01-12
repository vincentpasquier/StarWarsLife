package ch.eia.simulife.views.choice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch.eia.simulife.games.Listable;

public class ChoiceViewController implements ActionListener {

	private Listable listable;
	private ChoiceView vChoice;

	public ChoiceViewController(Listable execution, ChoiceView vChoice) {
		this.listable = execution;
		this.vChoice = vChoice;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vChoice.getChoiceState().updateReference(listable, vChoice);
	}

}
