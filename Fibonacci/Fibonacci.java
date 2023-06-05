import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

    
        char run = 'y';
        while (run == 'y') {
            System.out.println("-- -- --\nYou appear to be using our FIBONACCI program.\n-- -- --");

            /*user input*/
            Scanner sc = new Scanner(System.in);
            System.out.println("Please specify the needed number of Fibonacci terms:\n->");
            int n = sc.nextInt(); //length of the series

            /*program output*/
            int i = 0, j = 1, nextTerm;
            System.out.println("\nFibonacci series is... ");
            for (int c = 0; c < n; c++)
            {
                if (c <= 1) //equals 0, then 1
                    nextTerm = c;
                else {
                    nextTerm = i + j;
                    i = j;
                    j = nextTerm;
                }
                System.out.println(nextTerm);
            }
            System.out.println("\nEnter y/n to run the FIBONACCI program again.");
            run = sc.next().trim().charAt(0);
        }
        System.out.println("\n--program terminated--");
    }
}