package ch.eia.simulife.models;

import ch.eia.simulife.creatures.Creature;

public class FenceModel implements SideModel {

	@Override
	public Creature selectCreature() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void creationCreature() {
		throw new UnsupportedOperationException();
	}
}