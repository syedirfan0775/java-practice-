import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      PERSONAL FITNESS TRACKER");
        System.out.println("=================================");

        // Basic details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        // Fitness Goal
        System.out.println("\n----- FITNESS GOAL -----");
        System.out.println("1. Weight Gain");
        System.out.println("2. Weight Loss");
        System.out.println("3. Maintain Weight");

        System.out.print("Enter your goal (1-3): ");
        int goal = sc.nextInt();

        String fitnessGoal;

        if (goal == 1) {
            fitnessGoal = "Weight Gain";
        }
        else if (goal == 2) {
            fitnessGoal = "Weight Loss";
        }
        else if (goal == 3) {
            fitnessGoal = "Maintain Weight";
        }
        else {
            fitnessGoal = "Invalid Goal";
        }

        // BMI calculation
        double heightMeter = height / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("\n----- BMI SUMMARY -----");
        System.out.printf("Weight: %.1f kg\n", weight);
        System.out.printf("Height: %.1f cm\n", height);
        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Fitness Category: Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Fitness Category: Normal");
        }
        else if (bmi < 30) {
            System.out.println("Fitness Category: Overweight");
        }
        else {
            System.out.println("Fitness Category: Obese");
        }

        // Calorie goal
        System.out.print("\nEnter your weekly calorie-burning goal: ");
        double calorieGoal = sc.nextDouble();

        double totalCalories = 0;
        int workoutDays = 0;

        // MONDAY
        System.out.println("\n----- MONDAY - CHEST DAY -----");
        System.out.print("Did you workout today? (yes/no): ");
        String monday = sc.next();

        if (monday.equalsIgnoreCase("yes")) {

            System.out.println("1. Bench Press");
            System.out.println("2. Incline Dumbbell Press");
            System.out.println("3. Chest Fly");
            System.out.println("4. Push-ups");
            System.out.println("Calories Burned: 250 kcal");

            totalCalories += 250;
            workoutDays++;
        }
        else {
            System.out.println("Monday workout skipped.");
        }

        // TUESDAY
        System.out.println("\n----- TUESDAY - BACK DAY -----");
        System.out.print("Did you workout today? (yes/no): ");
        String tuesday = sc.next();

        if (tuesday.equalsIgnoreCase("yes")) {

            System.out.println("1. Pull-ups");
            System.out.println("2. Lat Pulldown");
            System.out.println("3. Seated Cable Row");
            System.out.println("4. Dumbbell Row");
            System.out.println("Calories Burned: 280 kcal");

            totalCalories += 280;
            workoutDays++;
        }
        else {
            System.out.println("Tuesday workout skipped.");
        }

        // WEDNESDAY
        System.out.println("\n----- WEDNESDAY - LEG DAY -----");
        System.out.print("Did you workout today? (yes/no): ");
        String wednesday = sc.next();

        if (wednesday.equalsIgnoreCase("yes")) {

            System.out.println("1. Squats");
            System.out.println("2. Lunges");
            System.out.println("3. Leg Press");
            System.out.println("4. Leg Extension");
            System.out.println("Calories Burned: 320 kcal");

            totalCalories += 320;
            workoutDays++;
        }
        else {
            System.out.println("Wednesday workout skipped.");
        }

        // THURSDAY
        System.out.println("\n----- THURSDAY - SHOULDER DAY -----");
        System.out.print("Did you workout today? (yes/no): ");
        String thursday = sc.next();

        if (thursday.equalsIgnoreCase("yes")) {

            System.out.println("1. Shoulder Press");
            System.out.println("2. Lateral Raises");
            System.out.println("3. Front Raises");
            System.out.println("4. Rear Delt Fly");
            System.out.println("Calories Burned: 250 kcal");

            totalCalories += 250;
            workoutDays++;
        }
        else {
            System.out.println("Thursday workout skipped.");
        }

        // FRIDAY
        System.out.println("\n----- FRIDAY - ARMS DAY -----");
        System.out.print("Did you workout today? (yes/no): ");
        String friday = sc.next();

        if (friday.equalsIgnoreCase("yes")) {

            System.out.println("1. Bicep Curls");
            System.out.println("2. Hammer Curls");
            System.out.println("3. Tricep Pushdown");
            System.out.println("4. Tricep Dips");
            System.out.println("Calories Burned: 230 kcal");

            totalCalories += 230;
            workoutDays++;
        }
        else {
            System.out.println("Friday workout skipped.");
        }

        // SATURDAY
        System.out.println("\n----- SATURDAY - FULL BODY -----");
        System.out.print("Did you workout today? (yes/no): ");
        String saturday = sc.next();

        if (saturday.equalsIgnoreCase("yes")) {

            System.out.println("1. Squats");
            System.out.println("2. Push-ups");
            System.out.println("3. Pull-ups");
            System.out.println("4. Running");
            System.out.println("Calories Burned: 350 kcal");

            totalCalories += 350;
            workoutDays++;
        }
        else {
            System.out.println("Saturday workout skipped.");
        }

        // SUNDAY
        System.out.println("\n----- SUNDAY - REST DAY -----");
        System.out.println("Take rest and allow your body to recover.");

        // WEEKLY REPORT
        System.out.println("\n=================================");
        System.out.println("          WEEKLY REPORT");
        System.out.println("=================================");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Fitness Goal: " + fitnessGoal);
        System.out.println("Workout Days: " + workoutDays);

        System.out.printf(
            "Total Calories Burned: %.0f kcal\n",
            totalCalories
        );

        double averageCalories = totalCalories / 7;

        System.out.printf(
            "Average Calories Per Day: %.2f kcal\n",
            averageCalories
        );

        // GOAL STATUS
        System.out.println("\n----- GOAL STATUS -----");

        if (totalCalories >= calorieGoal) {

            System.out.println(
                "Congratulations! You achieved your weekly goal."
            );
        }
        else {

            double remaining = calorieGoal - totalCalories;

            System.out.println("Goal not achieved yet!");

            System.out.printf(
                "%.0f kcal more needed to reach your goal.\n",
                remaining
            );
        }

        System.out.println("\nYour selected goal: " + fitnessGoal);

        System.out.println("Keep going, " + name + "!");

        sc.close();
    }
}