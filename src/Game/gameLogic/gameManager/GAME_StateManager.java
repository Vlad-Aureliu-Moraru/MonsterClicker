package Game.gameLogic.gameManager;

import Game.menuUI.FRAME_main;
import Game.gameLogic.SCREEN_resolution.SCREEN_resolution_reader;

public class GAME_StateManager {
    private  SCREEN_resolution_reader SCREEN_resolution_reader = new SCREEN_resolution_reader();
    private boolean inGame = false;
    private boolean inSettings = false;
    private boolean inMenu = true;
    private FRAME_main frameMain;
    public GAME_StateManager() {
        SCREEN_resolution_reader.writeToGameFile();
    }
    public void START_GAME(){
        frameMain = new FRAME_main();
        frameMain.getPanelMainmenu().setGameStateManager(this);
        frameMain.getPanelsettings().setGameStateManager(this);
        frameMain.getPanelgame().setGameStateManager(this);
    }
    public void STATE_PLAYING(){
        if(!inGame){
            inGame = true;
            inMenu = false;
            System.out.println("STATE PLAYING");
            frameMain.loadGame();
        }else{
            System.out.println("ALREADY STATE PLAYING");
        }
    }
    public void STATE_SETTINGS(){
        if(!inSettings){
            inSettings = true;
            inMenu = false;
            inGame = false;
            System.out.println("STATE SETTINGS");
            frameMain.openSettings();
            frameMain.revalidate();
            frameMain.repaint();
        }else {
            System.out.println("ALREADY STATE SETTINGS");
        }
    }
    public void STATE_MENU(){
        if(!inMenu){
            inMenu = true;
            inGame = false;
            inSettings = false;
            System.out.println("STATE MENU");
            frameMain.loadMainMenu();
        }else  {
            System.out.println("ALREADY STATE MENU");
        }
    }
    public void STATE_EXIT(){
        frameMain.dispose();
    }

}
