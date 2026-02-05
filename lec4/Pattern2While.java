import java.util.Scanner;
public class Pattern2While{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while(i<=x){
            int j = 1;
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}