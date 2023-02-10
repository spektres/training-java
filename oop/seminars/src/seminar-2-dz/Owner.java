public class Owner implements ComeHere {
    private String name;
    private int age;
    private String gender;
    private String petName;

    public Owner(String name, int age, String gender, String petName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.petName = petName;
    }

    public Owner(String name, String petName) {
        this.name = name;
        this.petName = petName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPetName() {
        return petName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println(petName + " Подойди ко мне");
    }
}