package Game.gameUI;

import Game.Entities.PlayerDesc.Player;
import Game.gameLogic.gameManager.GAME_StateManager;
import Game.gameUI.Inventory.PANEL_inventory;
import Game.menuUI.settings.Buttons.BUTTON_menu;

import javax.swing.*;
import java.awt.*;

public class PANEL_game extends JPanel {
    private int GAME_WIDTH;
    private int GAME_HEIGHT;
    private GAME_StateManager gameStateManager;
    private Player player;

    private Image background = new ImageIcon("assets/BackgroundImg/GameBg.png").getImage();

    private BUTTON_menu buttonMenu =  new BUTTON_menu();
    private PANEL_inventory panel_inventory;

    public PANEL_game(int GAME_WIDTH, int GAME_HEIGHT) {
        this.GAME_WIDTH = GAME_WIDTH;
        this.GAME_HEIGHT = GAME_HEIGHT;
        panel_inventory = new PANEL_inventory(GAME_WIDTH-10, 290);
        this.setBackground(Color.green);
        this.setLayout(null);
        addElements();
    }
    private void addElements() {
        buttonMenu.setBounds(5,5,87,80);
        panel_inventory.setBounds(0,GAME_HEIGHT-300,GAME_WIDTH+10,GAME_HEIGHT/3+10);
        this.add(buttonMenu);
        this.add(panel_inventory);
    }
    public void setGameStateManager(GAME_StateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
        buttonMenu.setGameStateManager(gameStateManager);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0,GAME_WIDTH,GAME_HEIGHT, this);
    }
    public void setPlayer(Player player) {
        this.player = player;
        panel_inventory.setPlayer(player);
    }
}
