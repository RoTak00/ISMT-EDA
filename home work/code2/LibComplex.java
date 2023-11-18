import java.lang.Math;

public class LibComplex {
    
    public static Complex minus(Complex z) {
	return new Complex(-z.x, -z.y);
    }
    
    public static Complex conjugate(Complex z) {
	return new Complex(z.x, -z.y);
    }
    
    public static Complex add(Complex z1, Complex z2) {
	return new Complex(z1.x + z2.x, z1.y + z2.y);
    }
    
    public static Complex sub(Complex z1, Complex z2) {
	return new Complex(z1.x - z2.x, z1.y - z2.y);
    }
    
    public static Complex mul(Complex z1, Complex z2) {
	return new Complex(z1.x * z2.x - z1.y * z2.y, 
			   z1.x * z2.y + z1.y * z2.x); 
    }
    
    public static Complex div(Complex z1, Complex z2) {
	double d = z2.x * z2.x + z2.y * z2.y;
	if ( d == 0 ) 
	    throw new RuntimeException("Complex: div: division by zero");
	return new Complex((z1.x * z2.x + z1.y * z2.y) / d, 
			   (z1.y * z2.x - z1.x * z2.y) / d);  
    }
    
    public static double abs(Complex z) {
	return Math.sqrt(z.x * z.x + z.y * z.y); 
    }
    
    public static double arg(Complex z) {
	return Math.atan2 (z.y, z.x); 
    }
    
    public static String toString(Complex z) {
	return z.x + "+" + z.y + "i";
    }
}
