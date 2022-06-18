abstract class Animal {
    Animal() {
        System.out.println("new animal created");
    }

    abstract void walk();

    public void eat() {
        System.out.println("Animal Eat");
    }

}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse created");
    }

    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chicken created");
    }

    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        Chicken c = new Chicken();
        c.walk();
    }
}