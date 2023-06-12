//import java.util.HashMap;
//import java.util.Map;
//
//public class Calories {
//    private Map<String, Integer> calorieIntake;
//
//    public Calories() {
//        calorieIntake = new HashMap<>();
//    }
//
//    public void addCaloricValue(String foodItem, int calories) {
//        calorieIntake.put(foodItem, calories);
//    }
//
//    public int getTotalCalories() {
//        int total = 0;
//        for (int calories : calorieIntake.values()) {
//            total += calories;
//        }
//        return total;
//    }
//
//    public Map<String, Integer> getCalorieIntake() {
//        return calorieIntake;
//    }
//
//
//    public static void main(String[] args) {
//        Calories test = new Calories();
//
//        String food = "hot dog";
//        int number = 50;
//        test.addCaloricValue(food, number);
//
//        String food2 = "burger";
//        int number2 = 100;
//        test.addCaloricValue(food2, number2);
//
//        // Print the added caloric value
//        System.out.println("Calories test for " + food + ": " + test.getCalorieIntake().get(food));
//        System.out.println("Calories test for " + food2 + ": " + test.getCalorieIntake().get(food2));
//
//        // Print the total calories
//        System.out.println("Total calories: " + test.getTotalCalories());
//    }
//}
