package ch.eia.simulife.factories;

import java.util.List;

import ch.eia.simulife.characters.Creature;

public interface CharactersFactory {

	List<Creature> createCharacters();

	List<Creature> createImmovableCharacter();
}