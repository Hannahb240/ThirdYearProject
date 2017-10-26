package com.thirdyearproject.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Hannah on 18/10/2017.
 */

public abstract class State {


    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm) {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstract void handleInput();
    //deltaTime is the difference between one frame rendered, and the next frame rendered.
    public abstract void update(float dt);
    //spriteBatch is a collection of things that we want to render to the screen (textures, etc)
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();


    }






