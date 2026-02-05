import java.util.Scanner;
public class StraightLine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextDouble();
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if(m1 == m2){
            System.out.println("It is a Straight Line");
        }
        else
        System.out.println("Not a Straight Line");
    }
}