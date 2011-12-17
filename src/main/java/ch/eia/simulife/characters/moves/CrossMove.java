package ch.eia.simulife.characters.moves;

public class CrossMove extends CreatureMove {
	public CrossMove() {
		super();
		super.addDisplacement(Displacement.UP).addDisplacement(Displacement.LEFT).addDisplacement(Displacement.RIGHT)
				.addDisplacement(Displacement.DOWN);
	}
}