public class ComplexOperations
{
    public static Complex add(Complex c1, Complex c2)
    {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    public static Complex subtract(Complex c1, Complex c2)
    {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    public static Complex multiply(Complex c1, Complex c2)
    {
        return new Complex(c1.real * c2.real - c1.imaginary * c2.imaginary, c1.real * c2.imaginary + c1.imaginary * c2.real);
    }

    public static Complex conjugate(Complex c)
    {
        return new Complex(c.real, -c.imaginary);
    }

    public static double magnitude(Complex c)
    {
        return Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);
    }

    public static Complex normalize(Complex c)
    {
        return new Complex(c.real / magnitude(c), c.imaginary / magnitude(c));
    }

}