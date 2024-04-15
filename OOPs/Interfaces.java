package OOPs;

public class Interfaces {
    public static void main(String args[]) {
        bear b = new bear();
        b.eat();
        b.hunt();
    }
}

interface Herbivores {

    void eat();
}

interface Carnivores {
    void hunt();
}

class bear implements Herbivores, Carnivores {
    public void eat() {
        System.out.println("grass");
    }

    public void hunt() {
        System.out.println("meat");
    }
}