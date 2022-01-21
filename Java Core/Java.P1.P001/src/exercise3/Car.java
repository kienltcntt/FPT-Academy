package exercise3;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public double getSalePrice() {
        return regularPrice;
    }

    public Car() {
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
