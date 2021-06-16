package someBasics.polimorph;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle x : racers) {
           x.go();

        }
    }
}
