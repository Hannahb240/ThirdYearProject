package com.thirdyearproject.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.thirdyearproject.game.ThirdYearProject;
import com.thirdyearproject.game.sprites.CustomButton;

/**
 * Created by Hannah on 18/10/2017.
 */

public class MenuState extends State {

    private Texture background;
    private Texture playButton;
    private Texture rulesButton;

    private Actor actor;



    private CustomButton thePlayButton;

    public MenuState(GameStateManager gsm) {

        super(gsm);
        background = new Texture("MenuBackground.jpg");
        playButton = new Texture("PlayButton.png");
        rulesButton = new Texture("RulesButton.png");
        actor = new Actor();
    }
    @Override
    public void handleInput() {

        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose();
        }

    }
    @Override
    public void update(float dt) {
        handleInput();
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    //Spritebatch needs to open and close.
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();

        sb.draw(background, 0, 0, ThirdYearProject.WIDTH, ThirdYearProject.HEIGHT );
        sb.draw(playButton, (ThirdYearProject.WIDTH / 2) - (playButton.getWidth() / 2), ThirdYearProject.HEIGHT / 2);
        sb.draw(rulesButton,(ThirdYearProject.WIDTH / 2) - (rulesButton.getWidth() / 2), ThirdYearProject.HEIGHT / 3);
        sb.end();
    }

    //Call this when we transition states
    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();
        rulesButton.dispose();
    }
}
