import java.util.*;

public class Main {

    public static void main (String[] args) {
        // method = A block of code that is executed whenever it is called

    //     String name = "George";
    //     int age = 30;
    //     hello(name, age); // hello here is called within a static method 'main'
    //     hello("John", 19);
    //     hello("Princess", 16);

    int x = 3;
    int y = 4;

    int z = add(x, y);

    System.out.println("Sum = " + z);

    }

    // // The static keyword must not neccesarily be added but in this case, we add it because we are calling it from another method which is a static method
    // static void hello(String prop, int age) {
    //     System.out.println("Hello " + prop);
    //     System.out.println("You are " + age);
    // }

    static int add(int x, int y) {
        return x + y;
    }
}