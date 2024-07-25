import java.util.Scanner;

public class Recursion_factorial {
    static long calfac(int n){
        if (n<=1) {
            return 1;
        }
        return n*calfac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(calfac(a));
    }
}