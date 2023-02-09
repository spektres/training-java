package KisKis;

public class Human {
    private String name;
    private String catName;

    public Human(String name, String catName) {
        this.name = name;
        this.catName = catName;
    }

    public String getName() {
        return name;
    }

    public String getCatName() {
        return catName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }
    void Kis() {
        System.out.println("Kis-kis");
    }
}