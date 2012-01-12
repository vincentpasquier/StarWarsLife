package ch.eia.simulife.models;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.factories.CreatureFactory;

public class SideModel {

	private List<Creature> lCreature;
	private List<Creature> lUnmovableCreature;
	private CreatureFactory fCreature;
	private Iterator<Creature> iCreature;

	public void setCreatureFactory(CreatureFactory fCreature) {
		this.fCreature = fCreature;
	}

	public void createCreatures() {
		lCreature = fCreature.createCreatures();
		lUnmovableCreature = fCreature.createUnmovableCreature();
		createIteratorAndShuffleCreatures();
	}

	public Creature selectCreature() {
		if (lCreature.isEmpty()) {
			return CreatureFactory.createNoCreature();
		}
		iCreature = iCreature.hasNext() ? iCreature : createIteratorAndShuffleCreatures();
		return iCreature.next();
	}

	public void addCreature(Creature newCreature) {
		lCreature.add(newCreature);
	}

	public List<Creature> getCreatures() {
		return lCreature;
	}

	public List<Creature> getUnmovables() {
		return lUnmovableCreature;
	}

	private Iterator<Creature> createIteratorAndShuffleCreatures() {
		Collections.shuffle(lCreature);
		return iCreature = lCreature.iterator();
	}

}