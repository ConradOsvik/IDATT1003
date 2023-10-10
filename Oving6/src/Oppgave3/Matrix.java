package Oppgave3;

public final class Matrix {
    private final int[][] matrix;

    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }

    private static int[][] clone2DArray(int[][] original){
        int[][] clone = new int[original.length][original[0].length];

        for(int i = 0; i < original.length; i++){
            clone[i] = original[i].clone();
        }

        return clone;
    }

    public int[][] getMatrix(){
        return clone2DArray(this.matrix);
    }

    public Matrix add(Matrix matrix) throws IllegalArgumentException{
        int[][] newMatrix = matrix.getMatrix();
        int[][] finalMatrix = new int[this.matrix.length][this.matrix[0].length];

        if(this.matrix.length != newMatrix.length) throw new IllegalArgumentException("Matrices must have same number of rows");

        for(int i = 0; i < this.matrix.length; i++){
            if (this.matrix[0].length != newMatrix[i].length)
                throw new IllegalArgumentException("Matrices must have same number of columns");
            for(int j = 0; j < this.matrix[i].length; j++){
                finalMatrix[i][j] = this.matrix[i][j] + newMatrix[i][j];
            }
        }

        return new Matrix(finalMatrix);
    }

    public Matrix multiply(Matrix matrix) throws IllegalArgumentException{
        int[][] newMatrix = matrix.getMatrix();
        int[][] finalMatrix = new int[this.matrix.length][newMatrix[0].length];

        if(this.matrix.length != newMatrix[0].length) throw new IllegalArgumentException("The rows in the first matrix and the columns in the second matrix are not of same length, MxP & PxN is needed to define a product");

        for(int m = 0; m < this.matrix.length; m++){
            for(int n = 0; n < newMatrix[0].length; n++){
                for(int p = 0; p < this.matrix[0].length; p++){
                    finalMatrix[m][n] += this.matrix[m][p] * newMatrix[p][n];
                }
            }
        }

        return new Matrix(finalMatrix);
    }

    public Matrix transpose(){
        int[][] finalMatrix = new int[this.matrix[0].length][this.matrix.length];

        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                finalMatrix[j][i] = this.matrix[i][j];
            }
        }

        return new Matrix(finalMatrix);
    }
}
