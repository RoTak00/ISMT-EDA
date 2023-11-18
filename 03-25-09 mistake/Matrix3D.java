import java.util.Random;

public class Matrix3D {
    int[][][] data;
    int xSize, ySize, zSize;

    // Initialize a 3D matrix with dimensions and zeros
    public Matrix3D(int xSize, int ySize, int zSize) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.zSize = zSize;
        this.data = new int[xSize][ySize][zSize];
    }

    // Initialize a 3D matrix with an existing 3D array
    public Matrix3D(int[][][] data) {
        this.data = data;
        this.xSize = data.length;
        this.ySize = data[0].length;
        this.zSize = data[0][0].length;
    }

    // Initialize a Cubic 3D Matrix
    public Matrix3D(int dim)
    {
        this.xSize = dim;
        this.ySize = dim;
        this.zSize = dim;

        this.data = new int[xSize][ySize][zSize];
    }

    // Initialize the 3D matrix with random numbers between 0 and 9
    public void fillRandom() {
        Random rand = new Random();
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    this.data[i][j][k] = rand.nextInt(10);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < xSize; i++) {
            sb.append("Layer ").append(i + 1).append(":\n");
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    sb.append(data[i][j][k]).append(" ");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

