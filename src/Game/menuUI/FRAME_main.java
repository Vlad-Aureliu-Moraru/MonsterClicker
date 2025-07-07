package Game.menuUI;

import Game.gameUI.PANEL_game;
import Game.menuUI.mainMenu.PANEL_mainmenu;
import Game.menuUI.settings.PANEL_settings;
import Game.gameLogic.SCREEN_resolution.SCREEN_resolution_reader;

import javax.swing.*;
import java.awt.*;

public class FRAME_main extends JFrame {

    // --- Fields ---
    private PANEL_mainmenu panelMainmenu;
    private PANEL_settings panelsettings;
    private PANEL_game panelgame;
    private CardLayout cardLayout;
    private JPanel mainPanel; // This panel will use CardLayout

    public FRAME_main() {
        SCREEN_resolution_reader screen_resolution = new SCREEN_resolution_reader();
        int[] resolution = screen_resolution.readFromGameFile();
        int SCREEN_WIDTH = resolution[0];
        int SCREEN_HEIGHT = resolution[1];
        int GAME_WIDTH = SCREEN_WIDTH /2;
        int GAME_HEIGHT = SCREEN_HEIGHT - 150;

        setTitle("Monster Clicker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(GAME_WIDTH, GAME_HEIGHT);
        setResizable(false);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        panelMainmenu = new PANEL_mainmenu(GAME_WIDTH, GAME_HEIGHT);
        panelsettings = new PANEL_settings(GAME_WIDTH, GAME_HEIGHT);
        panelgame = new PANEL_game(GAME_WIDTH, GAME_HEIGHT);

        mainPanel.add(panelMainmenu, "MAINMENU");
        mainPanel.add(panelsettings, "SETTINGS");
        mainPanel.add(panelgame, "GAME");

        this.add(mainPanel);

        cardLayout.show(mainPanel, "MAINMENU");

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void openSettings() {
        cardLayout.show(mainPanel, "SETTINGS");
    }

    public void loadMainMenu() {
        cardLayout.show(mainPanel, "MAINMENU");
    }
    public void loadGame() {
        cardLayout.show(mainPanel, "GAME");
    }
   public void clearFrame(){
        this.removeAll();
    }
    public PANEL_mainmenu getPanelMainmenu() {
        return panelMainmenu;
    }
    public PANEL_settings getPanelsettings() {
        return panelsettings;
    }
    public PANEL_game getPanelgame() {
        return panelgame;
    }
}