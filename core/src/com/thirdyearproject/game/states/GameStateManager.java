package com.thirdyearproject.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Hannah on 18/10/2017.
 */

public class GameStateManager {

    private Stack<State> states;

    public GameStateManager() {

        states = new Stack<State>();

    }

    public void push(State state) {
        states.push(state);

    }

    public void pop() {

        states.pop();
    }

    //For when we want to pop and instantly push a new state
    public void set(State state) {
        states.pop();
        states.push(state);
    }

    public void update(float dt) {

        states.peek().update(dt);

    }

    public void render(SpriteBatch sb) {

        states.peek().render(sb);
    }
}
