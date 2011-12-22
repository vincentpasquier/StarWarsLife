package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.creatures.Creature;

public interface CharactersFactory {

	List<Creature> createCharacters();

	List<Creature> createImmovableCharacter();
}