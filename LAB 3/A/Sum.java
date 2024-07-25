import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of " + m + " to " + n + " = " + sum);

        sc.close();
    }
}
