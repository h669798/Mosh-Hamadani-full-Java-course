package FundamentalsJava;

import java.util.Scanner;

public class ForWhileDoLoops {

    public static void main(String[] args) {

        /*
         * For-loops are often lighter and cleaner,
         * so if we know ahead of time how many times
         * the loop is going to run, use a for-loop instead.
        */
        for (int i = 0; i < 2; i++)
            System.out.println("Hello World!");

        /* Samme som ovenfor, men skrevet som en while-løkke: */
        int i = 0;
        while(i < 2) {
            System.out.println("TIRED!");
            i++;
        }

        /*
        *  A while-loop where we don't know beforehand how many times
        *  we want it to run. We use the "equals" method instead of "=="
        *  since comparison operators don't work on reference data types like String.
        *
        *  We also use the "toLowerCase" method to be able to quit even though the input
        *  has one or more big letters in it. Everything is converted to lower case.
        */
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);

        }

        /*
        *  A do-while loop is used when we want the program to at least execute the
        *  code once by checking the condition last instead of first like in a while-loop,
        *  It will execute even if the condition is false at the very start. Not as often used as while- and for-loop.
        */
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

    }

}
