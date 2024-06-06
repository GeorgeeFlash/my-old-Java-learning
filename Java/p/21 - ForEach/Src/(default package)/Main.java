import java.util.*;

public class Main {

    public static void main (String[] args) {
        // for-each = Traversing technnique to iterate throuch the elements in an array/collection
        //            Less steps, more readable
        //             Less flexible

        // String[] animals = {"cat", "dog", "Parot", "Pig"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Parot");
        animals.add("Pig");

        for(String i : animals) {
            System.out.println(i);
        }

    }
}