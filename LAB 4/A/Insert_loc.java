import java.util.Scanner;

public class Insert_loc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int Array[] =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element at " + i + " Index: ");
            Array[i] = sc.nextInt();
        }
        System.out.println("Enter index at which you want to enter number: ");
        int a = sc.nextInt();
        System.out.println("Enter number to be inserted: ");
        int b = sc.nextInt();
        int newArray [] = new int [n+1];
        for (int i = 0; i < n+1; i++) {
            if(i==a){
                newArray[i]= b;
            }else if (i>a){
                newArray[i]= Array[i-1];
            }
            else{
                newArray[i] = Array[i];
            }
        }
        System.out.println("New Array: ");
        for(int i=0 ; i < n+1; i++ ){
            System.out.println(newArray[i]);
        }
    }
}
