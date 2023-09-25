
public class TestColor 
{
    public static void main(String[] args)
    {
        Color c = new Color(119, 23, 37);
        Color c1 = ColorOperations.getRed(c);
        System.out.println(ColorOperations.toString(c1));
        Color c2 = ColorOperations.getGreen(c);
        System.out.println(ColorOperations.toString(c2));
        Color c3 = ColorOperations.getBlue(c);
        System.out.println(ColorOperations.toString(c3));
        Color c4 = ColorOperations.toGray(c);
        System.out.println(ColorOperations.toString(c4));

    }
}