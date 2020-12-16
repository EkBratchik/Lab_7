package bsu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массива ");
            int size = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                array.add(i, rand.nextInt(100));
            }
            System.out.println("Размер массива: " + size);
            System.out.println("Массив до сортировки");
            for (int i = 0; i < size; i++) {
                System.out.print(array.get(i) + " ");
            }
            System.out.println();
            System.out.println("1. Убывание по значению");
            System.out.println("2. Возрастание по значению");
            System.out.println("3. Убывание по количеству цифр");
            System.out.println("4. Возрастание по количеству цифр");
            int sortValue = scanner.nextInt();
            Sort sort = new Sort(sortValue);
            sort.join();
            sort.start();
            sort.run(array);
            System.out.println("Массив после сортировки");
            for (int i = 0; i < size; i++) {
                System.out.print(array.get(i) + " ");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}