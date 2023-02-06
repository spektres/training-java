/*
 * ТЕМА: Деревья и обход в глубину.
 * 
 * Дано два числа src, target и даны два числа addend, mult. 
 * Вывести все способы получения из числа src число target.
 * Можно добавлять addend, умножать число на mult.
 * 
 * 
 * static функция может вызывать только другую static функцию
 * static - аналог функции верхнего уровня. Как  def в python, не привязанная к объекту.
 */
/**
 * Task1
 */
public class Task1 {
    

    public static void main(String[] args) {
        findPath(1, 5, 1, 2, "");
    }
        private static void findPath(int src, int target, int addend, int mult, String path) {
            if (src > target) {
                return;
            }
            if (src == target) {
                System.out.println(path + " = " + target);
                return;
            }

            findPath(src + addend, target, addend, mult, path + " >> " + src + " + " + addend);
            findPath(src * mult, target, addend,  mult, path + " >> " + src + " * " + addend);
    }
}

