import java.util.*;
public class max{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    int max = 0;
    if(a>b){
        max = a;
        System.out.println("Max is: " + max);
    }
    else{
        max = b;
        System.out.println("Max is: " + max);
    }
}
}