import java.util.*;

public class infix_to_postfix {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();
        String polish = "";
        int rank = 0;
        s.push('(');
        infix += ')';

        for (int i = 0; i < infix.length(); i++) {
            char next = infix.charAt(i);

            if (Character.isLetterOrDigit(next)) {
                polish += next;
                rank += R(next);
            } else if (next == '(') {
                s.push(next);
            } else if (next == ')') {
                while (s.peek() != '(') {
                    char temp = s.pop();
                    polish += temp;
                    rank += R(temp);
                    if (rank < 1) {
                        System.out.println("Invalid");
                        return;
                    }
                }
                s.pop();
            } else {
                while (!s.isEmpty() && G(s.peek()) > F(next)) {
                    char temp = s.pop();
                    polish += temp;
                    rank += R(temp);
                    if (rank < 1) {
                        System.out.println("Invalid");
                        return;
                    }
                }
                if (!s.isEmpty() && G(s.peek()) != F(next)) {
                    s.push(next);
                } else if (!s.isEmpty()) {
                    s.pop();
                }
            }
        }

        if (!s.isEmpty() || rank != 1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
            System.out.println("Postfix expression: " + polish);
        }
    }

    public static int F(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;
            default:
                return 7;
        }
    }

    public static int G(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            default:
                return 8;
        }
    }

    public static int R(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return -1;
            default:
                return 1;
        }
    }
}
