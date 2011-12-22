package ch.eia.simulife.games;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public interface Listable {

	ActionListener getActionListener(ChoiceView vChoice);

	ImageIcon getImageIcon();

	String getName();

}
