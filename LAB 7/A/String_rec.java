import java.util.Scanner;

public class String_rec{
    int top=1;
    int [] s= new int[100];
    s[top]=c;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        
    }     

}
class String_rec {

    int Max_size;
    int top=-1;
    char [] stack;
    public Operations_onStack(int size) {

        Max_size = size;
        stack = new int[Max_size];
    }
    public void push(int n) {
        if (top >= Max_size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = n;
        System.out.println(n + " pushed onto the stack.");
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }
}