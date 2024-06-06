

public class Main {
    
    public static void main(String[] args) {
        
        // Encapsulation = This is the concept of attributes of a class being hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you don't have a reason to make them public/protected.

        Car car = new Car("Chevrolet", "Camero", 2021);

        // System.out.println(car.make); Cannot be accessed this way since the attributes of Car are private

        // System.out.println(car.getMake());
        // System.out.println(car.getModel());
        // System.out.println(car.getYear());

        // car.year = 2022

        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


    } 
}