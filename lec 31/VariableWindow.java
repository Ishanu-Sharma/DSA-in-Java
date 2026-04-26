import java.util.*;
public class VariableWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int given_sum = sc.nextInt();
        int sum = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        while(j<n){
            sum += arr[j];
            if(sum < given_sum){
                j++;
            }
            else {
                while(sum > given_sum){
                    sum -= arr[i];
                    i++;
                }
                ans = Math.max(ans, j-i+1);
                j++;
            }
        }
        System.out.println(ans);
    }
}
