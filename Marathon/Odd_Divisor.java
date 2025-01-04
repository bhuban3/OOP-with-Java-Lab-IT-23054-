
import java.util.Scanner;

public class Odd_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = sc.nextLong();
            if (n % 2 > 1) {
                System.out.println("YES");
                return;
            }
            while (n % 2 == 0) {
                n /= 2;
            }
            if (n > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
