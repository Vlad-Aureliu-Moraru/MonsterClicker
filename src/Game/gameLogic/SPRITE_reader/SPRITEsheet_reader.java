package Game.gameLogic.SPRITE_reader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class SPRITEsheet_reader {
    public SPRITEsheet_reader() {

    }

    public ArrayList<Image> loadSprites(String filePath, int startX, int startY, int spriteWidth, int spriteHeight, int gapX, int gapY) {

        ArrayList<Image> sprites = new ArrayList<>();
        BufferedImage spriteSheet;

        try {
            // 1. Load the main sprite sheet image
            spriteSheet = ImageIO.read(new File(filePath));
        } catch (Exception e) {
            System.err.println("Error loading sprite sheet: " + filePath);
            e.printStackTrace();
            return sprites; // Return the empty list if the file can't be read
        }

        // 2. Loop through the sheet row by row, then column by column
        for (int y = startY; y + spriteHeight <= spriteSheet.getHeight(); y += spriteHeight + gapY) {
            for (int x = startX; x + spriteWidth <= spriteSheet.getWidth(); x += spriteWidth + gapX) {
                // 3. Crop the sub-image (the individual sprite)
                BufferedImage subImage = spriteSheet.getSubimage(x, y, spriteWidth, spriteHeight);

                // 4. Create an ImageIcon from the sub-image and add it to the list
                sprites.add(new ImageIcon(subImage).getImage());
            }
        }

        System.out.println("Loaded " + sprites.size() + " sprites.");
        return sprites;
    }
}