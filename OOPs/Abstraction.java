package OOPs;

public class Abstraction {
    public static void main(String args[]) {
        mi m = new mi();
        m.match();
    }
}

abstract class IPL {

    IPL() {
        System.out.println("ipl constructor called");
    }

    abstract void match();
}   

class mi extends IPL {

    mi(){
        System.out.println("mi constructor called.");
    }

    void match() {
        System.out.println("win");
    }
}