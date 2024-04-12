package OOPs;

public class OOP {

    public static void main(String[] args) {
        Car c1 = new Car("merc",200000);
        int price = c1.setPrice(20);
        System.out.println(price);
        System.out.println(c1.model);

        Car c2 = new Car(c1);
        System.out.println(c2.model);
    }
}

class Car {

     String model;
    private int price;

    Car(Car c1){
        this.model = c1.model;
    }

    Car(String model,int price){
        this.model = model;
        this.price = price;
        System.out.println("....");

    }

    String setModel(String md){
        this.model = md;
        return this.model;
    }


    int setPrice(int price) {
        this.price = price;
        return this.price;
    }
}

