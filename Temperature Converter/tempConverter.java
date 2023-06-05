import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {

        /*setup*/
        double celsius, fahrenheit, input;
        char unit, run = 'y';

        while (run == 'y') {
            /*user input*/
            System.out.println("==\nYou appear to be using the TEMP CONVERSION program.\n==");
            System.out.println("Please enter the value you wish to convert: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextDouble();

            System.out.println("Please enter the unit you are converting the value to (c/f): ");
            unit = sc.next().trim().charAt(0);

            /*program output*/

            if (unit == 'c'){
                celsius = (input - 32) / 1.8;
                System.out.println("Conversion: " + input + "far = " + celsius + "cel");
            }
            else if (unit == 'f') {
                fahrenheit = (input * 1.8) + 32;
                System.out.println("Conversion: " + input + "cel = " + fahrenheit + "far");
            }
            else {
                System.out.println("Your selection is not a unit.");
            }

            /*reset*/
            System.out.println("\nEnter y/n to reset the program: ");
            run = sc.next().trim().charAt(0);
        }
        System.out.println("\n** program terminated");
    }
}
