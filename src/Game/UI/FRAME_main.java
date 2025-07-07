package Game.UI;

import Game.UI.mainMenu.PANEL_mainmenu;
import Game.gameLogic.SCREEN_resolution.SCREEN_resolution_reader;

import javax.swing.*;

public class FRAME_main  extends JFrame {
    private PANEL_mainmenu panelMainmenu ;
    private SCREEN_resolution_reader screen_resolution =  new SCREEN_resolution_reader();
    private int SCREEN_WIDTH  = screen_resolution.readFromGameFile()[0];
    private int SCREEN_HEIGHT  =  screen_resolution.readFromGameFile()[1];

    private int GAME_WIDTH  = SCREEN_WIDTH/2;
    private int GAME_HEIGHT = SCREEN_HEIGHT-150;

    public FRAME_main() {
        setTitle("Monster Clicker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(GAME_WIDTH,GAME_HEIGHT);
        panelMainmenu = new PANEL_mainmenu(GAME_WIDTH, GAME_HEIGHT);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        loadMainMenu();

    }

    public void clearFrame(){
        this.removeAll();
    }

    public void loadMainMenu() {
        panelMainmenu.setBounds(0,0,GAME_WIDTH,GAME_HEIGHT);
        this.add(panelMainmenu);
    }
    public PANEL_mainmenu getPanelMainmenu() {
        return panelMainmenu;
    }

}
