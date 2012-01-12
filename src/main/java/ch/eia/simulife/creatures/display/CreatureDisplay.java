package ch.eia.simulife.creatures.display;

import javax.swing.ImageIcon;

import ch.eia.simulife.views.utils.ImageHelper;

public enum CreatureDisplay {
	FEMALE_SHEEP("F", ImageHelper.INSTANCE.getImageIcon("femalesheep.png")),
	MALE_SHEEP("M", ImageHelper.INSTANCE.getImageIcon("malesheep.png")),
	FENCE("#", ImageHelper.INSTANCE.getImageIcon("fence.png")),
	WOLF("W", ImageHelper.INSTANCE.getImageIcon("wolf.png")),
	SHEPHERD("S", ImageHelper.INSTANCE.getImageIcon("shepherd.png")),
	DOG("D", ImageHelper.INSTANCE.getImageIcon("dog.png")),
	SITH("S", ImageHelper.INSTANCE.getImageIcon("sith.png")),
	DEATH_STAR("D", ImageHelper.INSTANCE.getImageIcon("deathstar.png")),
	STORMTROOPER("T", ImageHelper.INSTANCE.getImageIcon("stormtrooper.png")),
	DARTH_VADER("D", ImageHelper.INSTANCE.getImageIcon("darthvader.png")),
	HOTH_PLANET("H", ImageHelper.INSTANCE.getImageIcon("hoth.png")),
	JEDI("J", ImageHelper.INSTANCE.getImageIcon("jedi.png")),
	YODA("Y", ImageHelper.INSTANCE.getImageIcon("yoda.png")),
	REBEL_PILOT("R", ImageHelper.INSTANCE.getImageIcon("rebelpilot.png")),
	NO_CREATURE(" ", ImageHelper.INSTANCE.getImageIcon("empty.png"));

	private final String console;
	private final ImageIcon iIcon;

	public String getName() {
		return console;
	}

	public ImageIcon getImageIcon() {
		return iIcon;
	}

	private CreatureDisplay(String console, ImageIcon iIcon) {
		this.console = console;
		this.iIcon = iIcon;
	}
}