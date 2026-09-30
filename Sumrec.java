import java.util.Scanner;
public class Sumrec {
    static int sumrec(int n){
        if (n==0){
            return 0;
        }
        return n + sumrec(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no:");
        int n = sc.nextInt();
        System.out.println("sum:"+sumrec(n));
        sumrec(n); 
    } 
}
