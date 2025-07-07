package Game.UI.mainMenu.Buttons;

import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.*;

public class BUTTON_settings extends JLabel {
    private GAME_StateManager gameStateManager;
    public BUTTON_settings() {
        this.setBackground(Color.yellow);
        this.setOpaque(true);
        this.setText("SETTINGS");
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }
}
