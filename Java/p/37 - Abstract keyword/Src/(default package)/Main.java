import java.util.*;

public class Main {

    public static void main (String[] args) {
        
        // abstract = Abstract classes cannot be instantiated, but they can have a subclass.
        //            Abstract methods are declared without an implementation

        // Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.buy();
    }
}
