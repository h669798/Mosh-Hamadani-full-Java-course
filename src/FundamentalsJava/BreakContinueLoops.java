package FundamentalsJava;

import java.util.Scanner;

public class BreakContinueLoops {

    public static void main(String[] args) {

        /*
        * A lot of professionals write code with continue and break statements like these.
        * If your write "pass" the program will start at the top again, and with break it will terminate the program.
        * These will not have any output on the terminal, like "pass" or "quit". It will simply start over or end.
        * It's VERY IMPORTANT to have a break-statement if you are going to use while(true) loops,
        * since it will loop forever and not terminate if not.
        * */
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);

        }
    }
}
