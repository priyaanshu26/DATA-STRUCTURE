public class Min_Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        int max = arr[0];
        int min_index=0;
        int max_index=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_index= i;
            }
            if (arr[i] > max) {
                max = arr[i];
                max_index= i;
            }
        }
        System.out.println("Min: " + min + " Index: " + min_index);
        System.out.println("Max: " + max + " Index: " + max_index);

    }
}
