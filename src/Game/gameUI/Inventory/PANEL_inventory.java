package Game.gameUI.Inventory;

import Game.gameUI.Buttons.BUTTON_upgrade;

import javax.swing.*;
import java.awt.*;

public class PANEL_inventory extends JPanel {
    private Image background =  new ImageIcon("assets/Backgrounds/Inventory.png").getImage();
    private int GAME_WIDTH;
    private int GAME_HEIGHT;

    private BUTTON_upgrade upgrade =  new BUTTON_upgrade();
    public PANEL_inventory( int GAME_WIDTH, int GAME_HEIGHT) {
        this.GAME_WIDTH = GAME_WIDTH;
        this.GAME_HEIGHT = GAME_HEIGHT;
        this.setOpaque(false);
        this.setLayout(null);

        upgrade.setBounds(GAME_WIDTH/12,GAME_HEIGHT/2+50,140,70);
        this.add(upgrade);
    }
    private void addElements(){

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0,GAME_WIDTH,GAME_HEIGHT, this);
    }
}
