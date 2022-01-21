package exercise3;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        //-Create an instance of Toyota class and initialize all the fields with appropriate values.
        //Use super (...)method in the constructor for initializing the fields of the super class.
        Truck toyota = new Truck(200, 40000, "Red", 15);
        //-Create two instances of the Nissan class and initialize all the fields with appropriate values.
        //Use super(...) method in the constructor for initializing the fields of the super class.
        Ford nissan = new Ford(250, 60000, "Black", 2015, 5);
        Sedan pickup = new Sedan(180, 55000, "Yellow", 1500);
        //-Create an instance of car class and initialize all the fields with appropriate values.
        Car car = new Car(250, 35000, "Blue");
        //Display the sale prices of all instance.
        System.out.println(toyota.toString());
        System.out.println("The sale price: $" + toyota.getSalePrice() + "\n\n");
        System.out.println(nissan.toString());
        System.out.println("The sale price: $" + nissan.getSalePrice() + "\n\n");
        System.out.println(pickup.toString());
        System.out.println("The sale price: $" + pickup.getSalePrice() + "\n\n");
        System.out.println(toyota.toString());
        System.out.println("The sale price: $" + toyota.getSalePrice() + "\n\n");
        System.out.println("Csar\n" + car.toString());
        System.out.println("The sale price: $" + car.getSalePrice() + "\n\n");
    }
}

