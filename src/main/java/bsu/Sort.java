package bsu;
import java.util.ArrayList;
import java.util.Comparator;

class Sort extends Thread {
    public int sortCount;
    public Sort(int sortCount) {
        this.sortCount = sortCount;
    }
    public void run(ArrayList<Integer> array) {
        switch (sortCount) {
            case 1 -> array.sort((o1, o2) -> o2 - o1);
            case 2 -> array.sort(Comparator.comparingInt(o -> o));
            case 3 -> array.sort(((o1, o2) -> o2.toString().length() - o1.toString().length()));
            case 4 -> array.sort((Comparator.comparingInt(o -> o.toString().length())));
        }
    }
}