import java.util.*;
public class maxofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        int a = sc.nextInt();
        System.out.println("Enter second no.: ");
        int b = sc.nextInt();
        System.out.println("Enter third no.: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("The max is: " + a);
        }
        else if(b>c && b>a){
            System.out.println("The max is: " + b);
        }
        else 
        System.out.println("The max is: " + c);
    }
}
