import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        // Step 1: Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        // 'fruits' is an ArrayList that will store strings

        // Step 2: Add elements to the ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        // This adds "apple", "banana", and "cherry" to the list

        // Step 3: Print the entire list
        System.out.println("The entire list of fruits: " + fruits);
        // This prints: The entire list of fruits: [apple, banana, cherry]

        // Step 4: Access individual elements using indexing
        System.out.println("The first fruit is: " + fruits.get(0));  // Indexing starts from 0, so this prints "apple"
        System.out.println("The second fruit is: " + fruits.get(1)); // This prints "banana"
        System.out.println("The third fruit is: " + fruits.get(2));  // This prints "cherry"

        // Step 5: Modify an element in the list
        fruits.set(1, "blueberry");
        // This changes the second element from "banana" to "blueberry"
        System.out.println("After modification, the list is: " + fruits);
        // This prints: After modification, the list is: [apple, blueberry, cherry]

        // Step 6: Add a new element to the end of the list
        fruits.add("date");
        // This adds "date" to the end of the list
        System.out.println("After adding a new fruit, the list is: " + fruits);
        // This prints: After adding a new fruit, the list is: [apple, blueberry, cherry, date]

        // Step 7: Remove an element from the list
        fruits.remove("cherry");
        // This removes "cherry" from the list
        System.out.println("After removing a fruit, the list is: " + fruits);
        // This prints: After removing a fruit, the list is: [apple, blueberry, date]

        // Step 8: Iterate over the list using a for loop
        System.out.println("Iterating over the list of fruits:");
        int i = 0;
        for (String fruit : fruits) {
            System.out.println("fruits["+i+"] = "+fruit);
            i++;
        }
        // This prints each fruit in the list on a new line

        // Step 9: Check if an item is in the list
        if (fruits.contains("apple")) {
            System.out.println("Apple is in the list.");
        } else {
            System.out.println("Apple is not in the list.");
        }
        // This checks if "apple" is in the list and prints a message accordingly
    }
}
