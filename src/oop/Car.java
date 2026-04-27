package oop;

public class Car {
    private String brand;
    private String color;
    private int speed;
    private static int counter;

    public Car() {
        counter++;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
        counter++;
    }

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        counter++;
    }

    public void displayInfo() {
        System.out.println("This is a " + color + " " + brand + " with a speed of "+ speed + "km/hr");
    }
    public void accelerate() {
        speed += 10;
    }

    public static void showCounter() {
        System.out.println("Totally " + counter + " cars are created.");
    }
}
