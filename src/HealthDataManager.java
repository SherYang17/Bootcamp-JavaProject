import java.util.Scanner;

public class HealthDataManager {
    private UserManager userManager;
    private CaloriesTwo caloriesTwo;

    public HealthDataManager(UserManager userManager) {
        this.userManager = userManager;
        this.caloriesTwo = new CaloriesTwo();
    }


    public void healthDataInput() {
        Scanner scanner = new Scanner(System.in);
        boolean inputRunning = true;

        while (inputRunning) {
            System.out.println("Health Data Input");
            System.out.println("1. Daily Calorie Intake");
            System.out.println("2. Exercise Activities");
            System.out.println("3. Sleep Records");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
//                    System.out.print("Enter the calorie intake data: ");
//                    String data = scanner.nextLine();
//                    caloriesTwo.storeCalorieIntake(data);
                    logDailyCalorieIntake(scanner);
                    break;
                case 2:
                    logExerciseActivity(scanner);
                    break;
                case 3:
                    logSleepRecords(scanner);
                    break;
                case 0:
                    inputRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }


    private void logDailyCalorieIntake(Scanner scanner) {
        System.out.print("Enter the food item: ");
        String foodItem = scanner.nextLine();

        System.out.print("Enter the calorie intake: ");
        int calories = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        caloriesTwo.storeCalorieIntake(foodItem, calories);
    }

//
//    private void logDailyCalorieIntake(Scanner scanner) {
//        System.out.println("Enter the food item: ");
//        String foodItem = scanner.nextLine();
//
//        System.out.println("Enter the caloric value: ");
//        int calories = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character
//
//        // Get the currently logged in user
//        User currentUser = userManager.getCurrentUser();
//
//        // Retrieve the user's existing Calories object
//        Calories caloriesData = currentUser.getCalories();
//
//        // If the user doesn't have a Calories object, create a new one
//        if (caloriesData == null) {
//            caloriesData = new Calories();
//            currentUser.setCalories(caloriesData);
//        }
//
//        // Add the food item and its caloric value to the Calories object
//        caloriesData.addCaloricValue(foodItem, calories);
//
//        System.out.println("Caloric value added successfully.");
//    }



    private void logExerciseActivity(Scanner scanner) {
        // TODO: Implement exercise activity logging logic
    }

    private void logSleepRecords(Scanner scanner) {
        // TODO: Implement sleep record logging logic
    }

    private void healthDataAnalysis() {
        // TODO: Implement health data analysis logic
    }
}
