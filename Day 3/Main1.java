class Vehicle {
    String type;

    public Vehicle() {
        type="Petrol";
    }
   
}
class Car extends Vehicle
{
    String model;
    double price;
    Car()
    {
        model="BMW";
        price=5000000;
    }
    void display()
    {
        System.out.println("Type of the vehicle: "+type);
        System.out.println("Model of the car: "+model);
        System.out.println("Price of the car: "+price);
    }
}
public class Main1
{
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}