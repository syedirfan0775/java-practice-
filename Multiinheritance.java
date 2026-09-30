class Vehicle{
    void start(){
        System.out.println("Starting...");
    }
}
class Car extends Vehicle {
    void move() {
        System.out.println("Moving...");
    }
}
class ElectricCar extends Car{
    void charge(){
        System.out.println("Charging...");
    }
}
public class Multiinheritance {
    public static void main(String[] args){ 
        ElectricCar e = new ElectricCar();
        e.start();
        e.move();
        e.charge();
    } 
}