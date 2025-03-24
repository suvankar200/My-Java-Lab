/*
 * write a java program to implement a single interface in 3 child class.
 * write the Main class to define the Main method to create object of three classes and call the method of accordly.
 *  */

 // Defining the Vehicle interface
interface Vehicle {
    void gearChange();
    void brake();
    void speedUp();
}

// Implementing the Vehicle interface in the Car class
class Car implements Vehicle {
    String model;

    Car(String model) {
        this.model = model;
    }

    public void gearChange() {
        System.out.println("Car " + model + " is changing gears.");
    }

    public void brake() {
        System.out.println("Car " + model + " is applying brakes.");
    }

    public void speedUp() {
        System.out.println("Car " + model + " is speeding up.");
    }
}

// Implementing the Vehicle interface in the Cycle class
class Cycle implements Vehicle {
    String brand;

    Cycle(String brand) {
        this.brand = brand;
    }

    public void gearChange() {
        System.out.println("Cycle " + brand + " is changing gears.");
    }

    public void brake() {
        System.out.println("Cycle " + brand + " is applying brakes.");
    }

    public void speedUp() {
        System.out.println("Cycle " + brand + " is speeding up.");
    }
}

// Implementing the Vehicle interface in the Bike class
class Bike implements Vehicle {
    int mileage;

    Bike(int mileage) {
        this.mileage = mileage;
    }

    public void gearChange() {
        System.out.println("Bike with mileage " + mileage + " is changing gears.");
    }

    public void brake() {
        System.out.println("Bike with mileage " + mileage + " is applying brakes.");
    }

    public void speedUp() {
        System.out.println("Bike with mileage " + mileage + " is speeding up.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating objects of each class and calling their methods
        Car car = new Car("Tesla Model 3");
        Cycle cycle = new Cycle("Hero");
        Bike bike = new Bike(45);

        // Calling the methods
        car.gearChange();
        car.brake();
        car.speedUp();

        System.out.println(); // Line break for clarity

        cycle.gearChange();
        cycle.brake();
        cycle.speedUp();

        System.out.println(); // Line break for clarity

        bike.gearChange();
        bike.brake();
        bike.speedUp();
    }
}



