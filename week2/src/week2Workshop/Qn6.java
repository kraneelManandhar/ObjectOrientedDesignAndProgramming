package week2Workshop;

class Vehicl {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Carss extends Vehicl {

    void start() {
        super.start();
        System.out.println("Car is starting...");
    }
}

public class Qn6 {
    public static void main(String[] args) {
        Carss c = new Carss();
        c.start();
    }
}