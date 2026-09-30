import java.util.Scanner;
public class Fibonaccirec {
    static int fibonaccirec(int n){
        if (n<=1){ 
            return n;
        }
        return fibonaccirec(n-1) + fibonaccirec(n-2);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter no:");
        int n = sc.nextInt();
        System.out.print("Fib :" + fibonaccirec(n));
    }
}
