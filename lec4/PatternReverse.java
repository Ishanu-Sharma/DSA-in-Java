import java.util.Scanner;
public class PatternReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            for(int j = i; j<=x; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}