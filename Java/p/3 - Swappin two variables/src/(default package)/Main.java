public class Main {

    public static void main(String[] args) {

        String x = "Water";
        String y = "Juice";

        // Printing the variables without swapping
        System.out.println("Cup x holds " + x);
        System.out.println("Cup y holds " + y);

        // Swapping the variables
        String temp = x; // Temporary variable is used to hold water
        x = y;
        y = temp;

        // Printing variables after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("Cup x now holds " + x);
        System.out.println("Cup y now holds " + y);
    }
}