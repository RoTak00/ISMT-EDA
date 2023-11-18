public class LibMatrix3D {
    public static Matrix3D add(Matrix3D m1, Matrix3D m2) {
        if (m1.xSize != m2.xSize || m1.ySize != m2.ySize || m1.zSize != m2.zSize) {
            System.out.println("Dimensions do not match for addition.");
            return null;
        }
        
        Matrix3D result = new Matrix3D(m1.xSize, m1.ySize, m1.zSize);
        
        for (int i = 0; i < m1.xSize; i++) {
            for (int j = 0; j < m1.ySize; j++) {
                for (int k = 0; k < m1.zSize; k++) {
                    result.data[i][j][k] = m1.data[i][j][k] + m2.data[i][j][k];
                }
            }
        }
        
        return result;
    }

    public static Matrix3D scalarMultiply(Matrix3D m, int scalar) {
        Matrix3D result = new Matrix3D(m.xSize, m.ySize, m.zSize);
        
        for (int i = 0; i < m.xSize; i++) {
            for (int j = 0; j < m.ySize; j++) {
                for (int k = 0; k < m.zSize; k++) {
                    result.data[i][j][k] = m.data[i][j][k] * scalar;
                }
            }
        }
        
        return result;
    }

     // Display the 3D matrix
    public static void display(Matrix3D m) {
        for (int i = 0; i < m.xSize; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < m.ySize; j++) {
                for (int k = 0; k < m.zSize; k++) {
                    System.out.print(m.data[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

   
}