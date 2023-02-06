/**
 1. Создайте класс Phone, который содержит переменные number, model и weight.
2. Создайте три экземпляра этого класса. 
3. Выведите на консоль значения их переменных. 
4. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод 5. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
6. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight. 
7. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. 
8.Добавить конструктор без параметров.
9. Вызвать из конструктора с тремя параметрами конструктор с двумя. 
10. Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
11. Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */
class Phone{
    String number;
    String model;
    Double weight;

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }


    public void receiveCall(String name){
        System.out.printf("На телефон %s позвонил %s", number, name);
        System.out.println();
    }

    public void receiveCall(String name, String number){
        System.out.printf("На телефон %s позвонил %s, с номером %s", this.number, name, number);
        System.out.println();
    }

    public void send(String message, String... numbers) {
        System.out.printf("Начинаем отправку сообщений с телефона %s\n", this.number);
        for (String number : numbers) {
            System.out.printf("На телефон %s отправенно сообщение %s\n", number, message);
        }
    }

}

 public class Task {
    public static void main(String[] args) {
        Phone samsung = new Phone("234534524524", "galaxy", 15.2);
        Phone iphone = new Phone("123123411", "galaxy2", 15.7);
        Phone motorola = new Phone("2345235234", "galaxy3", 22.2);

        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(motorola);

        samsung.receiveCall("Vladimir");
        iphone.receiveCall("Ivan");

        System.out.println(motorola.getNumber());

        samsung.receiveCall("Andrey", "6786788");

        samsung.send("abc", "567654545");
        iphone.send("abcde", "567654545", "345234535");
        String[] numbers = {"345345", "34546", "435645"};
        motorola.send("asdasdasd", numbers);

    }
    
}