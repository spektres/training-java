import java.util.ArrayList;
import java.util.Iterator;

/*
 * Создайте массив с “сырым типом”, добавьте туда разные типы данных. Удалите только числа. 
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add("qwe");
        arrayList.add(123);
        arrayList.add("ewq");
        System.out.println(arrayList.get(0) instanceof String);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            if (current instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
