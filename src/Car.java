public class Car {
    String brand;
    String color;
    int speed;
    static int counter;

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

    void displayInfo() {
        System.out.println("This is a " + color + " " + brand + " with a speed of "+ speed + "km/hr");
    }
    void accelerate() {
        speed += 10;
    }

    static void showCounter() {
        System.out.println("Totally " + counter + " cars are created.");
    }
}
