package ch.eia.simulife.creatures.moves;

public final class NoMove extends CreatureMove {

	public NoMove() {
		super();
		super.addDisplacement(Displacement.NOMOVE);
	}
}