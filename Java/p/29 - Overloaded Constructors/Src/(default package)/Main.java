import java.util.*;

public class Main {

    public static void main (String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name, but have different params
        //                           Name + parameters = signature

        // Jellof myFood = new Jellof("Ndop Rice", "Sliced beef", 2, "Fresh pepper", "Fresh corn");
        // Jellof myFood = new Jellof("Ndop Rice", "Sliced beef", 2, "Fresh pepper");
        // Jellof myFood = new Jellof("Ndop Rice", "Sliced beef", 2);
        Jellof myFood = new Jellof("Ndop Rice", 2);

        System.out.println("Here are the ingredients of your Jellof");
        System.out.println(myFood.rice);
        System.out.println(myFood.meat);
        System.out.println(myFood.maggi + " Cubes of maggi");
        System.out.println(myFood.pepper);
        System.out.println(myFood.extra);
    }
}