import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Linked {
    Node first;
    public void insertatfirst(int data) {
        if (first == null) {
            first = newnode;
            return;
        }
        Node newnode = new Node(data);
        newnode.link = first;
        first = newnode;
    }

    public void insertatlast(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }

    public int deleteatfirst() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        first = first.link;
    }

    public int deleteatlast() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        if (first.link == null) {
            first = null;
            return;
        }
        Node pre = first;
        while (pre.link.link != null) {
            pre = pre.link;
        }
    }

    public void insertatorder(int data) {
        Node newnode = new Node(data);
        if (first == null || data < first.data) {
            newnode.link = first;
            first = newnode;
            return;
        }
        Node current = first;
        while (current.link != null && current.link.data < data) {
            current = current.link;
        }
        newnode.link = current.link;
        current.link = newnode;
    }
}

public class Linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked stack = new Linked();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert At First");
            System.out.println("2. Insert At Last");
            System.out.println("3. DISPLAY");
            System.out.println("4. Insert at Order");
            System.out.println("5. Delete at First");
            System.out.println("6. Delete at Last");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element: ");
                    int data = sc.nextInt();
                    stack.insertatfirst(data);
                    break;
                case 2:
                    System.out.print("Enter the element: ");
                    int data1 = sc.nextInt();
                    stack.insertatlast(data1);
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.print("Enter the element: ");
                    int data2 = sc.nextInt();
                    stack.insertatorder(data2);
                    break;
                case 5:
                    System.out.println("Deleted element is: " + stack.deleteatfirst());
                    break;
                case 6:
                    System.out.println("Deleted element is: " + stack.deleteatlast());
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid");

            }
        }
    }
}