public class Dog extends Animal implements ComeHere{
    public Dog(String name, int age, String ownerName) {
        super(name, age, ownerName);
    }

    @Override
    public void speak() {
        System.out.println("Woof - woof");
    }
}