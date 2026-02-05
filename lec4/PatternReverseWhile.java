import java.util.Scanner;
public class PatternReverseWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while(i<=x){
            int j = i;
            while(j<=x){
                System.out.print(" * ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}