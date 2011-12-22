package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public class AllianceFactory implements CharactersFactory {

	public List<Creature> createCharacters() {
		throw new UnsupportedOperationException();
	}

	public List<Creature> createImmovableCharacter() {
		throw new UnsupportedOperationException();
	}
}