package at.spengergasse;

public class Matrix {
    private int[][] array;

    public Matrix(int[][] array) {
        this.array = array;
    }

    public int getRows() {
        return array.length;
    }

    public int getCols() {
        return array[0].length;
    }

    public Matrix multiply(Matrix other) {
        // Spalten der ersten == Zeilen der zweiten
        if (this.getCols() != other.getRows()) {
            throw new IllegalArgumentException("Matrixgrößen passen nicht zusammen");
        }

        // Ergebnis: Zeilen von this, Spalten von other
        int[][] result = new int[this.getRows()][other.getCols()];

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < other.getCols(); j++) {
                for (int k = 0; k < this.getCols(); k++) {
                    result[i][j] += this.array[i][k] * other.array[k][j];
                }
            }
        }

        return new Matrix(result);
    }
}
