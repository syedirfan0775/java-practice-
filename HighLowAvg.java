import java.util.Scanner;
public HighLowAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int high = arr[0];
        int low = arr[0]
        for (int i=1;i<n;i++){
            if (high<arr[i]){
                high = arr[i]; 
            } 
            if (low>arr[i]){
                low = arr[i]; 
            }
        }
    }
}
