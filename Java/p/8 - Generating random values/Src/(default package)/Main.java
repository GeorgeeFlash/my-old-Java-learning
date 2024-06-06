import java.util.Random;

public class Main {

    public static void main (String[] args) {
        // These are not true random numbers
        // They are pseudo random numbers which are very close to actual random numbers
        Random random = new Random();

        // int x = random.nextInt(6) + 1;
        // double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}