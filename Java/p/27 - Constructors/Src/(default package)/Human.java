public class Human {
    // These are the attributes of this class
    String name;
    int age;
    double weight;
    
    // This is the constructor of this class
    Human(String name, int age, double weight) {
        // The 'this' keyword assigns each attribute to the current instance of the class
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    // We can define methods for this class too
    void eat() {
        System.out.println(this.name + " is eating *yum*");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
}