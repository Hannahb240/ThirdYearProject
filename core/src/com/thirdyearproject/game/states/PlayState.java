package com.thirdyearproject.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.thirdyearproject.game.ThirdYearProject;
import com.thirdyearproject.game.sprites.Player;

/**
 * Created by Hannah on 18/10/2017.
 */

public class PlayState extends State {

    private Player player;
    private Texture bg;


    public PlayState(GameStateManager gsm) {

        super(gsm);
        player = new Player(50, 300);
        bg = new Texture("map.jpg");
        cam.setToOrtho(false, ThirdYearProject.WIDTH / 2, ThirdYearProject.HEIGHT / 2 );
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()) {
            player.jump();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        player.update(dt);


    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportWidth / 2), 0);
        sb.draw(player.getPlayer(), player.getPosition().x, player.getPosition().y);

        sb.end();

    }

    @Override
    public void dispose() {

    }
}
