
public class VectorOperations
{
    public static  Vector negative(Vector v)
    {
        return new Vector(-v.x, -v.y, -v.z);
    }

    public static Vector add(Vector v1, Vector v2)
    {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector subtract(Vector v1, Vector v2)
    {
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static double dotProduct(Vector v1, Vector v2)
    {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    public static Vector crossProduct(Vector v1, Vector v2)
    {
        return new Vector(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
    }

    public static double magnitude(Vector v)
    {
        return Math.sqrt(v.x * v.x + v.y * v.y + v.z * v.z);
    }

    public static Vector normalize(Vector v)
    {
        return new Vector(v.x / magnitude(v), v.y / magnitude(v), v.z / magnitude(v));
    }

    public static Vector multiply(Vector v, double scalar)
    {
        return new Vector(v.x * scalar, v.y * scalar, v.z * scalar);
    }

    public static Vector print(Vector v)
    {
        System.out.println(v.x + " " + v.y + " " + v.z);
        return v;
    }

    public static String toString(Vector v)
    {
        return "[" + v.x + ", " + v.y + ", " + v.z + "]";
    }
}
