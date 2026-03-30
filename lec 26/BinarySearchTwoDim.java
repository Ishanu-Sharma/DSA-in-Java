import java.util.*;
public class BinarySearchTwoDim{
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
            int i = 0; // or n-1
            int j = n-1; // or 0

            while(i<m && j>=0){ // or i>=0 && j<n
                if(arr[i][j] == target){
                    System.out.println("Target found at index: " + i + " " + j);
                    count++;
                    break;
                }
                else if(arr[i][j]  > target){
                    j--; // i-- if i = n-1
                }
                else{
                    i++; // j++ if j = 0
                }
                
            }
            if(count <= 0)
            System.out.println("Target is not present in the array");
        }
    }