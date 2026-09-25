package CSE2;

public class matrix_code {

    public static void main(String[] args) {

        int n = 3;
        int[][] matrix = new int[n][n];

        // Store values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
