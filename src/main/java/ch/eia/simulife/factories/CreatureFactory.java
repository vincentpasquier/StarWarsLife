package ch.eia.simulife.factories;

import java.awt.Point;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

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
import ch.eia.simulife.creatures.display.CreatureDisplay;
import ch.eia.simulife.creatures.moves.AllMove;
import ch.eia.simulife.creatures.moves.CrossMove;
import ch.eia.simulife.creatures.moves.DiagonalMove;
import ch.eia.simulife.creatures.moves.NoMove;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.visitors.actions.DarthVaderActionVisitor;
import ch.eia.simulife.visitors.actions.JediActionVisitor;
import ch.eia.simulife.visitors.actions.SithActionVisitor;
import ch.eia.simulife.visitors.actions.YodaActionVisitor;
import ch.eia.simulife.visitors.attacks.DarthVaderAttackVisitor;
import ch.eia.simulife.visitors.attacks.JediAttackVisitor;
import ch.eia.simulife.visitors.attacks.RebelPilotAttack;
import ch.eia.simulife.visitors.attacks.ShepherdAttackVisitor;
import ch.eia.simulife.visitors.attacks.SithAttackVisitor;
import ch.eia.simulife.visitors.attacks.StormtrooperAttackVisitor;
import ch.eia.simulife.visitors.attacks.WolfAttackVisitor;
import ch.eia.simulife.visitors.protects.DeathStarProtectVisitor;
import ch.eia.simulife.visitors.protects.FenceProtectVisitor;
import ch.eia.simulife.visitors.protects.HothPlanetProtectVisitor;
import ch.eia.simulife.visitors.protects.NoCreatureProtectVisitor;
import ch.eia.simulife.visitors.transforms.DarthVaderTransformVisitor;
import ch.eia.simulife.visitors.transforms.FemaleSheepTransformVisitor;
import ch.eia.simulife.visitors.transforms.MaleSheepTransformVisitor;
import ch.eia.simulife.visitors.transforms.YodaTransformVisitor;

public abstract class CreatureFactory {

	protected int creatureNumber = 0;

	protected CreatureFactory() {
		creatureNumber = GameModel.INSTANCE.getGame().getCreatureNumber();
	}

	public List<Creature> createCreatures() {
		return new CopyOnWriteArrayList<Creature>();
	}

	public List<Creature> createUnmovableCreature() {
		return new CopyOnWriteArrayList<Creature>();
	}

	public static Creature createDarthVader() {
		Creature darthVader = new DarthVader(new DiagonalMove(), CreatureDisplay.DARTH_VADER);
		darthVader.setAttackVisitor(new DarthVaderAttackVisitor());
		darthVader.setActionVisitor(new DarthVaderActionVisitor());
		darthVader.setTransformVisitor(new DarthVaderTransformVisitor());
		return darthVader;
	}

	public static Creature createDeathStar() {
		Creature deathStar = new DeathStar(new NoMove(), CreatureDisplay.DEATH_STAR);
		deathStar.setProtectVisitor(new DeathStarProtectVisitor());
		return deathStar;
	}

	public static Creature createDog() {
		Creature dog = new Dog(new AllMove(), CreatureDisplay.DOG);
		return dog;
	}

	public static Creature createFemaleSheep() {
		Creature femaleSheep = new FemaleSheep(new AllMove(), CreatureDisplay.FEMALE_SHEEP);
		femaleSheep.setTransformVisitor(new FemaleSheepTransformVisitor());
		return femaleSheep;
	}

	public static Creature createFence() {
		Creature fence = new Fence(new NoMove(), CreatureDisplay.FENCE);
		fence.setProtectVisitor(new FenceProtectVisitor());
		return fence;
	}

	public static Creature createHothPlanet() {
		Creature hothPlanet = new HothPlanet(new NoMove(), CreatureDisplay.HOTH_PLANET);
		hothPlanet.setProtectVisitor(new HothPlanetProtectVisitor());
		return hothPlanet;
	}

	public static Creature createJedi() {
		Creature jedi = new Jedi(new CrossMove(), CreatureDisplay.JEDI);
		jedi.setAttackVisitor(new JediAttackVisitor());
		jedi.setActionVisitor(new JediActionVisitor());
		return jedi;
	}

	public static Creature createMaleSheep() {
		Creature maleSheep = new MaleSheep(new AllMove(), CreatureDisplay.MALE_SHEEP);
		maleSheep.setTransformVisitor(new MaleSheepTransformVisitor());
		return maleSheep;
	}

	public static Creature createNoCreature(Point pos) {
		Creature noCreature = new NoCreature(new NoMove(), CreatureDisplay.NO_CREATURE);
		noCreature.setPosition(pos);
		noCreature.setProtectVisitor(new NoCreatureProtectVisitor());
		return noCreature;
	}

	public static Creature createNoCreature() {
		return createNoCreature(new Point(0, 0));
	}

	public static Creature createRebelPilot() {
		Creature rebelPilot = new RebelPilot(new AllMove(), CreatureDisplay.REBEL_PILOT);
		rebelPilot.setAttackVisitor(new RebelPilotAttack());
		return rebelPilot;
	}

	public static Creature createShepherd() {
		Creature shepherd = new Shepherd(new AllMove(), CreatureDisplay.SHEPHERD);
		shepherd.setAttackVisitor(new ShepherdAttackVisitor());
		return shepherd;
	}

	public static Creature createSith() {
		Creature sith = new Sith(new AllMove(), CreatureDisplay.SITH);
		sith.setAttackVisitor(new SithAttackVisitor());
		sith.setActionVisitor(new SithActionVisitor());
		return sith;
	}

	public static Creature createStormtrooper() {
		Creature stormtrooper = new Stormtrooper(new AllMove(), CreatureDisplay.STORMTROOPER);
		stormtrooper.setAttackVisitor(new StormtrooperAttackVisitor());
		return stormtrooper;
	}

	public static Creature createWolf() {
		Creature wolf = new Wolf(new AllMove(), CreatureDisplay.WOLF);
		wolf.setAttackVisitor(new WolfAttackVisitor());
		return wolf;
	}

	public static Creature createYoda() {
		Creature yoda = new Yoda(new DiagonalMove(), CreatureDisplay.YODA);
		yoda.setActionVisitor(new YodaActionVisitor());
		yoda.setTransformVisitor(new YodaTransformVisitor());
		return yoda;
	}

	public static Creature createRandomSheep() {
		Random random = GameModel.INSTANCE.getRandom();
		Creature sheep = random.nextBoolean() ? createFemaleSheep() : createMaleSheep();
		return sheep;
	}
}