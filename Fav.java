import java.util.Scanner;
class Fav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();
        
        
        scanner.nextLine();
        System.out.print("Enter your intro: ");
        String intro = scanner.nextLine();
        
         
        System.out.println("Your favorite number is: " + favoriteNumber);
        System.out.println("Your intro is: " + intro);
        
    }
}