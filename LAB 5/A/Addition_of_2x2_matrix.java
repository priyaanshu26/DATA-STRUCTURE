import java.util.Scanner;

public class Addition_of_2x2_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Read a 2x2 Matrix
        int [][] A = new int [2][2];
        int [][] B = new int [2][2];
        int [][] C = new int [2][2];
        
        System.out.println("Matrix 1: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Added Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
