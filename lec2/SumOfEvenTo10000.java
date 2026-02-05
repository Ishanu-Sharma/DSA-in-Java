import java.util.Scanner;
public class SumOfEvenTo10000{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i=1; i<=10000; i++){
        if(i%2==0){
            sum += i;
        }
    }
    
        System.out.println("Sum of 10000 even numbers is: " + sum);
}
}