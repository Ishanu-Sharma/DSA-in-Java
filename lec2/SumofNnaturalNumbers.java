import java.util.Scanner;
public class SumofNnaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=N; i++){
            sum += i;
        }
            System.out.println("Sum of " + N + " natural numbers is: " + sum);
    }
}