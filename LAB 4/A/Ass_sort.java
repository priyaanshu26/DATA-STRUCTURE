public class Ass_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
        }
    }
}
