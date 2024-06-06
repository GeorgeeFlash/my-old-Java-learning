public class Dog extends Animal {

    @Override // It's considered good practive to add the Override method when overriding methods
    void speak() {
        System.out.println("The dog goes *woof*");
    }

}