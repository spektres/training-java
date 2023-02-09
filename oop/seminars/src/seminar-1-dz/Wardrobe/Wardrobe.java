package Wardrobe;

import java.util.ArrayList;

public class Wardrobe {
    private enum Status {
        open, close
    }

    ;

    private Status status;
    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    private String name;

    public Wardrobe(Status status, String name) {
        this.status = status;
        this.name = name;
    }

    Wardrobe(String name) {
        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Wardrobe.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Wardrobe.names.add(this.name);
        this.status = Status.close;
    }

    public Status getStatus() {
        return status;
    }

    public static int getDefaultIndex() {
        return defaultIndex;
    }

    public static ArrayList<String> getNames() {
        return names;
    }

    public String getName() {
        return name;
    }

    void open() {
        if (this.status == Status.close) {
            this.doorOpen();
            this.status = Status.open;
        } else {
            this.doorClose();
            this.status = Status.close;
        }
    }

    void doorOpen() {
        System.out.println("Дверца шкафа открыта!");
    }

    void doorClose() {
        System.out.println("Дверца шкафа закрыта");
    }
}