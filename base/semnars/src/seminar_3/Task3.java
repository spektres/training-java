import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Создайте массив String[]. Из него получите ArrayList<String> 
 * используйте метод Arrays.asList. 
 * Попробуйте в получившийся ArrayList<String> добавить новую строку, 
 * что произойдет?
 */
public class Task3 {
    public static void main(String[] args) {
        String[] s = {"qwe", "asd", "zxc"};
        List<String> l = Arrays.asList(s);
        List<String> modeList = new ArrayList<>(l);
        modeList.add("poiuyui");

        System.err.println(modeList);
    }
}
