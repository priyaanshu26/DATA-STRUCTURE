import java.util.Scanner;
public class Array_object {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        for(int i=0;i<5;i++){
            s[i] = new Student();
            s[i].Read();
        }
        for(int i=0;i<5;i++){
            s[i].Display();
        }
    }
}
class Student{
    int Enroll;
    String Name;
    int Sem;
    double Spi;

    public void Read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrollment Number: ");
        Enroll = sc.nextInt();
        System.out.println("Enter Name: ");
        Name = sc.next();
        System.out.println("Enter Semester: ");
        Sem = sc.nextInt();
        System.out.println("Enter SPI: ");
        Spi = sc.nextDouble();
    }
    public void Display(){
        System.out.println("Enrollment Number: "+Enroll);
        System.out.println("Name: "+Name);
        System.out.println("Semester: "+Sem);
        System.out.println("SPI: "+Spi);
    }
}