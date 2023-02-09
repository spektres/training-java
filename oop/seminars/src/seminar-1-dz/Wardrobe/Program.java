package Wardrobe;

public class Program {
    public static void main(String[] args) {
        Wardrobe shkaf = new Wardrobe("SkafVSPalne");
        Wife Inna = new Wife("Egorova I.I", "Egorov P.E.", false);
        Husband Pasha = new Husband("Egorov P.E.", "Egorova I.I.", true);

        Inna.info();
        Pasha.ShowInfo();

        if (Inna.isAllow()) {
            Inna.doorOpen();
            Pasha.wardrobeOpen();
            shkaf.doorOpen();
        } else {
            Inna.doorClose();
            Pasha.wardrobeClose();
            shkaf.doorClose();
        }

    }
}