package FundamentalsJava;

import java.util.Scanner;

public class ExerciseFizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        long number = scanner.nextLong();

        /* Remember to put the most specific case on top,
        *  since the program will only evaluate if the first one
        *  is true, and not run the rest if it is the case. */
        if(number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);

    }

}
