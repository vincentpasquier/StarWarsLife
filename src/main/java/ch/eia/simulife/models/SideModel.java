package ch.eia.simulife.models;

import ch.eia.simulife.creatures.Creature;

public interface SideModel {

	Creature selectCreature();

	void creationCreature();
}