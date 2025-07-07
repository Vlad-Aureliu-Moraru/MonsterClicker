package Game.menuUI.mainMenu.Buttons;

import Game.menuUI.BUTTON;
import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BUTTON_play extends BUTTON {
    private GAME_StateManager gameStateManager;

    private boolean clicked = false;
    private Timer animationTimer;

    public BUTTON_play() {
        super("assets/ButtonSprites/playButtonSprite.png");
        this.setSpriteDetails(100,30,0,0,0,10);
        setUsingSprite(getSprites().get(0));
        this.setOpaque(false);
        this.addAction();
        initAnimTimer();
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }
    private void addAction(){
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!clicked && !animationTimer.isRunning()) {
                    clicked = true;
                    setUsingSprite(getSprites().get(1));
                    animationTimer.start();
                }
            }
        });
    }


    private void initAnimTimer(){
        animationTimer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (clicked) {
                    setUsingSprite(getSprites().get(0));
                }
                clicked = false;
                animationTimer.stop();
                gameStateManager.STATE_PLAYING();
            }
        });

    }
}
