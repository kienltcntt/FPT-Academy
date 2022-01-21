package exercise3;

public class Sedan extends Car {
    public int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() { // If length > 20 feet, 5% discount. Otherwise, 10% discount.
        double salePrice = super.getSalePrice();
        if (length > 20) {
            return salePrice - salePrice * 0.5;
        }
        return salePrice - salePrice * 0.10;
    }

    public String toString() {
        return "Sedan\n" + super.toString() + "\nLength: " + length + " feet";
    }
}
