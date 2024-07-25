import java.util.Scanner;

class Operations_onStack {

    int Max_size;
    int top=-1;
    int[] stack;

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

    public void display() {

        if (top < 0) {

            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {

            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public int peek(int index) {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[index];
    }

    public void change(int new_n) {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return;
        }
        stack[top] = new_n;
        System.out.println("Top element changed to " + new_n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations_onStack stack = new Operations_onStack();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEP");
            System.out.println("5. CHANGE (Modify top element)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int n = sc.nextInt();
                    stack.push(n);
                    break;
                case 2:
                    int pop_n = stack.pop();
                    if (pop_n != -1) {
                        System.out.println("Popped element: " + pop_n);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    int peek_n = stack.peek(index);

                    System.out.println("Element at " + index + " is " + peek_n);
                    break;
                case 5:
                    System.out.print("Enter new value: ");
                    int new_n = sc.nextInt();
                    stack.change(new_n);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
