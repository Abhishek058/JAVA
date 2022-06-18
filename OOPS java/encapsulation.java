import java.nio.file.Watchable;

abstract class Animal {
    abstract void walk();

}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        Chicken c = new Chicken();
        c.walk();
    }
}