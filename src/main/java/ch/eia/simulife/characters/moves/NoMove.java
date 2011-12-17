package ch.eia.simulife.characters.moves;

public final class NoMove extends CreatureMove {

	public NoMove() {
		super();
		super.addDisplacement(Displacement.NOMOVE);
	}
}