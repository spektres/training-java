import java.util.List;

/**
 * Интерфейс создающий семейное дерево
 */
public interface I_FamilyTree {
    public List<I_FamilyTree> getParent();
    public List<I_FamilyTree> getChildren();
    public void setParent(I_FamilyTree parent);
    public void setSpouse(I_FamilyTree spouse);
    public void addChild(I_FamilyTree child);
    public boolean isKinship(I_FamilyTree person);

}