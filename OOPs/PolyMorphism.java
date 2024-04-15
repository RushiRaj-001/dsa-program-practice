package OOPs;

public class PolyMorphism {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.sum(1.5f, 2.5f);
        c.sum(15, 20);
        c.sum(1, 2, 3);

        cow cow = new cow();
        cow.eat();
    }
}

// Compile time Polymorphism (Static)
// Metohd Overloading
class Calculate {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }
}

// Run time Polymorphism (dynamic)
// Method overriding

class Animal {
    void eat() {
        System.out.println("anything");
    }
}

class cow extends Animal {
    void eat() {
        System.out.println("grass");
    }
}