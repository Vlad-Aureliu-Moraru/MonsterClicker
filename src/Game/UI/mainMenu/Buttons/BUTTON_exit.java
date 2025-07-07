package Game.UI.mainMenu.Buttons;

import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.*;

public class BUTTON_exit extends JLabel {
    private GAME_StateManager gameStateManager;
    public BUTTON_exit() {
        this.setBackground(Color.red);
        this.setOpaque(true);
        this.setText("EXIT");
        this.setVisible(true);
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }
}
