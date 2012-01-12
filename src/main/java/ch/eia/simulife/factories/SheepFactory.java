package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public class SheepFactory extends CreatureFactory {

	@Override
	public List<Creature> createCreatures() {
		List<Creature> lCreature = super.createCreatures();
		int nbCreature = creatureNumber;
		while (nbCreature-- > 0) {
			lCreature.add(createFemaleSheep());
		}
		nbCreature = creatureNumber;
		while (nbCreature-- > 0) {
			lCreature.add(createMaleSheep());
		}
		return lCreature;
	}

	@Override
	public List<Creature> createUnmovableCreature() {
		List<Creature> lUnmovableCreature = super.createUnmovableCreature();
		int nbCreature = creatureNumber;
		while (nbCreature-- > 0) {
			lUnmovableCreature.add(createFence());
		}
		return lUnmovableCreature;
	}

}