import java.util.Scanner;
public class Areaofcircle{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        double a;
        a= r*r*Math.PI;
        System.out.println(a);
    }
}