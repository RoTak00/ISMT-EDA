public class ColorOperations 
{
    public static Color getRed(Color c)
    {
        return new Color(c.red, 0, 0);
    }

    public static Color getGreen(Color c)
    {
        return new Color(0, c.green, 0);
    }

    public static Color getBlue(Color c)
    {
        return new Color(0, 0, c.blue);
    }

    public static Color toGray(Color c)
    {
        double lum = 0.299 * c.red + 0.587 * c.green + 0.114 * c.blue;
        int gray = (int) Math.round(lum);
        return new Color(gray, gray, gray);
    }

    public static String toString(Color c) {
        return "(" + c.red + ":" + c.green + ":" + c.blue + ")";
    }
}