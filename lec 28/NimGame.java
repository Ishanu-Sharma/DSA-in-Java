import java.util.*;
public class NimGame {
    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stones: ");
        int n = sc.nextInt();
        if (canWinNim(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
