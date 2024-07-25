public class CopyLL {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node First = null;
    Node Second = null;

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

    public void copy() {
        Node temp = First;
        while (temp != null) {
            Node newNode = new Node(temp.info);
            if (Second == null) {
                Second = newNode;
            } else {
                Node temp2 = Second;
                while (temp2.link != null) {
                    temp2 = temp2.link;
                }
                temp2.link = newNode;
            }
            temp = temp.link;
        }
    }
    public void printList(Node First) {
        Node temp = First;
        while (temp != null
        ) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CopyLL list = new CopyLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        System.out.println("Original List: ");
        list.printList(list.First);
        list.copy();
        System.out.println("Copied List: ");
        list.printList(list.Second);
    }
}