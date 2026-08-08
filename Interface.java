interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is Starting");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is Starting");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle c = new Car();
        c.start();

        Vehicle b = new Bike();
        b.start();
    }
}
