package Wardrobe;

public class Wife extends Human {
    private boolean allow;

    public Wife(String fio, String partnerName, boolean allow) {
        super(fio, partnerName);
        this.allow = allow;
    }

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }

    void allowOpen(boolean allow) {
        if(allow == true){
            allow = false;
        } else {
            allow = true;
        }
    }

    void info() {
        System.out.printf("Меня зовут %s, мой муж %s\n", getFio(), getPartnerName());
    }
    void doorOpen(){
        System.out.println("Открой дверцу шкафа пожалуйста");
        allowOpen(true);
    }
    void doorClose(){
        System.out.println("Закрой дверцу шкафа пожалуйста");
        allowOpen(false);
    }
}
