import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 45;
        intArray[1] = 1;
        intArray[5] = 50;

        double[] doubleArray = new double[10];
        doubleArray[2] = 3;

        System.out.println(doubleArray[2]);

        String[] names = {"Nehal", "Harry", "Jhon"}; //shorthand and anonymous array

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + numbers[0]); // first index is 0

        int arrayLength = numbers.length;
        System.out.println("length or array = " + arrayLength);
        //System.out.println("last = " + numbers[arrayLength]); ArrayIndexOutOfBoundsException as array index start from 0
        System.out.println("last = " + numbers[arrayLength - 1]);

        int[] newArray;
        //newArray = {5, 4, 3, 2, 1};//Array initializer is not allowed here
        //This means, you can't use the anonymous version of the array initializer,
        // in a statement outside of declaration statement.
        //But we can use the longer form, so I'll change that now, including new int with square brackets,

        //newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];

        // for loop
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        //enhanced for loop
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;


    }
}