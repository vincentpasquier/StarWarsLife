package ch.eia.simulife.commands;

import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.Creature;

public interface Command {

	public void execute(Creature creature, SideController cSide);

	public void unexecute();
}