package Game.gameLogic.SCREEN_resolution;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SCREEN_resolution_reader {
    private int SCREEN_width;
    private int SCREEN_height;
    private String PATH= "gameinfo/game_resolution.txt";
    private String CONTENT;
    public SCREEN_resolution_reader() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        SCREEN_width = d.width;
        SCREEN_height = d.height;
        System.out.println("width: " + SCREEN_width + " height: " +SCREEN_height);
        CONTENT = SCREEN_width + "x" + SCREEN_height;

    }
    public void writeToGameFile(){
        try {
            Path path = Paths.get(PATH);
            Files.write(path, CONTENT.getBytes());
            System.out.println("Written to " + PATH);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int[] readFromGameFile(){
        try {
            Path path = Paths.get(PATH);
            String content = Files.readString(path);
            String[]  info= content.split("x");
            int x = Integer.parseInt(info[0]);
            int y = Integer.parseInt(info[1]);
            System.out.println("x: " + x + " y: " + y);
            return new int[]{x,y};

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
