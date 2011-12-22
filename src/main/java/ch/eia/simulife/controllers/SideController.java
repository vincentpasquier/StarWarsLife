package ch.eia.simulife.controllers;

import ch.eia.simulife.commands.Turn;
import ch.eia.simulife.models.SideModel;

public abstract class SideController {

	private SideModel model;

	protected SideController(SideModel model) {
		this.model = model;
	}
	
	public void playRound() {
		Turn turn = new Turn(model.selectCreature());
	}

	public SideModel getModel() {
		return model;
	}
}