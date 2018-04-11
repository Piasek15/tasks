package pl.piasecki;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car engine stated");
    }

    public void accelerate(){
        System.out.println("Accelerate form Car class");
    }

    public void brake(){
        System.out.println("Brake form Car class");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Ford extends Car{
    public Ford() {
        super("Ford", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate - Ford");
    }

    @Override
    public void brake() {
        System.out.println("Break - Ford");
    }
}

class Mercedes extends Car{
    public Mercedes() {
        super("Mercedes", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate - Mercedes");
    }

    @Override
    public void brake() {
        System.out.println("Break - Mercedes");
    }
}

class Audi extends Car{
    public Audi() {
        super("Audi", 1);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi(VW) engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate - Audi");
    }

    @Override
    public void brake() {
        System.out.println("Break - Audi");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Default", 100);
        Car car1 = new Ford();
        Car car2 = new Mercedes();
        Car car3 = new Audi();

        car.brake();
        car3.brake();
    }

}
