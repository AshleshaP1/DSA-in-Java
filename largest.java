package TwoDimensionalArray;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = { { 1, 5, 6 }, { 2, -9, 3 }, { 5, 10, 3 } };
        int m = arr.length;
        int n = arr[0].length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx, arr[i][j]);
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Max: "+mx+" Sum: "+sum);
        sc.close();
    }
}
