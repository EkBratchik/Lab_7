package main.bsu;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Sort extends Thread{
    private final int typeSort;

    Sort(int s) {
        typeSort = s;
    }
    static class CompareByValue implements Comparator<Integer> {

        public int compare(Integer value1, Integer value2) {
            return value1.compareTo(value2);
        }
    }
    public static class CompareByNumberOfElements implements Comparator<Integer> {

        public int compare(Integer value1, Integer value2) {
            int length1 = 0;
            while(value1 != 0) {
                ++length1;
                value1 /= 10;
            }
            int length2 = 0;
            while (value2 != 0) {
                ++length2;
                value2 /= 10;
            }
            return (length1 - length2);
        }
    }



    public void MySort(List <Integer> randomArray) {
        Scanner in = new Scanner(System.in);

        switch (typeSort) {
            case 1 -> {
                Comparator comparator1 = new CompareByValue();
                Collections.sort(randomArray, comparator1);
            }

            case 2 -> {
                Comparator comparator2 = new CompareByValue();
                List<Integer> randomArrayInverse1 = new ArrayList<>();
                Collections.sort(randomArrayInverse1, comparator2);
                for (int i = 0; i < randomArray.size(); ++i) {
                    randomArray.set(i, randomArrayInverse1.get(randomArray.size() - i - 1));
                }
            }

            case 3 -> {
                Comparator comparator3 = new CompareByNumberOfElements();
                Collections.sort(randomArray, comparator3);
            }

            case 4 -> {
                Comparator comparator4 = new CompareByNumberOfElements();
                List<Integer> randomArrayInverse2 = new ArrayList<>();
                Collections.sort(randomArrayInverse2, comparator4);
                for (int i = 0; i < randomArray.size(); i++) {
                    randomArray.set(i, randomArrayInverse2.get(randomArray.size() - i - 1));
                }
            }
        }
    }
}

