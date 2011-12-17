package ch.eia.simulife.commands;

import ch.eia.simulife.characters.DarthVader;
import ch.eia.simulife.characters.DeathStar;
import ch.eia.simulife.characters.Dog;
import ch.eia.simulife.characters.FemaleSheep;
import ch.eia.simulife.characters.Fence;
import ch.eia.simulife.characters.HothPlanet;
import ch.eia.simulife.characters.Jedi;
import ch.eia.simulife.characters.MaleSheep;
import ch.eia.simulife.characters.RebelPilot;
import ch.eia.simulife.characters.Shepherd;
import ch.eia.simulife.characters.Sith;
import ch.eia.simulife.characters.Stormtrooper;
import ch.eia.simulife.characters.Wolf;
import ch.eia.simulife.characters.Yoda;

public interface CommandVisitor {

	void visit(DarthVader darthVader);

	void visit(DeathStar deathStar);

	void visit(Dog dog);

	void visit(FemaleSheep femaleSheep);

	void visit(Fence fence);

	void visit(HothPlanet hothPlanet);

	void visit(Jedi jedi);

	void visit(MaleSheep maleSheep);

	void visit(RebelPilot rebelPilot);

	void visit(Shepherd shepherd);

	void visit(Sith sith);

	void visit(Stormtrooper stormtrooper);

	void visit(Wolf wolf);

	void visit(Yoda yoda);

}
