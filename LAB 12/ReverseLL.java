public class ReverseLL {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node First;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            First = newNode;
        } else {
            Node temp = First;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = First;
        Node next = null;
        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        First = prev;
    }

    public void display() {
        Node temp = First;
        while (temp.link != null) {
            System.out.print(temp.info + " ---> ");
            temp = temp.link;
        }
        System.out.println(temp.info);
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        System.out.println("Original List:");
        list.display();
        list.reverse();
        System.out.println("Reversed List:");
        list.display();
    }
}
