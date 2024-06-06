import java.util.*;

public class Main {

    public static void main (String[] args) {
        // object = An instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee cup)

        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar.drive();
        myCar.brake();

    }
}