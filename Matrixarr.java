import java.util.*;
public class Matrixarr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter r:");
        int r = sc.nextInt();
        System.out.print("enter c:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];  
        int value = 1;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){ 
                if(i==j || i+j == arr.length-1){ 
                    arr[i][j] = 0;} 
                else{
                    arr[i][j] = value; 
                }
                value ++;
            } 
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
    }
    System.out.println();
} 
    }
}

