import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {

        // Bounded types: You can create the objects of a generic class to have data
        //                of specific derived types ex. Number

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 7);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);

        // These classes wold no longer work
        // MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '^');
        // MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '$');

        ArrayList<String> myFriends = new ArrayList<>();
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        // System.out.println(myChar.getValue());
        // System.out.println(myString.getValue());

    }

}
