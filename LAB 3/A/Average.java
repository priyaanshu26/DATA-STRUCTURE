import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int avg;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        avg=sum/n;
        System.out.println("Average is: " + avg);
        sc.close();
    }
}
