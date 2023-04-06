package LabWork;
class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Vehicle is driving...");
    }
}

class Car extends Vehicle {
    String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("Car is honking...");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, "Blue");
        car.drive(); // Call drive() from Vehicle class
        car.honk(); // Call honk() from Car class
    }
}

