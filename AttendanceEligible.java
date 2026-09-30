import java.util.Scanner;
public class AttendanceEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your attendance percentage: ");
        double attendance = sc.nextDouble();
        if (attendance >= 75){
            System.out.println("You are eligible to sit for the exam.");
        }else{
            System.out.println("You are not eligible to sit for the exam.");    
}
    }

}