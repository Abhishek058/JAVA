class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void getcolor() {
        System.out.println(color);
    }

    public void gettype() {
        System.out.println(type);
    }
}

public class classes {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.getcolor();
        pen1.gettype();
    }
}