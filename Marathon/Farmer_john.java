import java.util.Scanner;

public class Farmer_john {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n == k) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("1 ");
                }
            } else {
                if (k > 1) {
                    System.out.print("-1");
                } else {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
