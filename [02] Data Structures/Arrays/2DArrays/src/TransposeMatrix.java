//only for square matrix;
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = transpose(matrix);
        System.out.println("Transposed Matrix:");
        for (int[] result1 : result) {
            for (int j = 0; j < result1.length; j++) {
                System.out.print(result1[j] + " ");
            }
            System.out.println();
        }
    }


    static int[][] transpose(int matrix[][]) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <i; j++) {
                swap(matrix, i, j);
            }
        }
        return matrix;
    }
    static void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
