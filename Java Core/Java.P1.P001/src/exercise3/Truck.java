package exercise3;

public class Truck extends Car {
    private int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() { //If weight>2000,10% discount. Otherwise, 20% discount.
        double salePrice = super.getSalePrice();
        if(weight > 2000) {
            return salePrice = salePrice * 1.1;
        } else {
            return salePrice = salePrice * 2.0;
        }
    }

    @Override
    public String toString() {
        return "Pickup\n"+super.toString()+"\nWeight: "+weight;
    }
}


