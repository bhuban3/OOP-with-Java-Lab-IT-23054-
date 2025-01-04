import java.util.Scanner;

public class New_Year_Number {
    public static void ans(Scanner sc) {
        long n = sc.nextInt();
        while (n % 2020 != 0) {
            if (n % 2021 == 0) {
                System.out.println("YES");
                return;
            }
            n -= 2021;
            if (n < 2020) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            ans(sc);
        }
        sc.close();
    }
}
