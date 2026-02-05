import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int P = sc.nextInt();
        System.out.println("Enter Rate: ");
        int R = sc.nextInt();
        System.out.println("Enter Time: ");
        int T = sc.nextInt();
        int SI = (P*R*T)/100;
        System.out.println("The Simple Interest is: " + SI);
    }
}