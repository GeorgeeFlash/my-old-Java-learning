import java.util.*;

public class Main {

    public static void main (String[] args) {
        
        // static = Modifier. Only a single copy of a variable/method is created and shared amongst the whole class.
        //          The class "owns" the static member.

        Friend friend1 = new Friend("Mike");
        Friend friend2 = new Friend("Jacob");
        Friend friend3 = new Friend("Richard");
        Friend friend4 = new Friend("George");
        
        Friend.displayFriends();
    }
}
