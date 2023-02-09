package FamilyTree;

class Human {
    private String fio;
    private String birthdate;
    private String deathdate;
    private String gender;

    public Human(String fio, String birthdate, String deathdate, String gender) {
        this.fio = fio;
        this.birthdate = birthdate;
        this.deathdate = deathdate;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "FamilyTree.Human{" +
                "fio='" + fio + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", deathdate='" + deathdate + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDeathdate() {
        return deathdate;
    }

    public String getGender() {
        return gender;
    }

}