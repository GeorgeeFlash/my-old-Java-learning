import java.util.*;

public class Main {

    public static void main (String[] args) {
        // overloaded methods = Methods that share the same name but have different parameters
        //                      Method name = parameters = method signature

        int a = add(3, 7, 10, 14);
        double b = add(3.0, 7.0, 10.0, 14.0);

        System.out.println(a);
        System.out.println(b);

    }

    static int add(int x, int y) {
        System.out.println("This is overloaded method #1");
        return x + y;
    }
    static int add(int x, int y, int z) {
        System.out.println("This is overloaded method #2");
        return x + y + z;
    }
    static int add(int w, int x, int y, int z) {
        System.out.println("This is overloaded method #3");
        return w + x + y + z;
    }
    static double add(double x, double y) {
        System.out.println("This is overloaded method #4");
        return x + y;
    }
    static double add(double x, double y, double z) {
        System.out.println("This is overloaded method #5");
        return x + y + z;
    }
    static double add(double w, double x, double y, double z) {
        System.out.println("This is overloaded method #6");
        return w + x + y + z;
    }
}