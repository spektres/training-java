public class Cat extends Animal implements ComeHere {
    public Cat(String name, int age, String ownerName) {
        super(name, age, ownerName);
    }

    @Override
    public void speak() {
        System.out.println("Meow - meow");
    }
}