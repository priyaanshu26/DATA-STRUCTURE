public class Swap_userdefined {

    public static void swap(int a, int b) {
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
        return;
    }
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping");
        System.out.println(a + " " + b);

        System.out.println("After Swapping");
        swap(a, b);
    }
}