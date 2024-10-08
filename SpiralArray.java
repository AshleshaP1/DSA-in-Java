package TwoDimensionalArray;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3,4, 5}, { 6 ,7, 8, 9,10}, {11,12,13,14,15  }};
        int m = arr.length;
        int n = arr[0].length;
        int min_row = 0, min_col = 0;
        int max_row = m - 1, max_col = n - 1;
        while (min_row <= max_row && min_col <= max_col) {
            for (int j = min_col; j <= max_col; j++) {
                System.out.print(arr[min_row][j]+" ");

            }
            min_row++;
            if (min_row > max_row || min_col > max_col)
                break;
            for (int i = min_row; i <= max_row; i++) {
                System.out.print(arr[i][max_col]+" ");

            }
            max_col--;
            if (min_row > max_row || min_col > max_col)
                break;
            for (int j = max_col; j >= min_col; j--) {
                System.out.print(arr[max_row][j]+" ");

            }
            max_row--;
            if (min_row > max_row || min_col > max_col)
                break;
            for (int i = max_row; i >= min_row; i--) {
                System.out.print(arr[i][min_col]+" ");

            }
            min_col++;
        }
    }
}
