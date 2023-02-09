package Wardrobe;

public class Human {
    private String fio;
    private String partnerName;

    public Human(String fio, String partnerName) {
        this.fio = fio;
        this.partnerName = partnerName;
    }

    public String getFio() {
        return fio;
    }

    public String getPartnerName() {
        return partnerName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fio='" + fio + '\'' +
                ", partnerName='" + partnerName + '\'' +
                '}';
    }


}