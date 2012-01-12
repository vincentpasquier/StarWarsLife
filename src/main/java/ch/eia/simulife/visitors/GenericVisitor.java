package ch.eia.simulife.visitors;

import ch.eia.simulife.creatures.Creature;
import ch.eia.simulife.creatures.DarthVader;
import ch.eia.simulife.creatures.DeathStar;
import ch.eia.simulife.creatures.Dog;
import ch.eia.simulife.creatures.FemaleSheep;
import ch.eia.simulife.creatures.Fence;
import ch.eia.simulife.creatures.HothPlanet;
import ch.eia.simulife.creatures.Jedi;
import ch.eia.simulife.creatures.MaleSheep;
import ch.eia.simulife.creatures.NoCreature;
import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.creatures.Shepherd;
import ch.eia.simulife.creatures.Sith;
import ch.eia.simulife.creatures.Stormtrooper;
import ch.eia.simulife.creatures.Wolf;
import ch.eia.simulife.creatures.Yoda;
import ch.eia.simulife.factories.CreatureFactory;

public class GenericVisitor implements IVisitor {

	private Creature returnCreature;
	private Creature interactCreature;
	private VisitorStatus visitorStatus;

	protected void setCreature(Creature returnCreature) {
		this.returnCreature = returnCreature;
	}

	protected void setVisitorStatus(VisitorStatus visitorStatus) {
		this.visitorStatus = visitorStatus;
	}

	protected Creature getInteractCreature() {
		return interactCreature;
	}

	@Override
	public boolean isProtected() {
		return visitorStatus.equals(VisitorStatus.PROTECT);
	}

	@Override
	public boolean isContinuous() {
		return false;
	}

	@Override
	public Creature getCreature() {
		return returnCreature;
	}

	@Override
	public VisitorStatus getStatus() {
		return visitorStatus;
	}

	@Override
	public void setInteractCreature(Creature interactCreature) {
		this.interactCreature = interactCreature;
	}

	@Override
	public void visit(DarthVader darthVader) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(DeathStar deathStar) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Dog dog) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(FemaleSheep femaleSheep) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Fence fence) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(HothPlanet hothPlanet) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Jedi jedi) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(MaleSheep maleSheep) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(NoCreature noCreature) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(RebelPilot rebelPilot) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Shepherd shepherd) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Sith sith) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Stormtrooper stormtrooper) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Wolf wolf) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

	@Override
	public void visit(Yoda yoda) {
		returnCreature = CreatureFactory.createNoCreature();
		interactCreature = CreatureFactory.createNoCreature();
		visitorStatus = VisitorStatus.NOTHING;
	}

}
