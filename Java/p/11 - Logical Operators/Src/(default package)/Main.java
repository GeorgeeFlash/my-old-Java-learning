import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        /* logical operators = logical conditions used to connect two or more expressions
        *                       && = (AND) both condition must be true
        *                       || = (OR) either conditions must be true
        *                       ! = (NOT) reverses boolean value of condition
        */

    //    int temp = 25;

    //    if(temp > 30) {
    //         System.out.println("It is hot outside");
    //    } else if (temp >=20 && temp <= 30) {
    //         System.out.println("It is warm outside");
    //    } else {
    //         System.out.println("It is cold outside");
    //    }

    // Scanner scanner = new Scanner(System.in);

    // System.out.println("You are playing a game! Press q or Q to quit");
    // String response = scanner.next();

    // if(response.equals("q") || response.equals("Q")) {
    //     System.out.println("You quit the game");
    // } else {
    //     System.out.println("You are still playing the game!");
    // }

    // }

    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit");
    String response = scanner.next();

    if(!response.equals("q") && !response.equals("Q")) {
        System.out.println("You are still playing the game!");
    } else {
        System.out.println("You quit the game");
    }

    }
}