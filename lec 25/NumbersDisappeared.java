import java.util.*;
public class NumbersDisappeared{
    public static int[] disappeared(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        Arrays.sort(arr);
        int k = 0;
        int i = 1;
        int j = 0;
        while(j<n && i<=n){
            
                if(arr[j] == i){
                    i++;
                    j++;
                }
                else if(arr[j] < i){
                    j++;
                }
                else{
                    newArr[k] = i;
                    i++;
                    k++;
                }
            }
            while(i<=n){
                newArr[k] = i;
                    i++;
                    k++;
            }
        
        return newArr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = disappeared(arr);
        for(int i = 0; i<result.length; i++){
            if(result[i] != 0)
            System.out.print(result[i] + " ");
        }
    }
}