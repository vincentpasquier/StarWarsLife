package ch.eia.simulife.gamechoice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch.eia.simulife.views.View;

public class ViewButtonController implements ActionListener {

	private View view;
	private ChoiceView vChoice;

	public ViewButtonController(View view, ChoiceView vChoice) {
		this.view = view;
		this.vChoice = vChoice;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vChoice.switchGameStart(view);
	}

}
