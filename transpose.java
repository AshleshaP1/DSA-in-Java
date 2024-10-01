package TwoDimensionalArray;
public class transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int m = arr.length;
        int n = arr[0].length;
        int[][] transpose = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                transpose[j][i] = arr[i][j];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
