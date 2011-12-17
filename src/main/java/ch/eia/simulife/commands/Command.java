package ch.eia.simulife.commands;

import ch.eia.simulife.characters.Creature;

public interface Command {

	public void execute(Creature aCharacter);

	public void unexecute();
}