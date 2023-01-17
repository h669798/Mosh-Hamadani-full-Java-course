package FundamentalsJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 10_000, 10_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years  = (byte) readNumber("Downpayment period (years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);

    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortage = calculateMortage(principal, annualInterest, years);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("\nMORTAGE\n" + "--------\n" + "Monthly Payments: " + mortageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println("\nPAYMENT SCHEDULE\n" + "----------------");
        for(Short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {

        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            else
                System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;

    }

    public static double calculateMortage(
            int principal,
            float annualInterest,
            byte years
    ) {
        float convertedInterestRate = (annualInterest/PERCENT)/MONTHS_IN_YEAR;
        short monthlyPayment = (short) (years*MONTHS_IN_YEAR);
        double mortage = principal
                * (convertedInterestRate * Math.pow(1 + convertedInterestRate, monthlyPayment))
                /(Math.pow(1 + convertedInterestRate, monthlyPayment) - 1);

        return mortage;

    }


    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short paymentsMade
    ) {
        float convertedInterestRate = (annualInterest/PERCENT)/MONTHS_IN_YEAR;
        short monthlyPayment = (short) (years*MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + convertedInterestRate, monthlyPayment) - Math.pow(1 + convertedInterestRate, paymentsMade))
                / (Math.pow(1 + convertedInterestRate, monthlyPayment) - 1);

        return balance;

    }

}