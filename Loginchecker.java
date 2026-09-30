import java.util.Scanner;
public class Loginchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctpassword = "admin123";
        int attempts = 3;
        boolean loggedIn = false;

        while (attempts>0){
            System.out.print("Enter your password: ");
            String input = sc.nextLine(); 
            attempts--;
            if (input.equals(correctpassword)){
                loggedIn = true;
                break; 
            }else{
                System.out.println("Invalid password. Please try again.");
                System.out.println("You have only " + attempts+ " attempts left."); 
            }
        
        }
    
        if(loggedIn==true){
            System.out.println("Login successful!");
        }else{
            System.out.println("Too many failed attempts. Access denied."); 
        } 
    }
}
