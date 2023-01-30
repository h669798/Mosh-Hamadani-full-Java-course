package ObjectOrientedProgramming.RefactoredMortageCalculatior;

import java.text.NumberFormat;

public class PrintOut {

    private final NumberFormat currency;
    private Calculations calculator;

    public PrintOut(Calculations calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortage = calculator.calculateMortage();
        String mortageFormatted = currency.format(mortage);
        System.out.println("\nMORTAGE\n" + "--------\n" + "Monthly Payments: " + mortageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE\n" + "----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
        }
    }
