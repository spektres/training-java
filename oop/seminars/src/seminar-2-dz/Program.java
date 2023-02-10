public class Program {
    public static void main(String[] args) {
        Owner hum = new Owner("Андрей", "Мурка");
        Owner hum1 = new Owner("Ольга", 25, "женщина", "Рэкс");
        Cat cat = new Cat("Мурка", 3, "Андрей");
        Dog dog = new Dog("Рэкс", 6, "Ольга");
        hum.speak();
        cat.speak();
        hum1.speak();
        dog.speak();
    }
}