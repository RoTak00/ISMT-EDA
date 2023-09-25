

public class VectorMain
{
    public static void main(String[] args)
    {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        Vector v3 = VectorOperations.subtract(v1, v2);

        System.out.println(VectorOperations.toString(v3));

        System.out.println(VectorOperations.dotProduct(v1, v2));

        System.out.println(VectorOperations.toString(VectorOperations.crossProduct(v1, v2)));


    }
}