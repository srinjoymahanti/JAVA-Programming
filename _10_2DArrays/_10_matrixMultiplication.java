package _10_2DArrays;

public class _10_matrixMultiplication {
    public static void main(String[] args) {
        int[][] a={{1,2,6},{8,1,5}};
        int[][] b={{1,2,6,7},{1,8,1,5},{0,4,6,1}};
        int[][] c=new int[a.length][b[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
