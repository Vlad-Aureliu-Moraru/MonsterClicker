import Game.UI.FRAME_main;
import Game.gameLogic.SCREEN_resolution.SCREEN_resolution_reader;
import Game.gameLogic.gameManager.GAME_StateManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GAME_StateManager GAME_StateManager = new GAME_StateManager();
        GAME_StateManager.START_GAME();
    }
}