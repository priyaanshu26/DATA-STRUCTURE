import java.util.Scanner;


public class Multiplication_of_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] A = new int [3][2];
        int [][] B = new int [2][3];
        int [][] C = new int [3][3];
        
        System.out.println("Matrix 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j]; 
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
