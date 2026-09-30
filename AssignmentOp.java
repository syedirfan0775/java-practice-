import java.util.Scanner;
public class AssignmentOp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int b=a;
        b+=10;
        System.out.println("a+10: " + b); 
        int c=a; 
        c-=5;
        System.out.println("a-5: " + c); 
        int d=a;
        d*=2;
        System.out.println("a*2: " + d);
        int e=a;
        e/=2;   
        System.out.println("a/2: " + e);


    }
} 