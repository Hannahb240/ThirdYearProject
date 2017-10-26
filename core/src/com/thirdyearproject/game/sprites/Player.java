package com.thirdyearproject.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Hannah on 18/10/2017.
 */

public class Player {

    private static final int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velocity;

    private Texture player;

    //start position of the player
    public Player( int x, int y ) {


        position = new Vector3(x, y, 0);
        //starting it not moving
        velocity = new Vector3(0, 0, 0);
        player = new Texture("character.png");
    }

    //send delta time to player class and position
    public void update(float dt) {
        if(position.y > 0) {
            velocity.add(0, GRAVITY, 0);
        }
        //change velocity with respect to time
        velocity.scl(dt);
        position.add(0, velocity.y, 0);
        if(position.y < 0) {
            position.y = 0;
        }

        velocity.scl(1/dt);


    }

    public Texture getPlayer() {

        return player;
    }

    public Vector3 getPosition() {

        return position;
    }

    public void jump() {
        velocity.y = 250;
    }
}
