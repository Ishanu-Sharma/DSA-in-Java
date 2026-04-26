import java.util.*;
public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int product = 1;
        int i = 0, j = 0;
        int ans = Integer.MIN_VALUE;
        while(j < n){
            product *= arr[j];
            if(j - i + 1 == k){
                ans = Math.max(ans, product);
                product /= arr[i];
                i++;
            }
            j++;
        }
        System.out.println(ans);
    }
}