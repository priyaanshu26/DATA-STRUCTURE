import java.util.Scanner;
public class Delete_loc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int Array[] =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element at " + i + " Index: ");
            Array[i] = sc.nextInt();
        }
        System.out.println("Enter index at which you want to delete number: ");
        int a = sc.nextInt();
        int newArray [] = new int [n-1];
        for (int i = 0; i < n-1; i++) {
            if (i<a) {
                newArray[i] = Array[i];
            }
            else {
                newArray[i] = Array[i+1];
            }
        }
        System.out.println("New Array is: ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(newArray[i] + " ");
        }
        }
}
