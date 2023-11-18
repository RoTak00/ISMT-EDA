public class LibVector {
    
    public static Vector minus(Vector u) {
	return new Vector(-u.x, -u.y, -u.z);
    }
    
    public static Vector add(Vector u, Vector v) {
	return new Vector( u.x + v.x, u.y + v.y, u.z + v.z );
    }
    
    public static Vector sub(Vector u, Vector v) {
	return new Vector( u.x - v.x, u.y - v.y, u.z - v.z );
    }
    
    public static Vector scale(double s, Vector u) {
	return new Vector( s * u.x, s * u.y, s * u.z );
    }
    
    public static double scalarProduct(Vector u, Vector v) {
	return u.x * v.x + u.y * v.y + u.z * v.z;
    }
    
    public static double norm(Vector u) {
	return java.lang.Math.sqrt(scalarProduct(u,u));
    }
    
    public static Vector crossProduct(Vector u, Vector v) {
	return new Vector( u.y * v.z - u.z * v.y, 
			   u.z * v.x - u.x * v.z, 
			   u.x * v.y - u.y * v.x );
    }
    
    public static String toString(Vector v) {
	return "(" + v.x + "," + v.y + "," + v.z + ")";
    }
}
