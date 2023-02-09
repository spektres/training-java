package FamilyTree;

class FamilyMember extends Human {
    private String motherFIO;
    private String fatherFIO;

    public FamilyMember(String fio, String birthdate, String deathdate,
                        String gender, String motherFIO, String fatherFIO) {
        super(fio, birthdate, deathdate, gender);
        this.motherFIO = motherFIO;
        this.fatherFIO = fatherFIO;
    }

    public String getMotherFIO() {
        return motherFIO;
    }

    public String getFatherFIO() {
        return fatherFIO;
    }

    void degreeOfKinship(String FIO) {
        if (FIO.equals(motherFIO)) {
            System.out.println("Я " + getFio() + ", Моя мама " + motherFIO);
        } else if (FIO.equals(fatherFIO)) {
            System.out.println("Я " + getFio() + ", Мой папа " + fatherFIO);
        } else {
            System.out.println("Я " + getFio() + ", Я не знаю своих родителей((( ");
        }


    }
    void showInfo () {
        System.out.printf("Здравствуйте, меня зовут %s, я родился %s, мой пол %s",
                getFio(), getBirthdate(), getGender());
    }
}