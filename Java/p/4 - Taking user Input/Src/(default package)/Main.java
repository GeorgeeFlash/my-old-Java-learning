import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Creating a scanner object or instance

        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // To clear out the scanner
        System.out.println("What is your favorite food: ");
        String food = scanner.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }
}