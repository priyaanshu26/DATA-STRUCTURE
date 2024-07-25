import java.util.Scanner;

public class Array {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Entered numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + ",");
        }
        sc.close();
    }
}
