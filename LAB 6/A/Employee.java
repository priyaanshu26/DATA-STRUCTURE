import java.util.Scanner;

public class Employee {


    public static void main(String[] args) {
        
        Employee_Detail AB= new Employee_Detail();
        AB.Read();
        AB.Print();
    }

}
class Employee_Detail{
    String name;
    int id;
    String designation;
    double salary;

    public  void Read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        name = sc.next();
        System.out.println("Enter Employee Designation: ");
        designation = sc.next();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }
    public  void Print(){
        
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Designation: "+designation);
        System.out.println("Employee Salary: "+salary);
    }
}