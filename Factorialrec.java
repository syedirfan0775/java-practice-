import java.util.Scanner;
public class Factorialrec {
    static int Factorialrec(int n){
        if (n==1 || n==0){
            return 1;
        }
        return n*Factorialrec(n-1); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println( " Factorial of "+n+ " = " + Factorialrec(n));
    }
}