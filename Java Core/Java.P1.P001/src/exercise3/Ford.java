package exercise3;

public class Ford extends Car {
    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice()-(super.getSalePrice()*((double)manufacturerDiscount/100.0));
    }

    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                '}';
    }
}
