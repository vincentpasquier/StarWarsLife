package ch.eia.simulife.commands;

import java.util.ArrayList;
import java.util.List;

import ch.eia.simulife.controllers.SideController;
import ch.eia.simulife.creatures.Creature;

public class Turn {

	private List<Command> lCommands;
	private Creature creature;
	private SideController cSide;

	public Turn(Creature creature, SideController cSide) {
		this.creature = creature;
		this.cSide = cSide;
		lCommands = new ArrayList<Command>();
		lCommands.add(new Move());
		lCommands.add(new Attack());
		lCommands.add(new Action());
		lCommands.add(new Transform());
	}

	public void execute() {
		for (Command command : lCommands) {
			command.execute(creature, cSide);
		}
	}
}