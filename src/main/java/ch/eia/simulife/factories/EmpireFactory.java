package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public class EmpireFactory extends CreatureFactory {

	@Override
	public List<Creature> createCreatures() {
		List<Creature> lCreature = super.createCreatures();
		int nbCreature = creatureNumber;
		while (nbCreature-- > 0) {
			lCreature.add(createStormtrooper());
		}
		nbCreature = creatureNumber / 2;
		while (nbCreature-- > 0) {
			lCreature.add(createSith());
		}
		lCreature.add(createDarthVader());
		return lCreature;
	}

	@Override
	public List<Creature> createUnmovableCreature() {
		List<Creature> lUnmovableCreature = super.createUnmovableCreature();
		lUnmovableCreature.add(createDeathStar());
		return lUnmovableCreature;
	}
}