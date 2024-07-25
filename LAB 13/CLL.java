import java.util.Scanner;

public class CLL {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;
    Node last = null;

    void insert_front(int data) {
        Node new_node = new Node(data);
        new_node.info = data;
        if (first == null) {
            new_node.link = new_node;
            first = new_node;
            last = new_node;
        } else {
            new_node.link = first;
            last.link = new_node;
            first = new_node;
        }
    }

    void insert_end(int data) {
        Node new_node = new Node(data);
        new_node.info = data;
        if (first == null) {
            new_node.link = new_node;
            first = new_node;
            last = new_node;
        } else {
            new_node.link = first;
            last.link = new_node;
            last = new_node;
        }
    }

    void del_x(int data) {

        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        while( save.info != data && save != last) {
            save = save.link;
            if(save)
        }
    }

    void display() {
        Node save = first;
        do {
            System.out.print(save.info + " ");
            save = save.link;
        } while (save != first);
        System.out.println();
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: 1.Insert at front 2.Insert at end 3.Delete 4.Display 5.Exit");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to insert at front: ");
                    cll.insert_front(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the data to insert at end:");
                    cll.insert_end(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the data to delete: ");
                    cll.del_x(sc.nextInt());
                    break;
                case 4:
                    System.out.println("The elements of the CLL are: ");
                    cll.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}