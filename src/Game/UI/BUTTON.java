package Game.UI;

import Game.gameLogic.SPRITE_reader.SPRITEsheet_reader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BUTTON extends JLabel {
    private String spriteSheetPath;
    private Image usingSprite;
    private SPRITEsheet_reader spritEsheetReader =  new SPRITEsheet_reader();
    private ArrayList<Image> sprites;
    private Image activeSprite;
    private int spriteWidth;
    private int spriteHeight;
    private int x;
    private int y;
    private int gapX;
    private int gapY;
    public BUTTON(String spriteSheetPath){
        this.spriteSheetPath = spriteSheetPath;
    }
    public void setSpriteDetails(int spriteWidth, int spriteHeight, int x, int y , int gapX, int gapY){
        this.spriteWidth = spriteWidth;
        this.spriteHeight = spriteHeight;
        this.x = x;
        this.y = y;
        this.gapX = gapX;
        this.gapY = gapY;
        sprites = spritEsheetReader.loadSprites(spriteSheetPath,x,y,spriteWidth,spriteHeight,gapX,gapY);
    }
    public ArrayList<Image> getSprites(){
        return sprites;
    }

    public void update(){
        this.repaint();
        this.revalidate();
    }
    protected void  setUsingSprite(Image usingSprite){
        this.usingSprite = usingSprite;
        update();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(usingSprite, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
