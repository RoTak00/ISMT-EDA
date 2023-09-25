public class ComplexMain 
{
    public static void main (String[] args)
    {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex c3 = ComplexOperations.add(c1, c2);
        System.out.println(c3.toString());

        Complex c4 = ComplexOperations.multiply(c1, c2);
        System.out.println(c4.toString());

        
    }
}