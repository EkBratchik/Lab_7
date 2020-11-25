package main.bsu;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main extends Thread {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Length of array: ");
            int lengthArray = in.nextInt();
            List<Integer> array = createRandomArray(lengthArray);
            System.out.println("Do you want to see your array?(See or Skip");
            int variantSee = in.nextInt();
            if (variantSee == 1) {
                printArray(array);
                System.out.println("\n");
            }

            System.out.println("1 - Sort in descending order (by value)\n2 - Sort in ascending order(by value)\n3 - Sort in descending order (by number of elements)\n4 - Sort in ascending order(by number of elements)");
            System.out.print("Enter: ");
            int typeSort = in.nextInt();

            Sort sortArray = new Sort(typeSort);
            sortArray.start();
            sortArray.MySort(array);

            printArray(array);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static List<Integer> createRandomArray(int lengthArray) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < lengthArray; i++) {
            array.add((int) (Math.random() * 30) - 15);
        }
        return array;
    }
    public static void printArray(List<Integer> array) {
        System.out.println("Array:");
        for (int i = 0; i < array.size(); ++i) {
            System.out.print(array.get(i) + " ");
        }
    }
}

