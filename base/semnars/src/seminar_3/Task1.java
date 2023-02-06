import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Замерить добавление 10000 элементов в начало ArrayList, в начало LinkedList
 */
public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i, 5);
        }
        System.out.println(System.currentTimeMillis() - startTime);
        getTimeLinked();
    }

    public static void getTimeLinked(){
        LinkedList<Integer> tmp = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            tmp.add(0, 10);
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - start);
        System.out.println(tmp.size());
    }
}