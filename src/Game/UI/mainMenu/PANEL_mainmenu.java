package Game.UI.mainMenu;

import Game.UI.mainMenu.Buttons.BUTTON_exit;
import Game.UI.mainMenu.Buttons.BUTTON_play;
import Game.UI.mainMenu.Buttons.BUTTON_settings;
import Game.gameLogic.gameManager.GAME_StateManager;

import javax.swing.*;
import java.awt.*;

public class PANEL_mainmenu extends JPanel {
    private BUTTON_play button_play = new BUTTON_play();
    private BUTTON_settings button_settings =  new BUTTON_settings();
    private BUTTON_exit button_exit = new BUTTON_exit();
    private Image background = new ImageIcon("assets/BackgroundImg/MainMenuBg.png").getImage();
    private int GAME_WIDTH;
    private int GAME_HEIGHT;

    private GAME_StateManager gameStateManager = new GAME_StateManager();

    public PANEL_mainmenu(int GAME_WIDTH, int GAME_HEIGHT) {
        this.GAME_WIDTH = GAME_WIDTH;
        this.GAME_HEIGHT = GAME_HEIGHT;
        this.setBackground(Color.green);
        this.setVisible(true);
        this.setLayout(null);
        addButtons();
    }
    private void addButtons() {
        button_play.setBounds(GAME_WIDTH-850,GAME_HEIGHT-650, 250, 70);
        button_settings.setBounds(GAME_WIDTH-850,GAME_HEIGHT-500, 250, 70);
        button_exit.setBounds(GAME_WIDTH -850, GAME_HEIGHT-350, 250, 70);
        this.add(button_play);
        this.add(button_settings);
        this.add(button_exit);
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
        button_play.setGameStateManager(gameStateManager);
        button_exit.setGameStateManager(gameStateManager);
        button_settings.setGameStateManager(gameStateManager);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0,GAME_WIDTH,GAME_HEIGHT, this);
    }
}
