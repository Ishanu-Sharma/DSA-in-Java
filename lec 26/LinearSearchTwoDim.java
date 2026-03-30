import java.util.*;
public class LinearSearchTwoDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] == target){
                    System.out.println("Target is present in the array at index: " + i + " " + j);
                    count++;
                }
            }
        }
        if(count <= 0)
        System.out.println("Target is not present in the array");
    }
}
