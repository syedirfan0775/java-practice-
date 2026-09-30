public class Login {
        public static void main(String[] args) {
            String username = "admin";
            int pin = 123456;
            if (username.equals("admin")) {
                if (pin == 123456) {
                    System.out.println("Login successful.");
                } else {
                    System.out.println("Invalid pin.");
            }
            } else {
                System.out.println("Invalid username");
                
            }
}
}

