package Game.gameLogic.gameManager;

import Game.UI.FRAME_main;
import Game.gameLogic.SCREEN_resolution.SCREEN_resolution_reader;

public class GAME_StateManager {
    private  SCREEN_resolution_reader SCREEN_resolution_reader = new SCREEN_resolution_reader();
    private boolean inGame = false;
    private boolean inSettings = false;
    private boolean inMenu = true;
    public GAME_StateManager() {
        SCREEN_resolution_reader.writeToGameFile();
    }
    public void START_GAME(){
        FRAME_main frameMain = new FRAME_main();
        frameMain.getPanelMainmenu().setGameStateManager(this);
    }
    public void STATE_PLAYING(){
        if(!inGame){
            inGame = true;
            inMenu = false;
            System.out.println("STATE PLAYING");
        }else{
            System.out.println("ALREADY STATE PLAYING");
        }

    }
}
