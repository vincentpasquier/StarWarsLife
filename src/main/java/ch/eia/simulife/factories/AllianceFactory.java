package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public class AllianceFactory extends CreatureFactory {

	@Override
	public List<Creature> createCreatures() {
		List<Creature> lCreature = super.createCreatures();
		int nbCreature = creatureNumber;
		while (nbCreature-- > 0) {
			lCreature.add(createRebelPilot());
		}
		nbCreature = creatureNumber / 2;
		while (nbCreature-- > 0) {
			lCreature.add(createJedi());
		}
		lCreature.add(createYoda());
		return lCreature;
	}

	@Override
	public List<Creature> createUnmovableCreature() {
		List<Creature> lUnmovableCreature = super.createUnmovableCreature();
		lUnmovableCreature.add(createHothPlanet());
		return lUnmovableCreature;
	}
}