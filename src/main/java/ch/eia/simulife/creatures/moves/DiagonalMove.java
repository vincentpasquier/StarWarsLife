package ch.eia.simulife.creatures.moves;

public class DiagonalMove extends CreatureMove {
	public DiagonalMove() {
		super();
		super.addDisplacement(Displacement.UPLEFT).addDisplacement(Displacement.UPRIGHT)
				.addDisplacement(Displacement.DOWNLEFT).addDisplacement(Displacement.DOWNRIGHT);
	}
}