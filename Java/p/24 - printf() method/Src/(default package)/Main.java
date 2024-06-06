import java.util.*;

public class Main {

    public static void main (String[] args) {
        // printf() = An optional method to control, format, and display text to the console window
        //              Two arguments = format string + (object/variable/value)
        //              % [flags] [precision] [width] [conversion-character]

        // System.out.printf("This is a format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Flash";
        int myInt = 40;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("\nHello %10s", myString); // can also be -ve

        // [precision]
        // Sets number of digits of precision when outputting floating-point values
        System.out.printf("\nYou have this much money $%.2f", myDouble);

        // [flags]
        /* adds an effect to output based on the flag added to format specifier
        * - : left-justify
        * + : output a plus ( + ) or minum ( - ) sign for a numeric value
        * 0 : numeric values are zero-padded
        * , : comma grouping seperator if numbers > 1000 
        */
        System.out.printf("\nYou have this much money $%,.2f", myDouble);


    }
}