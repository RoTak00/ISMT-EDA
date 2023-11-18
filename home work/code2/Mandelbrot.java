import java.lang.Math;

public class Mandelbrot {
    static final double xCenter = -0.70;
    static final double yCenter =  0.0;
    static final double width   =  2.6;
    static final int    picSize =  1024; 
    static final int    maxIter =  255;

    public static int iterate(Complex c, int maxIter) {
	Complex z = c;
	for (int i = 0; i < maxIter; i++) {
	    if (LibComplex.abs(z) > 2.0) 
		return i;
	    z = LibComplex.add(LibComplex.mul(z,z),c);
	}
	return maxIter;
    }

    public static Color pickColor(int k) { 
	return new Color(maxIter - k, maxIter - k, maxIter - k);
    }

    public static void main(String[] args)  {
	Picture p = new Picture(picSize, picSize);
	for (int i = 0; i < picSize; i++) 
	    for (int j = 0; j < picSize; j++) {
		double x  = xCenter - width / 2 + width * i / picSize;
		double y  = yCenter - width / 2 + width * j / picSize;
		int k = iterate(new Complex(x, y), maxIter); 
		LibPicture.setColor(p, i, picSize - 1 - j, pickColor(k));
	    }
	LibPicture.save(p, "./mandelbrot.png");
    }
}
