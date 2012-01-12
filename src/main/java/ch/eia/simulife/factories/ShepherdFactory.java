package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public class ShepherdFactory extends CreatureFactory {

	@Override
	public List<Creature> createCreatures() {
		List<Creature> lCreature = super.createCreatures();
		lCreature.add(createShepherd());
		return lCreature;
	}

}