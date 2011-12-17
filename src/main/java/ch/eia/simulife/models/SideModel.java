package ch.eia.simulife.models;

import ch.eia.simulife.characters.Creature;

public interface SideModel {

	public Creature selectCharacter();

	public void creationCharacter();
}