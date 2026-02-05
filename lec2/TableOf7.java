import java.util.Scanner;
public class TableOf7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number needed in table: ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int result = 7*i;
            System.out.println("7 x " + i + " = " + result);
        }
    }
}