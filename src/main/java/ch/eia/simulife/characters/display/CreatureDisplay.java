package ch.eia.simulife.characters.display;

import javax.swing.ImageIcon;

import ch.eia.simulife.views.ConsoleView;
import ch.eia.simulife.views.ImageHelper;
import ch.eia.simulife.views.WindowsView;

public enum CreatureDisplay {
	MALE_SHEEP("M", ImageHelper.INSTANCE.getImageIcon("sheep.png")),
	FEMALE_SHEEP("F", ImageHelper.INSTANCE.getImageIcon("sheep.png")),
	FENCE("F", ImageHelper.INSTANCE.getImageIcon("fence.png")),
	WOLF("F", ImageHelper.INSTANCE.getImageIcon("wolf.png")),
	SHEPHERD("F", ImageHelper.INSTANCE.getImageIcon("shepherd.png")),
	DOG("F", ImageHelper.INSTANCE.getImageIcon("dog.png")),
	SITH("F", ImageHelper.INSTANCE.getImageIcon("sith.png")),
	DEATH_STAR("F", ImageHelper.INSTANCE.getImageIcon("deathstar.png")),
	STORMTROOPER("F", ImageHelper.INSTANCE.getImageIcon("stormtrooper.png")),
	DARTH_VADER("F", ImageHelper.INSTANCE.getImageIcon("darthvader.png")),
	HOTH_PLANET("F", ImageHelper.INSTANCE.getImageIcon("hoth.png")),
	JEDI("F", ImageHelper.INSTANCE.getImageIcon("jedi.png")),
	YODA("F", ImageHelper.INSTANCE.getImageIcon("yoda.png")),
	REBEL_PILOT("F", ImageHelper.INSTANCE.getImageIcon("rebelpilot.png")),
	NO_CREATURE(" ", ImageHelper.INSTANCE.getImageIcon("empty.png"));

	private final String console;
	private final ImageIcon iIcon;

	public String getDisplay(ConsoleView aD) {
		return console;
	}

	public ImageIcon getDisplay(WindowsView aD) {
		return iIcon;
	}

	public ImageIcon getImageIcon() {
		return iIcon;
	}

	private CreatureDisplay(String console, ImageIcon iIcon) {
		this.console = console;
		this.iIcon = iIcon;
	}
}