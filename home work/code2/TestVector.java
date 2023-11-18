public class TestVector {
    public static void main( String[] args ) {
	Vector u1 = new Vector ( -2.1,  5.6, 3.3);
	Vector u2 = new Vector (  9.7,  1.1, 2.7);
	Vector u3 = new Vector (-12.1, -7.6, 5.1);

	Vector u4 = LibVector.add(u1, u2);
	Vector u5 = LibVector.sub(u1, u2);
	Vector u6 = LibVector.scale(2.6, LibVector.minus(u3));

	Vector u7 = new Vector (1.0, 0.0, 0.0);
	Vector u8 = new Vector (0.0, 1.0, 0.0);
	Vector u9 = LibVector.crossProduct(u7, u8);

	System.out.println(LibVector.toString(u4) + "\n" + 
			   LibVector.toString(u5) + "\n" + 
			   LibVector.toString(u6) + "\n" +
			   LibVector.toString(u9));
    }
}
