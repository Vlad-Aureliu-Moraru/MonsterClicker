package Game.UI.settings;

import javax.swing.*;
import java.awt.*;

public class PANEL_settings extends JPanel {
   private int GAME_WIDTH;
   private int GAME_HEIGHT;
    private Image background = new ImageIcon("assets/BackgroundImg/SettingsBg.png").getImage();
    public PANEL_settings(int GAMEWIDTH, int GAMEHEIGHT) {
        this.GAME_WIDTH = GAMEWIDTH;
        this.GAME_HEIGHT = GAMEHEIGHT;
        this.setBackground(Color.RED);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0,GAME_WIDTH,GAME_HEIGHT, this);
    }
}
