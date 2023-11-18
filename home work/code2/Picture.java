import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Picture {
    // the image dimensions and the pixel matrix
    final int width;
    final int height;
    Color[][] pixels;

    // constructor
    public Picture(int w, int h) {
	width  = w;
	height = h;
	pixels = new Color[width][height];
    }
}
