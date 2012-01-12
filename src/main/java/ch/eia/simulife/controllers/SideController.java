package ch.eia.simulife.controllers;

import ch.eia.simulife.commands.Turn;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.models.SideModel;

public abstract class SideController {

	private final SideModel model;

	protected SideController(CreatureFactory factory) {
		model = new SideModel();
		model.setCreatureFactory(factory);
	}

	public void playRound() {
		Turn turn = new Turn(model.selectCreature(), this);
		turn.execute();
	}

	public SideModel getModel() {
		return model;
	}

	public void checkIntegrity() {
	}
}