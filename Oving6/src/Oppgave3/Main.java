package Oppgave3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] values1 = {{1,2,3}, {4,5,6}};
        int[][] values2 = {{7,8,9}, {10,11,12}};
        int[][] values3 = {{10, 11}, {20, 21}, {30, 31}};

        Matrix matrix1 = new Matrix(values1);
        Matrix matrix2 = new Matrix(values2);
        Matrix matrix3 = new Matrix(values3);

        Matrix matrix4 = matrix1.add(matrix2);
        System.out.println(Arrays.deepToString(matrix4.getMatrix()));

        Matrix matrix5 = matrix1.multiply(matrix3);
        System.out.println(Arrays.deepToString(matrix5.getMatrix()));

        Matrix matrix6 = matrix1.transpose();
        System.out.println(Arrays.deepToString(matrix6.getMatrix()));
    }
}
