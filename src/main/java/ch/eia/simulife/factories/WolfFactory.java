package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public class WolfFactory extends CreatureFactory {

	@Override
	public List<Creature> createCreatures() {
		List<Creature> lCreature = super.createCreatures();
		int nbCreature = creatureNumber;
		while (nbCreature-- > 0) {
			lCreature.add(createWolf());
		}
		return lCreature;
	}

}