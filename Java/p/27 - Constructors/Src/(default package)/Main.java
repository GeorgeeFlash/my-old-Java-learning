import java.util.*;

public class Main {

    public static void main (String[] args) {
        // constructor = A Special method that is called when an object is instantiated (created)

        // This are instances of the 'Human' class
        Human human = new Human("Kevin", 65, 70);
        Human human2 = new Human("Glen", 16, 50);

        System.out.println(human.name);
        human.drink();
        System.out.println(human2.name);
        human2.eat();



    }
}