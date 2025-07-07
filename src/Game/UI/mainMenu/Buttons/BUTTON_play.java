package Game.UI.mainMenu.Buttons;

import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BUTTON_play extends JLabel {
    private GAME_StateManager gameStateManager;
    public BUTTON_play() {
        this.setBackground(Color.BLUE);
        this.setOpaque(true);
        this.setText("PLAY");
        this.addAction();
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }
    private void addAction(){
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                gameStateManager.STATE_PLAYING();
            }
        });
    }
}
