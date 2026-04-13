public class Car {
    String brand;
    String color;
    int speed;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("This is a " + color + " " + brand + " with a speed of "+ speed + "km/hr");
    }
    void accelerate() {
        speed += 10;
    }
}
