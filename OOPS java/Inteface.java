interface Animal {
    int eye = 2;

    public void walk();
    // should not have abstract function
    // no constructor no function
}

interface Herbivore {
    static String food = "Grass";
}

class Horse implements Animal, Herbivore {// multiple inheritance is done by interface not by class in java
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

public class Inteface {
    public static void main(String[] args) {

    }
}