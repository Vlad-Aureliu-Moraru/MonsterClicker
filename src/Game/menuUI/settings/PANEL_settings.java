package Game.menuUI.settings;

import Game.menuUI.settings.Buttons.BUTTON_menu;
import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.*;

public class PANEL_settings extends JPanel {
   private int GAME_WIDTH;
   private int GAME_HEIGHT;
   private Image background = new ImageIcon("assets/BackgroundImg/SettingsBg.png").getImage();
   private GAME_StateManager gameStateManager;

   private BUTTON_menu buttonMenu =  new BUTTON_menu();
    public PANEL_settings(int GAMEWIDTH, int GAMEHEIGHT  ) {
        this.GAME_WIDTH = GAMEWIDTH;
        this.GAME_HEIGHT = GAMEHEIGHT;
        this.setLayout(null);
        addButtons();
    }
    private void addButtons() {
    buttonMenu.setBounds(5,5,87,80);
    this.add(buttonMenu);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0,GAME_WIDTH,GAME_HEIGHT, this);
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
        buttonMenu.setGameStateManager(gameStateManager);
    }
}
