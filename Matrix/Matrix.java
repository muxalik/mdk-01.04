public class Matrix {
    int columns;
    int lines;
    double[][] matrixA = new double[this.lines][this.columns];

    public Matrix(double[][] matrix, int columns, int lines) {
        this.matrixA = matrix;
        this.columns = columns;
        this.lines = lines;
    }

    public void print() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixA[i][j] + " ");
            }

            System.out.print("\n");
        }
    }

    public void sum(double[][] matrixA, double[][] matrixB) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
            }

            System.out.print("\n");
        }
    }

    public void multiplication(double[][] matrixA, double number) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixA[i][j] * number + " ");
            }

            System.out.print("\n");
        }
    }

    public void multiply(double[][] matrixA, double[][] matrixB) {
        double[][] result = new double[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                for (int a = 0; a < lines; a++) {
                    result[i][j] += matrixA[i][a] * matrixB[a][j];
                }
            }
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            
            System.out.print("\n");
        }
    }
}