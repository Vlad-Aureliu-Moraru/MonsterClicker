package Game.menuUI.settings.Buttons;

import Game.menuUI.BUTTON;
import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BUTTON_menu  extends BUTTON {
    private GAME_StateManager gameStateManager;
    private boolean clicked = false;
    private Timer animationTimer;
    public BUTTON_menu() {
        super("assets/ButtonSprites/menuButtonSprite.png");
        this.setSpriteDetails(37,30,0,0,0,10);
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
                    update();
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
                    update();
                }
                clicked = false;
                animationTimer.stop();
                gameStateManager.STATE_MENU();
            }
        });

    }
}
