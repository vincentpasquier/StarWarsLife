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

public interface IVisitor {
	
	boolean isProtected();
	
	boolean isContinuous();
	
	Creature getCreature();
	
	VisitorStatus getStatus();
	
	void setInteractCreature(Creature creature);

	void visit(DarthVader darthVader);

	void visit(DeathStar deathStar);

	void visit(Dog dog);

	void visit(FemaleSheep femaleSheep);

	void visit(Fence fence);

	void visit(HothPlanet hothPlanet);

	void visit(Jedi jedi);

	void visit(MaleSheep maleSheep);

	void visit(NoCreature noCreature);

	void visit(RebelPilot rebelPilot);

	void visit(Shepherd shepherd);

	void visit(Sith sith);

	void visit(Stormtrooper stormtrooper);

	void visit(Wolf wolf);

	void visit(Yoda yoda);

}
