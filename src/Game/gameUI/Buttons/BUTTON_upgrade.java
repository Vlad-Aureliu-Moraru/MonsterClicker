package Game.gameUI.Buttons;

import Game.menuUI.BUTTON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BUTTON_upgrade extends BUTTON {
    private boolean clicked = false;
    private Timer animationTimer;

    public BUTTON_upgrade() {
        super("assets/ButtonSprites/UpgradeWeaponButton.png");
        this.setSpriteDetails(80,40,0,0,0,10);
        setUsingSprite(getSprites().get(0));
//        this.setBackground(Color.red);
        this.addAction();
        initAnimTimer();
    }
    private void addAction(){
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!clicked && !animationTimer.isRunning()) {
                    clicked = true;
                    setUsingSprite(getSprites().get(1));
                    update();
                    animationTimer.start();
                }
            }
        });
    }
    private void initAnimTimer(){
        animationTimer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (clicked) {
                    setUsingSprite(getSprites().get(0));
                    update();
                }
                clicked = false;
                animationTimer.stop();
            }
        });

    }
}
