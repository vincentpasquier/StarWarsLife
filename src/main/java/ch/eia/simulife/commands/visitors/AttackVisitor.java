package ch.eia.simulife.commands.visitors;

import ch.eia.simulife.commands.CommandVisitor;
import ch.eia.simulife.creatures.DarthVader;
import ch.eia.simulife.creatures.DeathStar;
import ch.eia.simulife.creatures.Dog;
import ch.eia.simulife.creatures.FemaleSheep;
import ch.eia.simulife.creatures.Fence;
import ch.eia.simulife.creatures.HothPlanet;
import ch.eia.simulife.creatures.Jedi;
import ch.eia.simulife.creatures.MaleSheep;
import ch.eia.simulife.creatures.RebelPilot;
import ch.eia.simulife.creatures.Shepherd;
import ch.eia.simulife.creatures.Sith;
import ch.eia.simulife.creatures.Stormtrooper;
import ch.eia.simulife.creatures.Wolf;
import ch.eia.simulife.creatures.Yoda;

public class AttackVisitor implements CommandVisitor {
	
	
	
	public AttackVisitor() {
		
	}

	@Override
	public void visit(DarthVader darthVader) {
	}

	@Override
	public void visit(DeathStar deathStar) {
	}

	@Override
	public void visit(Dog dog) {
	}

	@Override
	public void visit(FemaleSheep femaleSheep) {
	}

	@Override
	public void visit(Fence fence) {
	}

	@Override
	public void visit(HothPlanet hothPlanet) {
	}

	@Override
	public void visit(Jedi jedi) {
	}

	@Override
	public void visit(MaleSheep maleSheep) {
	}

	@Override
	public void visit(RebelPilot rebelPilot) {
	}

	@Override
	public void visit(Shepherd shepherd) {
	}

	@Override
	public void visit(Sith sith) {
	}

	@Override
	public void visit(Stormtrooper stormtrooper) {
	}

	@Override
	public void visit(Wolf wolf) {
	}

	@Override
	public void visit(Yoda yoda) {
	}

}
