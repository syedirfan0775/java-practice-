import java.util.Scanner;
public class Coundownrec {
    static void Coundownrec(int n){
        if (n==0){
            return;
        }
        System.out.println(n); 
        Coundownrec(n-1);   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        Coundownrec(n);
         
    }
}
