public abstract class Animal {
    private String name;
    private int age;
    private String ownerName;

    public Animal(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}