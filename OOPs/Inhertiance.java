package OOPs;

public class Inhertiance {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color();
        System.out.println(c1.year());

        audi m4 = new audi();
        m4.wheel = 4;

        bike b1 = new bike();
        b1.wheel = 2;
        System.out.println(m4.wheel);
        System.out.println(b1.wheel);
    }
}

class vehicle {
    int wheel;

    void color() {
        System.out.println("red");
    }
}

class car extends vehicle {
    String model;

    int year() {
        return 2300;
    }
}

class bike extends vehicle {

}

class audi extends car {
    int price;
}