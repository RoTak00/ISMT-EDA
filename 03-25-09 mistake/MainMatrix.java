public class MainMatrix {
    public static void main(String[] args) {
        Matrix3D matrix = new Matrix3D(2, 2, 2);
        matrix.fillRandom();
        System.out.println("Matrix as a string:");
        System.out.println(matrix.toString());
    }
}