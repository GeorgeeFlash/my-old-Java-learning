public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    // Overiding the toString() method
    public String toString() {

        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}