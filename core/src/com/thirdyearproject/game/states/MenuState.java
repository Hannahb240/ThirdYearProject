package com.thirdyearproject.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.thirdyearproject.game.ThirdYearProject;

/**
 * Created by Hannah on 18/10/2017.
 */

public class MenuState extends State {

    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("grass.jpg");
        playBtn = new Texture("playbtn.png");

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
        sb.draw(playBtn, (ThirdYearProject.WIDTH / 2) - (playBtn.getWidth() / 2), ThirdYearProject.HEIGHT / 2);
        sb.end();
    }

    //Call this when we transition states
    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
