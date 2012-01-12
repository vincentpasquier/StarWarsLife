package ch.eia.simulife.creatures;

import java.awt.Point;

import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.CreatureMove;
import ch.eia.simulife.games.Constants;
import ch.eia.simulife.visitors.GenericVisitor;
import ch.eia.simulife.visitors.IVisitor;

public abstract class Creature {

	private Point pos;
	private boolean protect;
	private final CreatureMove move;
	private final CreatureDisplay display;
	private IVisitor vProtect;
	private IVisitor vAttack;
	private IVisitor vAction;
	private IVisitor vTransform;
	private int movesWithoutKilling;

	protected Creature(CreatureMove move, CreatureDisplay display) {
		this.move = move;
		this.display = display;
		this.movesWithoutKilling = 0;
		vProtect = new GenericVisitor();
		vAttack = new GenericVisitor();
		vAction = new GenericVisitor();
		vTransform = new GenericVisitor();
	}

	public int getWidth() {
		return Constants.DEFAULT_CREATURE_WIDTH;
	}

	public int getHeight() {
		return Constants.DEFAULT_CREATURE_HEIGHT;
	}

	public CreatureMove getCreatureMove() {
		return move;
	}

	public CreatureDisplay getCreatureDisplay() {
		return display;
	}

	/**
	 * Used for generic placement of Creature on the board.
	 * 
	 * @return whether or not the {@code Creature} is using place
	 * @see NoCreature
	 */
	public boolean isCreatureUsingSpace() {
		return true;
	}
	
	public boolean isCreatureProtected() {
		return protect;
	}
	
	public void setCreatureProtected(boolean protect) {
		this.protect = protect;
	}

	public Point getPosition() {
		return (Point) pos.clone();
	}

	public void setPosition(Point pos) {
		this.pos = (Point) pos.clone();
	}

	public void setProtectVisitor(IVisitor vProtect) {
		this.vProtect = vProtect;
	}

	public IVisitor getProtectVisitor() {
		return vProtect;
	}

	public void setAttackVisitor(IVisitor vAttack) {
		this.vAttack = vAttack;
	}

	public IVisitor getAttackVisitor() {
		return vAttack;
	}

	public void setActionVisitor(IVisitor vAction) {
		this.vAction = vAction;
	}

	public IVisitor getActionVisitor() {
		return vAction;
	}

	public void setTransformVisitor(IVisitor vTransform) {
		this.vTransform = vTransform;
	}

	public IVisitor getTransformVisitor() {
		return vTransform;
	}

	public void incrementMovesWithoutKilling() {
		movesWithoutKilling++;
	}

	public void resetMovesWithoutKilling() {
		movesWithoutKilling = 0;
	}

	public int getMovesBeforeWithoutKilling() {
		return movesWithoutKilling;
	}

	public abstract void accept(IVisitor visitor);
}