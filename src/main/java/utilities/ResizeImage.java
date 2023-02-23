package utilities;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ResizeImage {

    public void resizeImage(String path) throws Exception {
        BufferedImage img = ImageIO.read(new File(path));
        int newWidth = (int) (img.getWidth() * .3); // Reducing the image size to 30% of the original
        int newHeight = (int) (img.getHeight() * .3);
        img = Scalr.resize(img, newWidth, newHeight);
        File outputFile = new File(path);
        ImageIO.write(img, "png", outputFile); // Write the Buffered Image into the same location of the input file.
    }
}
