import java.lang.Math;

public class LibColor {

  public static Color getRed(Color c) {
    return new Color(c.red, 0, 0);
  }

  public static Color getGreen(Color c) {
    return new Color(0, c.green, 0);
  }

  public static Color getBlue(Color c) {
    return new Color(0, 0, c.blue);
  }

  public static Color toGray(Color c) {
    double luminance = 0.299 * c.red + 0.587 * c.green + 0.114 * c.blue;
    int gray = (int) Math.round(luminance);
    return new Color(gray, gray, gray);
  }

  public static Color toInverse(Color c) {
    return new Color(255 - c.red, 255 - c.green, 255 - c.blue);
  }

  public static boolean equals(Color c1, Color c2) {
    return (c1.red == c2.red) && (c1.green == c2.green) && (c1.blue == c2.blue);
  }

  public static String toString(Color c) {
    return "(" + c.red + ":" + c.green + ":" + c.blue + ")";
  }

  public static Color Add(Color c, Color d) {
    return new Color(c.red + d.red, c.green + d.green, c.blue + d.blue);
  }

  public static Color Scale(Color c, float s) {
    return new Color(
      (int) (c.red * s),
      (int) (c.green * s),
      (int) (c.blue * s)
    );
  }
}
