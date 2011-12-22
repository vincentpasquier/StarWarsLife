package ch.eia.simulife.commands;

import ch.eia.simulife.creatures.Creature;

public interface Command {

	public void execute(Creature creature);

	public void unexecute();
}