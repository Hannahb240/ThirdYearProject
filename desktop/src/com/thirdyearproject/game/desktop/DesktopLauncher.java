package com.thirdyearproject.game.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.thirdyearproject.game.ThirdYearProject;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = ThirdYearProject.WIDTH;
		config.height = ThirdYearProject.HEIGHT;
		config.title = ThirdYearProject.TITLE;
		new LwjglApplication(new ThirdYearProject(), config);
	}

}
