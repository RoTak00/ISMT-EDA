public class TestComplex {
    public static void main(String[] args) {
	Complex z1 = new Complex(5.0, 6.0);
	System.out.println("z1 = " + LibComplex.toString(z1));

	Complex z2 = new Complex(-2.0, 3.0);
	System.out.println("z2 = " + LibComplex.toString(z2));

	Complex z3 = LibComplex.mul(z1,z2);
	System.out.println("z3 = " + LibComplex.toString(z3));

	Complex z4 = new Complex(0.0,0.0);
	System.out.println("z4 = " + LibComplex.toString(z4));

	Complex z5 = LibComplex.div(z3,z4);
	System.out.println("z5 = " + LibComplex.toString(z5));
    }
}
