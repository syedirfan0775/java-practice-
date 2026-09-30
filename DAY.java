import java.util.Scanner;
class DAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day: " + day + ", Name: " + name);
        int day = sc.nextInt();
        String name;

        switch (day) {
            case 1:
                name = "Sunday";
                break;

            case 2:
                name = "Monday";
                break;

            case 3:
                name = "Tuesday";
                break;

            case 4:
                name = "Wednesday";
                break;

            case 5:
                name = "Thursday";
                break;

            case 6:
                name = "Friday";
                break;

            case 7:
                name = "Saturday";
                break;

            default:
                name = "Invalid day";
        }

    }
}