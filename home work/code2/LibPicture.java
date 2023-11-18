import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class LibPicture {

  public static Color getColor(Picture p, int i, int j) {
    if (i < 0 || i >= p.width || j < 0 || j >= p.height) {
      return new Color(0, 0, 0);
    }
    return p.pixels[i][j];
  }

  public static void setColor(Picture p, int i, int j, Color c) {
    p.pixels[i][j] = c;
  }

  public static Picture flipVertical(Picture p) {
    Picture q = new Picture(p.width, p.height);
    for (int i = 0; i < p.width; i++) for (
      int j = 0;
      j < p.height;
      j++
    ) setColor(q, i, p.height - j - 1, getColor(p, i, j));
    return q;
  }

  public static Picture flipHorizontal(Picture p) {
    Picture q = new Picture(p.width, p.height);
    for (int i = 0; i < p.width; i++) for (
      int j = 0;
      j < p.height;
      j++
    ) setColor(q, p.width - i - 1, j, getColor(p, i, j));
    return q;
  }

  public static Picture redComponent(Picture p) {
    Picture q = new Picture(p.width, p.height);
    for (int i = 0; i < p.width; i++) for (int j = 0; j < p.height; j++) {
      Color c = getColor(p, i, j);
      setColor(q, i, j, LibColor.getRed(c));
    }
    return q;
  }

  public static Picture greyScale(Picture p) {
    Picture q = new Picture(p.width, p.height);
    for (int i = 0; i < p.width; i++) for (int j = 0; j < p.height; j++) {
      Color c = getColor(p, i, j);
      setColor(q, i, j, LibColor.toGray(c));
    }
    return q;
  }

  public static Picture toInverse(Picture p) {
    Picture q = new Picture(p.width, p.height);
    for (int i = 0; i < p.width; i++) for (
      int j = 0;
      j < p.height;
      j++
    ) setColor(q, i, j, LibColor.toInverse(getColor(p, i, j)));
    return q;
  }

  public static Picture toBlur(Picture p, int range) {
    Picture q = new Picture(p.width, p.height);
    float outerWeights = (0.5f) / (((2 * range + 1) * (2 * range + 1)) - 1);
    for (int i = 0; i < p.width; ++i) {
      for (int j = 0; j < p.height; ++j) {
        Color newColor = LibColor.Scale(getColor(p, i, j), 0.5f);
        for (int x = i - range; x <= i + range; ++x) for (
          int y = j - range;
          y <= j + range;
          ++y
        ) {
          if (x == i && y == j) continue;
          Color c = getColor(p, x, y);
          c = LibColor.Scale(c, outerWeights);
          newColor = LibColor.Add(c, newColor);
        }

        setColor(q, i, j, newColor);
      }
    }

    return q;
  }

  public static Picture toBlur2(Picture p, int range) {
    Picture q = new Picture(p.width, p.height);

    float num = (2 * range + 1) * (2 * range + 1);

    for (int i = 0; i < p.width; ++i) {
      for (int j = 0; j < p.height; ++j) {
        int r = 0;
        int g = 0;
        int b = 0;

        for (int x = i - range; x <= i + range; ++x) for (
          int y = j - range;
          y <= j + range;
          ++y
        ) {
          r += getColor(p, x, y).red;
          g += getColor(p, x, y).green;
          b += getColor(p, x, y).blue;
        }

        r /= num;
        g /= num;
        b /= num;

        Color c = new Color(r, g, b);

        setColor(q, i, j, c);
      }
    }

    return q;
  }

  public static Picture edgeDetect(Picture p) {
    Picture q = new Picture(p.width, p.height);

    for (int i = 0; i < p.width; ++i) {
      for (int j = 0; j < p.height; ++j) {
        int r = getColor(p, i, j).red * 9;
        int g = getColor(p, i, j).green * 9;
        int b = getColor(p, i, j).blue * 9;

        int index = 0;
        for (int x = i - 1; x <= i + 1; ++x) for (
          int y = j - 1;
          y <= j + 1;
          ++y
        ) {
          r -= getColor(p, x, y).red;
          g -= getColor(p, x, y).green;
          b -= getColor(p, x, y).blue;
        }
        if (r < 0) r = 0;
        if (g < 0) g = 0;
        if (b < 0) b = 0;

        if (r > 255) r = 255;
        if (g > 255) g = 255;
        if (b > 255) b = 255;

        Color c = new Color(r, g, b);

        setColor(q, i, j, c);
      }
    }
    return q;
  }

  // ----------------------------------------------------
  // Loading and saving a PNG file
  // ----------------------------------------------------

  public static Picture load(String filename) {
    BufferedImage image = null;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      System.out.println(e);
    }
    int width = image.getWidth();
    int height = image.getHeight();
    Picture p = new Picture(width, height);
    for (int i = 0; i < width; i++) for (int j = 0; j < height; j++) {
      int rgb = image.getRGB(i, j);
      int blue = rgb & 0xff;
      int green = (rgb & 0xff00) >> 8;
      int red = (rgb & 0xff0000) >> 16;
      p.pixels[i][j] = new Color(red, green, blue);
    }
    return p;
  }

  public static void save(Picture p, String filename) {
    BufferedImage buffer = new BufferedImage(
      p.width,
      p.height,
      BufferedImage.TYPE_INT_ARGB
    );
    for (int i = 0; i < p.width; i++) for (int j = 0; j < p.height; j++) {
      Color c = p.pixels[i][j];
      int red = (c.red << 16) & 0x00FF0000;
      int green = (c.green << 8) & 0x0000FF00;
      int blue = c.blue & 0x000000FF;
      buffer.setRGB(i, j, 0xFF000000 | red | green | blue);
    }
    try {
      ImageIO.write(buffer, "png", new File(filename));
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  // ----------------------------------------------------

  public static String toString(Picture p) {
    return p.width + "x" + p.height + " RGB image";
  }
}
