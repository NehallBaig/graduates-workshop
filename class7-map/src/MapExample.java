import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        // Create a Map that maps String keys to Integer values
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add key-value pairs to the Map
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Print the initial Map
        System.out.println("Initial student grades: " + studentGrades);

        // Retrieve a value from the Map
        String studentName = "Bob";
        Integer grade = studentGrades.get(studentName);
        if (grade != null) {
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println(studentName + " is not in the Map.");
        }

        // Update a value in the Map
        studentGrades.put("Alice", 90);
        System.out.println("Updated Alice's grade: " + studentGrades.get("Alice"));

        // Remove a key-value pair from the Map
        studentGrades.remove("Charlie");
        System.out.println("Removed Charlie. Current student grades: " + studentGrades);

        // Check if a key exists in the Map
        if (studentGrades.containsKey("Bob")) {
            System.out.println("Bob is in the Map.");
        } else {
            System.out.println("Bob is not in the Map.");
        }

        // Check if a value exists in the Map
        if (studentGrades.containsValue(90)) {
            System.out.println("A student has a grade of 90.");
        } else {
            System.out.println("No student has a grade of 90.");
        }

        // Iterate over the Map entries
        System.out.println("Iterating over the student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

