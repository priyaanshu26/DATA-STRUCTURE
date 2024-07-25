import java.util.Scanner;

public class stackUsingSSL {

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;

    public void push(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link=newnode;
        return;
    }

    public int pop() {
        if (first == null) {
            System.out.println("List is empty");
            return(0);
        }
        
                Node temp = first;
                Node temp1 = first.link;
                while (temp1.link != null) {
                    temp1 = temp1.link;
                    temp = temp.link;
                }
                temp.link = null;
                return temp.info;
    }

    public void display() {
        Node temp = first;
        if (first == null) {
            System.out.println("Stack is empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.info + "->");
                temp = temp.link;
            }
            System.out.println(" ");
        }
    }
    public int peek(){
        if(first == null){
            System.out.println("Stack is Empty.");
            return(0);
        }
        Node temp = first;
        Node temp1 = first.link;
        while (temp1.link != null) {
            temp1 = temp1.link;
            temp = temp.link;
        }
        return temp1.info;
    }

    public void isEmpty(){
        if(first == null){
            System.out.println("Stack is Empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackUsingSSL stack = new stackUsingSSL();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. DISPLAY");
            System.out.println("4. Peek");
            System.out.println("5. isEmpty");
            System.out.println("6. EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4: 
                    System.out.println("Top Element is " + stack.peek());
                case 5:
                    stack.isEmpty();
                case 6:
                    System.exit(0);
            }
        }

    }
}