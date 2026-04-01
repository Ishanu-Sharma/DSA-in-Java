import java.util.*;
public class MatrixMultiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[n][l];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<l; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[m][l];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}