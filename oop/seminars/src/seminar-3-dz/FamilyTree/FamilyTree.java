/**
 * Класс расширяющий Human, наследует всё из родительского класса
 */
class FamilyMemeber extends Human {

    public FamilyMemeber(String fio) {
        super(fio);
    }

    public FamilyMemeber(String fio, I_FamilyTree parent) {
        super(fio, parent);
    }

    public FamilyMemeber(String fio, I_FamilyTree parent1, I_FamilyTree parent2) {
        super(fio, parent1, parent2);
    }

    @Override
    public String toString() {
        return this.getFio();
    }

}