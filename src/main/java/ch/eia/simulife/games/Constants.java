package ch.eia.simulife.games;

public final class Constants {

	public static final int MAXIMUM_CONTROLLERS = 8;

	public static final int PAUSE_TIME = 100;

	public static final int CREATURE_RADIUS = 1;
	
	public static final int CREATURE_PUSH = 2;
	
	public static final int DOG_PUSH = 1;
	
	public static final int MOVES_BEFORE_KILLING_SHEEP = 8;

	public static final int DEFAULT_CREATURE_WIDTH = 1;

	public static final int DEFAULT_CREATURE_HEIGHT = 1;

	public static final int DEFAULT_BOARD_HEIGTH = 8;

	public static final int DEFAULT_BOARD_WIDTH = 8;

	public static final int DIVISION_FACTOR_CREATURE_NUMBER = 10;

	public static final int ROW_SIZE = 75;
	
	public static final int WIDTH = 220;

	public static final int GRID_LAYOUT_GAP = 2;
	
	public static final int GRID_LABEL_SIZE = 50;

	public static final String GAME_OVER_CHECKER_EMPIRE = "Empire";

	public static final String GAME_OVER_CHECKER_ALLIANCE = "Alliance";

	public static final String GAME_OVER_CHECKER_SHEEPS = "Sheeps";

	public static final String GAME_OVER_CHECKER_WOLFS = "Wolfs";

	public static final String GAME_OVER_CHECKER_DOG_SHEPHERD = "Dog and Shepherd";

	private Constants() {
		throw new AssertionError();
	}

}
