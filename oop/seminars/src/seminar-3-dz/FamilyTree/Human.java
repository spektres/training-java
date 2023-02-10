import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс для создания объекта члена семьи, реализующий интерфейс I_FamilyTree
 */
public class Human implements I_FamilyTree {
    private String fio;
    private I_FamilyTree spouse;
    private List<I_FamilyTree> parents;
    private List<I_FamilyTree> children;

    {
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public Human(String fio) {
        this.fio = fio;
    }

    public Human(String fio, I_FamilyTree parent) {
        this.fio = fio;
        this.setParent(parent);
    }

    public Human(String fio, I_FamilyTree parent1, I_FamilyTree parent2 ) {
        this(fio, parent1);
        this.setParent(parent2);
    }

    public String getFio() {
        return fio;
    }

    public I_FamilyTree getSpouse() {
        return spouse;
    }

    public List<I_FamilyTree> getParents() {
        return parents;
    }

    @Override
    public List<I_FamilyTree> getParent() {
        return parents;
    }

    @Override
    public List<I_FamilyTree> getChildren() {
        return children;
    }

    @Override
    public void setParent(I_FamilyTree parent) {
        if (parents.size() < 2) {
            parents.add(parent);
        } else {
            System.out.println("Тебе повезло! У тебя много родителей))) ");
        }
        parent.addChild(this);
    }

    @Override
    public void setSpouse(I_FamilyTree spouse) {
        this.spouse = spouse;
        if(((FamilyMemeber) spouse).getSpouse() == null) {
            spouse.setSpouse(this);
        }
    }

    @Override
    public void addChild(I_FamilyTree child) {
        children.add(child);
        if(!(child.getParent().contains(this))) {
            child.setParent(this);
        }
    }

    @Override
    public boolean isKinship(I_FamilyTree person) {
        for(I_FamilyTree parent1 : this.getParent()) {
            for (I_FamilyTree parent2 : person.getParent()) {
                if (!(parent1 == null) && parent1.equals(parent2)) {
                    return true;
                }
            }
        }
        return false;
    }


}