package ch.eia.simulife.creatures.moves;

public class AllMove extends CreatureMove {
	public AllMove() {
		super();
		super.addDisplacement(Displacement.UPLEFT).addDisplacement(Displacement.UP)
				.addDisplacement(Displacement.UPRIGHT).addDisplacement(Displacement.LEFT)
				.addDisplacement(Displacement.RIGHT).addDisplacement(Displacement.DOWNLEFT)
				.addDisplacement(Displacement.DOWN).addDisplacement(Displacement.DOWNRIGHT);
	}
}