
public class Main {

    public static void main (String[] args) {
        
        // super = It refers to the superclass (parant) of an object.
        //         Very similar to the 'this' keyword.

        Hero hero1 = new Hero("Batman", 42, "Money $$$, Tech, Intelligence and combat");
        Hero hero2 = new Hero("Superman", 43, "Super strength, Heat vision, Freeze breath, Super Speed and Flight");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();
        // System.out.println(hero2.name);
        // System.out.println(hero2.age);
        // System.out.println(hero2.power);

        System.out.println(hero2.toString());

    }
}
