import java.util.*;
public class MaxProduct100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int i = 0;
        int j = 0;
        int product = 1;
        int ans = 0;
        while(j < n){
            product *= arr[j];
            while(product >= k && i <= j){
                product /= arr[i];
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        System.out.println(ans);
    }
}