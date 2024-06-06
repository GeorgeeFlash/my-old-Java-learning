import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    public static void main(String[] args) {
        
        // exception = An event that occurs during the execution of a program that disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("Result: " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero!!!");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter a number!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This will always run");
            scanner.close();
        }

    } 
}