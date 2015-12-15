/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrlamont.libgdxdemo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mrlamont.Model.Mario;
import com.mrlamont.Model.World;
import com.mrlamont.Screens.WorldRenderer;

/**
 *
 * @author lamonta
 */
public class MainGame implements Screen {

    private World theWorld;
    private Mario player;
    private WorldRenderer renderer;
    
    public MainGame() {
        theWorld = new World();
        player = theWorld.getPlayer();
        renderer = new WorldRenderer(theWorld);
    }
    
    @Override
    public void show() {
        
    }
    
    @Override
    // game loop
    public void render(float deltaTime) {
        if(Gdx.input.isKeyPressed(Keys.D)){
            player.setVelocityX(2f);
        }else if(Gdx.input.isKeyPressed(Keys.A)){
            player.setVelocityX(-2f);
        }
        
        player.update(deltaTime);
        // draw the screen
        renderer.render(deltaTime);
    }
    
    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }
    
    @Override
    public void pause() {
        
    }
    
    @Override
    public void resume() {
        
    }
    
    @Override
    public void hide() {
        
    }
    
    @Override
    public void dispose() {
        
    }
}
