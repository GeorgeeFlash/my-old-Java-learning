// import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        // 2D ArrayList = A dynamic list of lists
        //  You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Gato");
        bakeryList.add("Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList();
        bakeryList.add("Tomatoes");
        bakeryList.add("Spices");
        bakeryList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList();
        bakeryList.add("Malta");
        bakeryList.add("Planet");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(1));

    }
}