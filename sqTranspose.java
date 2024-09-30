package TwoDimensionalArray;
public class sqTranspose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
