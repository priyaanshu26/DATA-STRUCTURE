import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Temperature Conversion Menu:");
        System.out.println("1- Convert Celsius to Fahrenheit");
        System.out.println("2- Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            conCtoF();
        } else if (choice == 2) {
            conFtoC();
        } else {
            System.out.println("Invalid");
        }
    }

    public static void conCtoF() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = sc.nextDouble();
        double f = 32 + (c * 9 / 5);
        System.out.println(c + " ºC = " + f + " ºF");
    }

    public static void conFtoC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " ºF = " + c + " ºC");
    }
}