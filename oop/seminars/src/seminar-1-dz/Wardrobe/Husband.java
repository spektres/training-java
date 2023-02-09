package Wardrobe;

public class Husband extends Human{
    private boolean allowFromWife;

    public Husband(String fio, String partnerName, boolean allowFromWife) {
        super(fio, partnerName);
        this.allowFromWife = allowFromWife;
    }

    public boolean isAllowFromWife() {
        return allowFromWife;
    }

    public void setAllowFromWife(boolean allowFromWife) {
        this.allowFromWife = allowFromWife;
    }
    void ShowInfo() {
        System.out.printf("Меня зовут %s, моя жена %s\n", getFio(), getPartnerName());
    }
    void wardrobeOpen(){
        System.out.println("Я открываю дверцу шкафа...");
    }
    void wardrobeClose(){
        System.out.println("Я закрываю дверцу шкафа...");
    }
}