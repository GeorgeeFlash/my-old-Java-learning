
public class Main {

    public static void main (String[] args) {
        // if statement = a procedure that runs a block of code if its condition evaluates to true

        int age = 20;

        if(age >= 75) {
            System.out.println("Ok Boomer!");
        } else if ( age >= 18) {
            System.out.println("You are a young adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not an adult.");
        }
    }
}