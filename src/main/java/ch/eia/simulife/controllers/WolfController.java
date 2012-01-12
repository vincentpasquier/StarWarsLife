package ch.eia.simulife.controllers;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.factories.CreatureFactory;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.models.GameModel;

public class WolfController extends SideController {

	public WolfController(CreatureFactory factory) {
		super(factory);
	}

	@Override
	public void checkIntegrity() {
		for (Creature creature : getModel().getCreatures()) {
			if (creature.getMovesBeforeWithoutKilling() >= Constants.MOVES_BEFORE_KILLING_SHEEP) {
				GameModel.INSTANCE.kill(creature);
				GameModel.INSTANCE.getBoard().removeCreature(creature);
			}
		}
	}
}