package ch.eia.simulife.views.utils;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

public enum ImageHelper {
	INSTANCE;

	private static final int WIDTH = 48;
	private static final int HEIGHT = 48;
	private static final String APPEND = "/images/";
	private Map<String, ImageIcon> mImgs;

	private ImageHelper() {
		mImgs = new HashMap<String, ImageIcon>();
	}

	public ImageIcon getImageIcon(String image) {
		ImageIcon iIcon;
		if (mImgs.containsKey(image)) {
			iIcon = mImgs.get(image);
		} else {
			iIcon = loadResizedImage(image);
			mImgs.put(image, iIcon);
		}
		return iIcon;
	}

	private ImageIcon loadResizedImage(String image) {
		return new ImageIcon((new ImageIcon(getClass().getResource(APPEND + image))).getImage().getScaledInstance(
				WIDTH, HEIGHT, Image.SCALE_SMOOTH));
	}
}