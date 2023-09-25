public class Complex 
{
    final double real;
    final double imaginary;

    public Complex(double _real, double _imaginary)
    {
        real = _real;
        imaginary = _imaginary;
    }

    public String toString()
    {
        return real + " + " + imaginary + "i";
    }
}